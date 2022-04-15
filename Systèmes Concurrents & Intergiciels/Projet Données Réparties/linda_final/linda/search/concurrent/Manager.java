package linda.search.concurrent;

import java.util.UUID;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;
import linda.*;

public class Manager implements Runnable {

    private Linda linda;

    private UUID reqUUID;
    private String pathname;
    private String search;
    private int bestvalue = Integer.MAX_VALUE; // lower is better
    private String bestresult;
    private volatile Integer nbChercheur=0;
    private int indice=0;

    public Manager(int num,Linda linda, String pathname, String search) {
        this.linda = linda;
        this.pathname = pathname;
        this.search = search;
        indice=num;
    }

    
    public Manager(int num,Linda linda, String search) {
        this.linda = linda;
        this.search = search;
        indice=num;
    }

    private void addSearch(String search) {
        this.search = search;
        this.reqUUID = UUID.randomUUID();
        System.out.println(indice+") Search " + this.reqUUID + " for " + this.search);
        linda.eventRegister(Linda.eventMode.TAKE, Linda.eventTiming.IMMEDIATE, new Tuple(Code.Result, this.reqUUID, String.class, Integer.class), new CbGetResult());
        linda.eventRegister(Linda.eventMode.TAKE, Linda.eventTiming.IMMEDIATE, new Tuple(Code.RequetePriseEnCharge, this.reqUUID), new priseEnCharge());
        linda.write(new Tuple(Code.Request, this.reqUUID, this.search));
    }


    private void loadData(String pathname) {

        

        try (Stream<String> stream = Files.lines(Paths.get(pathname))) {
            Object[] tempArray=stream.limit(3).toArray();
            
            Integer i=0;
            Tuple temp=linda.take(new Tuple(Code.Taille,Integer.class));
            if (temp==null) {
                linda.write(new Tuple(Code.Taille,tempArray.length));
            }
            else { 
                i = (Integer)temp.get(1);
                linda.write(new Tuple(Code.Taille,i+tempArray.length));
            }
        
            for (Object s: tempArray){
                linda.write(new Tuple(i,Code.Value, ((String)s).trim()));
                i++;
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private void waitForEndSearch() {
        while(nbChercheur==0);// On attend qu'un chercheur prends en charge notre requete
        System.out.println(indice+") nbChercheur!=0");
        while(nbChercheur!=0);// On attend que les chercheurs qui traitent notre requete finissent
        //linda.take(new Tuple(Code.Searcher, "done", this.reqUUID));
        System.out.println(indice+") nbChercheur=0");
        linda.take(new Tuple(Code.Request, this.reqUUID, String.class)); // remove query

        System.out.println(indice+") query done");
    }

    private class CbGetResult implements linda.Callback {
        public void call(Tuple t) {  // [ Result, ?UUID, ?String, ?Integer ]
            String s = (String) t.get(2);
            Integer v = (Integer) t.get(3);
            //System.out.println(indice+") un resultat a ete depose : "+v+" ? "+bestvalue);
            if (v < bestvalue) {
                bestvalue = v;
                bestresult = s;
                System.out.println(indice+") New best (" + bestvalue + "): \"" + bestresult + "\"");
            }
            linda.eventRegister(Linda.eventMode.TAKE, Linda.eventTiming.IMMEDIATE, new Tuple(Code.Result, reqUUID, String.class, Integer.class), this);
        }
    }

    private class priseEnCharge implements linda.Callback {
        public void call(Tuple t) {  // [ Result, ?UUID, ?String, ?Integer ]
          nbChercheur++;
          linda.eventRegister(Linda.eventMode.TAKE, Linda.eventTiming.IMMEDIATE, new Tuple(Code.FinPriseEnCharge, reqUUID), new finPriseEnCharge());
          //System.out.println("relache");
        }
    }

    private class finPriseEnCharge implements linda.Callback {
        public void call(Tuple t) {  // [ Result, ?UUID, ?String, ?Integer ]
          nbChercheur--;
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
