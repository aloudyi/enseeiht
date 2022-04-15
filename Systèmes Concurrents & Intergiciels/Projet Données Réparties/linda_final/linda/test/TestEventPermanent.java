package linda.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import linda.*;
import linda.Linda.eventMode;
import linda.Linda.eventTiming;


public class TestEventPermanent {
	
		private static Linda linda;
		private static Tuple motif;
		private static Tuple tuple;
		private static Tuple tuplefortake;
		private int nbThreads;
	   
    	@BeforeClass
    	public static void BeforeClass() throws Exception {
    		motif = new Tuple(Integer.class, String.class);
    		tuple = new Tuple(22, "hamza");
    		tuplefortake = new Tuple(4, "take");
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
    	        
    	        linda.eventRegister(eventMode.TAKE, eventTiming.FUTURE, motif, this);
    	       
    	    }
    	}
    	
    	
    	private static class ReadCallback implements Callback {
    	    public void call(Tuple t) {
    	        System.out.println("Read de "+t);
    	        
    	        linda.eventRegister(eventMode.READ, eventTiming.FUTURE, motif, this);
    	       
    	    }
    	}
    	
    	@Test
        public void Test() throws InterruptedException {
            
    		Thread.sleep(1000);
            System.out.println("********** Ecriture avant enregistrement de tous l'Event Permanent ******************");
            Thread.sleep(1000);
            
            for (int i = 1; i<=nbThreads; i++) {
            	Tuple t3 = new Tuple(4, "foo");
                System.out.println("write: " + t3);
                linda.write(t3);
            }

            Thread.sleep(1000);
            System.out.println("********** Enregistrement du TAKE unique et du READ unique ******************");
            Thread.sleep(1000);
  
        	new Thread() {
        		public void run() {
        			linda.eventRegister(eventMode.TAKE, eventTiming.IMMEDIATE, motif, new TakeCallback());
        			System.out.println("EventPermanent TAKE enregistré");
        		}
        	}.start();
        	
        	Thread.sleep(1000);
        	
        	new Thread() {
        		public void run() {
        			linda.eventRegister(eventMode.READ, eventTiming.IMMEDIATE, motif, new ReadCallback());
        			System.out.println("EventPermanent READ enregistré");
        		}
        	}.start();
        
        	Thread.sleep(1000);
            System.out.println("********** Là jusqu'à maintenant seul les IMMEDIATE seront pris en compte et donc on n'aura que " + (nbThreads -1) +" tuples restants ******************");
            Thread.sleep(1000);	
            	
            Thread.sleep(1000);
            System.out.println("********** " + nbThreads + " Take pour vérifier si on n'a que " + (nbThreads-1) + " tuples restants: un des take doit bloquer normalement ******************");
	            for (int i = 1; i<=nbThreads; i++) {
	            	final int j = i;
	            	Thread.sleep(100);
	            	new Thread() {
	            		public void run() {
			                Tuple resss = linda.take(tuple);	
			                System.out.println(j + " a pris : " + resss);
	            		}
	            	}.start();
	            }
            Thread.sleep(1000);
            
            Thread.sleep(1000);
            new Thread() {
            	public void run() {
            		System.out.println("********** Ecriture pour débloquer le Take restant ******************");
                    try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                    linda.write(tuple);
                    System.out.println("write pour débloquer : " + tuplefortake);
            	}
            }.start();
            
            Thread.sleep(1000);
            System.out.println("********** Ecriture pour les EventFuture soit des READ soit des TAKE ******************");
            Thread.sleep(1000);
           
            for (int i = 1; i<=nbThreads; i++) {
            	Thread.sleep(100);
                linda.write(tuple);
                System.out.println("write: " + tuple);
            }
            
            Thread.sleep(1000);
            System.out.println("********** On s'assure maintenant qu'aucaun tuple n'existe encore ******************");
            	Tuple ress = linda.tryRead(tuple);
                System.out.println("Le tuple que le TryRead a trouvé est : " + ress);
            Thread.sleep(1000);

        }
}