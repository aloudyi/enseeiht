package linda.test;

import java.util.Collection;

import linda.*;

public class BasicTestTakeAll1 {

    public static void main(String[] a) {
                
        final Linda linda = new linda.shm.CentralizedLinda();
        // final Linda linda = new linda.server.LindaClient("//localhost:4000/aaa");
                
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Tuple motif = new Tuple(Integer.class, String.class);
                Collection<Tuple> res = linda.takeAll(motif);
                if(res.isEmpty()) {
                	System.out.println("(1) Resultat: EMPTY COLLECTION");
                } else {
                	for(Tuple t: res) {
                		System.out.println("(1) Resultat:" + t);
                	}
                }
                linda.debug("(1)");
            }
        }.start();
                
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Tuple t1 = new Tuple(4, 5);
                System.out.println("(2) write: " + t1);
                linda.write(t1);

                Tuple t11 = new Tuple(4, 5);
                System.out.println("(2) write: " + t11);
                linda.write(t11);

                Tuple t4 = new Tuple(4, "foo");
                System.out.println("(2) write: " + t4);
                linda.write(t4);
                
                Tuple t2 = new Tuple("hello", 15);
                System.out.println("(2) write: " + t2);
                linda.write(t2);

                Tuple t3 = new Tuple(4, "foo");
                System.out.println("(2) write: " + t3);
                linda.write(t3);
                                
                linda.debug("(2)");

             }
        }.start();
                
    }
}
