package linda.search.concurrent;

import linda.*;
import java.util.Arrays;
import java.util.UUID;

public class Searcher implements Runnable {

    private Linda linda;
    private volatile Boolean kill=false;
    private volatile Boolean fin=false;
    private int indice=0;
    public Searcher(int num,Linda linda) {
        this.linda = linda;
        indice=num;
    }

    public void stop(){
        kill=true;
    }

    public void run() {
        while(!kill){
            fin=false;
            System.out.println(indice+") Ready to do a search");
            linda.debug(indice+" : avant take:");
            Tuple treq = linda.take(new Tuple(Code.Request, UUID.class, String.class));//cherche un requete pour la traiter 
            //(la retire pour que les autres chercheurs se bloquent sur cette partie ou prennent une autre requete)
            //pour qu'ils ne puissent pas altérer nbValeurDejaTraite associé à cette requete

            linda.debug(indice+" : apres take:");
            UUID reqUUID = (UUID)treq.get(1);
            String req = (String) treq.get(2);
            linda.write( new Tuple(Code.RequetePriseEnCharge, reqUUID));
            Tuple tK=linda.tryRead( new Tuple(Code.nbValeurDejaTraite, reqUUID, Integer.class));//verifier si nbValeurDejaTraite a déja été posé par un chercheur ou si c'est la première fois
            if (tK==null){
                linda.write( new Tuple(Code.nbValeurDejaTraite, reqUUID, 0));
            }
            linda.write(treq);

            System.out.println(indice+") Looking for: " + req);

            linda.eventRegister(Linda.eventMode.TAKE, Linda.eventTiming.IMMEDIATE, new Tuple(Code.nbValeurDejaTraite, reqUUID, Integer.class), new reserverValeur(req));

            while(!fin){
                try {
                      Thread.sleep(10);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  
            }
            System.out.println(indice+") End of looking for: " + req);
            linda.write( new Tuple(Code.FinPriseEnCharge, reqUUID));
        }
    }
    
    /*****************************************************************/


    private class reserverValeur implements linda.Callback {
        private String req;

        public reserverValeur(String r){
            req=r;
        }

        public void call(Tuple t) {  // [ Result, ?UUID, ?String, ?Integer ]
            int k=(Integer)t.get(2);
            UUID reqUUID = (UUID)t.get(1);
            int taille=(Integer)(linda.tryRead(new Tuple(Code.Taille,Integer.class)).get(1));
            if(k>=taille){
                //System.out.println(indice+") out of range : "+k+" ? "+taille);
                linda.write( new Tuple(Code.nbValeurDejaTraite, reqUUID, k));
                fin=true;
            } else {
                //System.out.println(indice+ ") not out of rande : "+k+" ? "+taille);
                linda.write( new Tuple(Code.nbValeurDejaTraite, reqUUID, k+1));

                linda.eventRegister(Linda.eventMode.READ, Linda.eventTiming.IMMEDIATE, new Tuple(k,Code.Value, String.class), new traiter(req,reqUUID));
                linda.eventRegister(Linda.eventMode.TAKE, Linda.eventTiming.IMMEDIATE, new Tuple(Code.nbValeurDejaTraite, reqUUID, Integer.class), this);
            }

           
        }
    }
    
    private class traiter implements linda.Callback {
        private String req;
        private UUID reqUUID;

        public traiter(String r,UUID ID){
            req=r;
            reqUUID=ID;
        }

        public void call(Tuple tv) {  // [ Result, ?UUID, ?String, ?Integer ]
            String val = (String) tv.get(2);
            int dist = getLevenshteinDistance(req, val);
            //System.out.println(indice+") traite : "+ tv);
            if (dist < 10) { // arbitrary
                linda.write(new Tuple(Code.Result, reqUUID, val, dist)); // si trouvé on pose le resultat
            }
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

