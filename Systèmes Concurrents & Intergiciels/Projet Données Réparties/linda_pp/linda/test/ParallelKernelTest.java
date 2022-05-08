package linda.test;

import linda.*;

public class ParallelKernelTest {

    public static void main(String[] a) {
        int n = 3;
        int m = 1000;
        System.out.println("Executing with "+n+" thread(s), for "+m+" iterations");
        final Linda linda = new linda.shm.CentralizedLindaUpgrade(n);
        // final Linda linda = new linda.server.LindaClient("//localhost:4000/aaa");
        long t0 = System.currentTimeMillis();
        
        for(int i=0; i<4;i++) {
        	final int j = i+1;
	        new Thread() {
	            public void run() {
	                try {
	                    Thread.sleep(1);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                for (int i=0;i<m;i++) {
		                Tuple motif = new Tuple(15,"foo");
		                linda.write(motif);
		           //     System.out.println("(1) Resultat:" + res);
		                //linda.debug("(1)");
	                }
	                System.out.println("(writer "+j+")Finish Time "+(System.currentTimeMillis()-t0)+" ms.");
	            }
	        }.start();
        }
        
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Tuple motif = new Tuple(Integer.class, String.class);
                for (int i=0;i<m;i++) {
	                Tuple res1 = linda.read(motif);
	           //     System.out.println("(1) Resultat:" + res);
	                //linda.debug("(1)");
                }
                System.out.println("(reader 1)Finish Time "+(System.currentTimeMillis()-t0)+" ms.");
            }
        }.start();
        
    }
}
