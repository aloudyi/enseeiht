package linda.search.concurrentServer;

import java.util.Arrays;
import java.util.UUID;

import linda.AsynchronousCallback;
import linda.Callback;
import linda.Tuple;
import linda.server.LindaClient;

public class Searcher extends LindaClient implements Runnable {

    private volatile Boolean kill=false;
    private volatile Boolean fin=false;
    private int indice=0;
    private int taille=0;

    public Searcher(int num,String serverURI) {
        super(serverURI);
        indice=num;
    }

    public void stop(){
        kill=true;
    }

    public void run() {
        eventRegister(eventMode.READ, eventTiming.IMMEDIATE, new Tuple(Code.Taille,Integer.class), new AsynchronousCallback( new changerTaille() ));
        while(!kill){
            fin=false;
            System.out.println("S"+indice+") Ready to do a search");
            Tuple treq = take(new Tuple(Code.Request, UUID.class, String.class));//cherche un requete pour la traiter 
            //(la retire pour que les autres chercheurs se bloquent sur cette partie ou prennent une autre requete)
            //pour qu'ils ne puissent pas altérer nbValeurDejaTraite associé à cette requete
            
            UUID reqUUID = (UUID)treq.get(1);
            String req = (String) treq.get(2);
            //System.out.println("S"+indice+") write prise en charge ET take ok  : ");
            write( new Tuple(Code.RequetePriseEnCharge, reqUUID));
            
            eventRegister(eventMode.READ, eventTiming.IMMEDIATE, new Tuple(Code.Annuler,reqUUID), new AsynchronousCallback( new annuler(reqUUID) ));

           // System.out.println("S"+indice+") try read  : ");
            Tuple tK=tryRead( new Tuple(Code.estEnTraitement, reqUUID));//verifier si nbValeurDejaTraite a déja été posé par un chercheur ou si c'est la première fois
           // System.out.println("S"+indice+") try read ok");
            if (tK==null){
                write( new Tuple(Code.estEnTraitement, reqUUID)); // a supprimer a la fin
                write( new Tuple(Code.nbValeurDejaTraite, reqUUID, 0));
            }
            write(treq);

            System.out.println("S"+indice+") Looking for: " + req);

            eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, new Tuple(Code.nbValeurDejaTraite, reqUUID, Integer.class), new AsynchronousCallback( new reserverValeur(req) ));

            while(!fin){
                  try {
                      Thread.sleep(10);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  
            }
            System.out.println("S"+indice+") End of looking for: " + req);
            write( new Tuple(Code.FinPriseEnCharge, reqUUID));
        }
    }
    

    /*****************************************************************/


    private class reserverValeur implements Callback {
        private String req;

        public reserverValeur(String r){
            req=r;
        }

        public void call(Tuple t) {
            int k=(Integer)t.get(2);
            UUID reqUUID = (UUID)t.get(1);
            if(k>=taille){
                System.out.println("S"+indice+") out of range : "+k+" ? "+taille);
                write( new Tuple(Code.nbValeurDejaTraite, reqUUID, k));
                fin=true;
            } else {
                /* System.out.println("S"+indice+ ") not out of rande : "+k+" ? "+taille);
                write( new Tuple(Code.nbValeurDejaTraite, reqUUID, k+100));
                for (int i=0;i<100;i++){
                    Tuple tv=tryRead(new Tuple(k+i,Code.Value, String.class));
                    if(tv==null){break;}
                    String val = (String) tv.get(2);
                    int dist = getLevenshteinDistance(req, val);
                    //System.out.println("S"+indice+") traite : "+ tv);
                    if (dist < 10) { // arbitrary
                        write(new Tuple(Code.Result, reqUUID, val, dist)); // si trouvé on pose le resultat
                    }
               }
                //eventRegister(eventMode.READ, eventTiming.IMMEDIATE, new Tuple(k,Code.Value, String.class), new AsynchronousCallback( new traiter(req,reqUUID) ));
                eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, new Tuple(Code.nbValeurDejaTraite, reqUUID, Integer.class), new AsynchronousCallback( this ));*/ 

             // System.out.println("S"+indice+ ") not out of rande : "+k+" ? "+taille);
                write( new Tuple(Code.nbValeurDejaTraite, reqUUID, k+1));
             
                eventRegister(eventMode.READ, eventTiming.IMMEDIATE, new Tuple(k,Code.Value, String.class), new AsynchronousCallback( new traiter(req,reqUUID) ));
                eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, new Tuple(Code.nbValeurDejaTraite, reqUUID, Integer.class), new AsynchronousCallback( this ));
            }

           
        }
    }
    
    private class traiter implements Callback {
        private String req;
        private UUID reqUUID;

        public traiter(String r,UUID ID){
            req=r;
            reqUUID=ID;
        }

        public void call(Tuple tv) {  
            String val = (String) tv.get(2);
            int dist = getLevenshteinDistance(req, val);
            //System.out.println("S"+indice+") traite : "+ tv);
            if (dist < 10) { // arbitrary
                write(new Tuple(Code.Result, reqUUID, val, dist)); // si trouvé on pose le resultat
            }
        }
    }

    private class changerTaille implements Callback {
     
        public void call(Tuple t) {  
           taille=(Integer)t.get(1);
           eventRegister(eventMode.READ, eventTiming.FUTURE, new Tuple(Code.Taille,Integer.class), new AsynchronousCallback(this ));
        }
    }

    private class annuler implements Callback {
        private UUID reqUUID;

        public annuler(UUID ID){
            
            reqUUID=ID;
        }
        public void call(Tuple t) { 
            System.out.println("S"+indice+") requete abandonnee");
            tryTake(new Tuple(Code.nbValeurDejaTraite, reqUUID, Integer.class));
            write( new Tuple(Code.FinPriseEnCharge, reqUUID));
            fin=true; 
        }
    }
    
    /*****************************************************************/
    /* Levenshtein distance is rather slow */
    /* Copied from https://www.baeldung.com/java-levenshtein-distance */
    static int getLevenshteinDistance(String x, String y) {
        int[][] dp = new int[x.length() + 1][y.length() + 1];
        for (int i = 0; i <= x.length(); i++) {
            for (int j = 0; j <= y.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else if (j == 0) {
                    dp[i][j] = i;
                }
                else {
                    dp[i][j] = min(dp[i - 1][j - 1] 
                                   + costOfSubstitution(x.charAt(i - 1), y.charAt(j - 1)), 
                                   dp[i - 1][j] + 1, 
                                   dp[i][j - 1] + 1);
                }
            }
        }
        return dp[x.length()][y.length()];
    }

    private static int costOfSubstitution(char a, char b) {
        return a == b ? 0 : 1;
    }

    private static int min(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }

}

