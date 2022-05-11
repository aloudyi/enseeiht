package linda.test;

import java.util.ArrayList;
import java.util.Collections;

import linda.*;

public class ParallelKernelTest2 {

    public static void main(String[] a) {
    	for(int p=0;p<4;p++) {
    		int n = 2;
            int m = 10000;
            System.out.println("Executing with "+n+" thread(s), for "+m+" iterations");
            final Linda linda = new linda.shm.CentralizedLindaUpgrade(n);
            // final Linda linda = new linda.server.LindaClient("//localhost:4000/aaa");
            long t0 = System.currentTimeMillis();
            
            ArrayList<Integer> indexList = new ArrayList<Integer>();
            for (int i=0;i<m;i++) {
                indexList.add(i);
            }
            Collections.shuffle(indexList);
            for(int i=0; i<4;i++) {
            	final int j = i+1;
    	        
    	                for (int k=0;k<m;k++) {
    		                Tuple motif = new Tuple(indexList.get(k),"foo");
    		                linda.write(motif);
    		           //     System.out.println("(1) Resultat:" + res);
    		                //linda.debug("(1)");
    	                }
    	                System.out.println("(writer "+j+")Finish Time "+(System.currentTimeMillis()-t0)+" ms.");
    	            
            }
            
       
               // Tuple motif = new Tuple(Integer.class, String.class);
                for (int i=0;i<m;i++) {

                	//System.out.println("\ntake for: " + i);
                    Tuple res = linda.take(new Tuple(i, "foo"));
                    //System.out.println("(1) Resultat:" + res);
                    //linda.debug("(1)");
                }
                System.out.println("(reader 1)Finish Time "+(System.currentTimeMillis()-t0)+" ms.");
                
            
        }
    	}
        
}
