package linda.search.concurrentServer;

import java.util.UUID;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;
import linda.*;
import linda.server.LindaClient;

public class Manager extends LindaClient implements Runnable {


    private UUID reqUUID;
    private String pathname;
    private String search;
    private int bestvalue = Integer.MAX_VALUE; // lower is better
    private String bestresult;
    private volatile Integer nbChercheur=0;
    private int indice=0;
    private Timer timeoutTimer;
    private volatile boolean aborted=false;

    private final int delay=10000;

    public Manager(int num,String serverURI, String pathname, String search) {
        super(serverURI);
        this.pathname = pathname;
        this.search = search;
        indice=num;
        timeoutTimer=new Timer();
    }

    
    public Manager(int num,String serverURI, String search) {
        this(num,serverURI,null,search);
    }

    private void addSearch(String search) {
        this.search = search;
        this.reqUUID = UUID.randomUUID();
        eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, new Tuple(Code.Result, this.reqUUID, String.class, Integer.class), new AsynchronousCallback( new CbGetResult()));
        eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, new Tuple(Code.RequetePriseEnCharge, this.reqUUID), new AsynchronousCallback( new priseEnCharge()));
        write(new Tuple(Code.Request, this.reqUUID, this.search));
        timeoutTimer.schedule(new timeoutRunnable(),  delay);
        System.out.println("M"+indice+") Search " + this.reqUUID + " for " + this.search);
    }


    private void loadData(String pathname) {

        System.out.println("M"+indice+") Charge les donnees");

        try (Stream<String> stream = Files.lines(Paths.get(pathname))) {
            Object[] tempArray=stream.limit(1000).toArray();
            
            Integer i=0;
            Tuple temp=take(new Tuple(Code.Taille,Integer.class));
            if (temp!=null) { 
                i = (Integer)temp.get(1);
            }
            
            
            for (Object s: tempArray){
                write(new Tuple(i,Code.Value, ((String)s).trim()));
                i++;
            }

            write(new Tuple(Code.Taille,i));

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private void waitForEndSearch() {
        while(nbChercheur==0);// On attend qu'un chercheur prends en charge notre requete
        //System.out.println("nbChercheur!=0");
        while(nbChercheur!=0);// On attend que les chercheurs qui traitent notre requete finissent
        //take(new Tuple(Code.Searcher, "done", this.reqUUID));
       // System.out.println("nbChercheur=0");

        if(!aborted){
            take(new Tuple(Code.Request, this.reqUUID, String.class)); // remove query
            System.out.println("M"+indice+") query done");
        } else{
            take(new Tuple(Code.Annuler,reqUUID));
        }

        take(new Tuple(Code.estEnTraitement, this.reqUUID)); // remove query
    }

    private class CbGetResult implements Callback {
        public void call(Tuple t) {  // [ Result, ?UUID, ?String, ?Integer ]
            String s = (String) t.get(2);
            Integer v = (Integer) t.get(3);
            //System.out.println("M"+indice+") un resultat a ete depose : "+v+" ? "+bestvalue);
            if (v < bestvalue) {
                bestvalue = v;
                bestresult = s;
                //System.out.println("M"+indice+") New best (" + bestvalue + "): \"" + bestresult + "\"");
            }
            eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, new Tuple(Code.Result, reqUUID, String.class, Integer.class), new AsynchronousCallback(this) );
        }
    }

    private class priseEnCharge implements Callback {
        public void call(Tuple t) {  // [ Result, ?UUID, ?String, ?Integer ]
          nbChercheur++;
          //System.out.println("relachea");
          eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, new Tuple(Code.FinPriseEnCharge, reqUUID), new AsynchronousCallback( new finPriseEnCharge()));
          //System.out.println("relache");
        }
    }

    private class finPriseEnCharge implements Callback {
        public void call(Tuple t) {  // [ Result, ?UUID, ?String, ?Integer ]
          nbChercheur--;
        }
    }

    private class timeoutRunnable extends TimerTask {
        public void run() { 
            aborted=true;
            take(new Tuple(Code.Request, reqUUID, String.class)); // remove query
            write(new Tuple(Code.Annuler,reqUUID));
           
            System.out.println("M"+indice+") query aborted");
        }
    }

    public void run() {
        if (pathname!=null){
            this.loadData(pathname);
        } 
        this.addSearch(search);
        this.waitForEndSearch();
    
    }
}
