package linda.test;

import linda.*;

public class BasicTestMultiServeurs {

    public static void main(String[] a) {
                
        final Linda linda1 = new linda.server.LindaClient("//localhost:4000/Lindaserver1");
        final Linda linda2 = new linda.server.LindaClient("//localhost:4001/Lindaserver2");
        final Linda linda3 = new linda.server.LindaClient("//localhost:4002/Lindaserver3");
        final Linda linda4 = new linda.server.LindaClient("//localhost:4003/Lindaserver4");
                
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Tuple motif = new Tuple(Integer.class, String.class);
                Tuple res = linda1.take(motif);
                System.out.println("(1) Resultat:" + res);
                linda1.debug("(1)");
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
                linda1.write(t1);

                Tuple t11 = new Tuple(4, 5);
                System.out.println("(2) write: " + t11);
                linda1.write(t11);

                Tuple t2 = new Tuple("hello", 15);
                System.out.println("(2) write: " + t2);
                linda1.write(t2);

                Tuple t3 = new Tuple(4, "foo");
                System.out.println("(2) write: " + t3);
                linda2.write(t3);
                                
                linda2.debug("(2)");

            }
        }.start();
                
    }
}
