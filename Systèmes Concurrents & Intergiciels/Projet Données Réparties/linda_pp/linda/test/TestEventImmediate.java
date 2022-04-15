package linda.test;

import org.junit.Before;

import org.junit.BeforeClass;
import org.junit.Test;

import linda.*;
import linda.Linda.eventMode;
import linda.Linda.eventTiming;


public class TestEventImmediate {
	
		private static Linda linda;
		private static Tuple motif;
		private static Tuple tuple;
		private int nbThreads;
	   
    	@BeforeClass
    	public static void BeforeClass() throws Exception {
    		motif = new Tuple(Integer.class, String.class);
    		tuple = new Tuple(22, "hamza");
    	}

    	@Before
    	public void setUp() {
    		//linda = new linda.shm.CentralizedLinda();
             linda = new linda.server.LindaClient("//localhost:4000/MonServeur");
    		
            nbThreads = 100;
    	}
    	
    	 private static class TakeCallback implements Callback {
            public void call(Tuple t) {
                System.out.println("Take de "+t);
            }
        }
    	 
    	private static class ReadCallback implements Callback {
             public void call(Tuple t) {
                 System.out.println("Read de "+t);
             }
         }
    	 
    	
    	@Test
        public void Test() throws InterruptedException {
            
    		Thread.sleep(1000);
            System.out.println("********** Ecriture avant enregistrement de tous les Events ******************");
            Thread.sleep(1000);
            
            for (int i = 1; i<=nbThreads; i++) {
            	Tuple t3 = new Tuple(4, "foo");
                System.out.println("write: " + t3);
                linda.write(t3);
            }

            Thread.sleep(1000);
            System.out.println("********** Enregistrement de tous les TAKE et élimination de tous les tuples ******************");
            Thread.sleep(1000);
            
            for (int i = 1; i <= nbThreads; i++) {
            	final int j = i;
            	new Thread() {
            		public void run() {
            			linda.eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, motif, new TakeCallback());
            			System.out.println("Take " + j + " enregistré");
            		}
            	}.start();
            }
            

            Thread.sleep(1000);
            System.out.println("********** On s'assure maintenant que tous les tuples ont été takés ******************");
                Tuple res = linda.tryTake(tuple);
                System.out.println("Le tuple que le TryTake a trouvé est : " + res);
            Thread.sleep(1000);
            
            Thread.sleep(1000);
            System.out.println("********** Ecriture apres enregistrement de tous les Events TAKE ******************");
            Thread.sleep(1000);
           
            for (int i = 1; i<=nbThreads; i++) {
            	Thread.sleep(100);
                linda.write(tuple);
                System.out.println("write: " + tuple);
            }
            
            Thread.sleep(1000);
            System.out.println("********** On s'assure maintenant que tous les tuples écrits existent encore ******************");
            for (int i = 1; i<=nbThreads; i++) {
            	Tuple ress = linda.tryRead(tuple);
                System.out.println("Le tuple que le TryRead a trouvé est : " + ress);
            }
            Thread.sleep(1000);
             
            Thread.sleep(1000);
            System.out.println("********** Enregistrement de tous les READ ******************");
            Thread.sleep(1000);
            
            motif = new Tuple(Integer.class, String.class);
            for (int i = 1; i <= nbThreads; i++) {
            	final int j = i;
            	new Thread() {
            		public void run() {
            			linda.eventRegister(eventMode.READ, eventTiming.IMMEDIATE, motif, new ReadCallback());
            			System.out.println("Read " + j + " enregistré");
            		}
            	}.start();
            }
            
            Thread.sleep(1000);
            System.out.println("********** Ecriture apres enregistrement de tous les Events READ ******************");
            Thread.sleep(1000);
           
            for (int i = 1; i<=nbThreads; i++) {
            	Thread.sleep(100);
                linda.write(tuple);
                System.out.println("write: " + tuple);
            }
            
            Thread.sleep(1000);
            System.out.println("********** On s'assure maintenant que les derniers écrits n'ont pas été éliminés ******************");
            Thread.sleep(1000);
            
            for (int i = 1; i<=nbThreads; i++) {
            	Thread.sleep(100);
                Tuple resss = linda.take(tuple);
                System.out.println("a pris : " + resss);
            }

        }
}
