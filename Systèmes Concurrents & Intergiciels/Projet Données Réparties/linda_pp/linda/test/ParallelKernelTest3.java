package linda.test;

import linda.*;

public class ParallelKernelTest3 {

    public static void main(String[] a) {
    	for(int p=0;p<4;p++) {
        int n =5;
        int m = 1000;
        System.out.println("Executing with "+n+" thread(s), for "+m+" iterations");
        final Linda linda = new linda.shm.CentralizedLindaUpgrade(n);
        // final Linda linda = new linda.server.LindaClient("//localhost:4000/aaa");
        
        for(int i =0; i<m; i++) {
	        Tuple motif = new Tuple(i,"foo");
	        //Tuple res1 = linda.read(motif);
	        linda.write(motif);
        }
       /* linda.debug("z");
        long t0 = System.currentTimeMillis();
	    for (int i=0;i<m;i++) {
	        Tuple motif = new Tuple(Integer.class,"foo");
	        //Tuple res1 = linda.read(motif);
	        Tuple res1 = linda.read(motif);

		    //System.out.println("toz");
		    //System.out.println("(1) Resultat:" + res1);
		                
		   //linda.debug("(1)");
	   }
	   System.out.println("(reader "+1+")Finish Time "+(System.currentTimeMillis()-t0)+" ms.");
	   */
       long t1 = System.currentTimeMillis();
	   for (int i=0;i<m;i++) {
	        Tuple motif = new Tuple(Integer.class,String.class);
	        //Tuple res1 = linda.read(motif);
	        Tuple res1 = linda.take(motif);
	        System.out.println(i);
		    //System.out.println("toz");
		    //System.out.println("(1) Resultat:" + res1);
		                
		   //linda.debug("(1)");
	   }
	   System.out.println("(taker "+1+")Finish Time "+(System.currentTimeMillis()-t1)+" ms.");
        
    }
    }
    public static void sleep() {
        try {
        	Thread.sleep(10000);
        } catch  (Exception e) {
        	
        }
    }
}
