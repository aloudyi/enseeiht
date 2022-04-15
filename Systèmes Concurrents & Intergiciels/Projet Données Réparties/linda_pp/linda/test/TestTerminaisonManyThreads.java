package linda.test;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import linda.*;

public class TestTerminaisonManyThreads {
	
		private static Linda linda;
		private static Tuple motif;
		private static Tuple tuple;
		private int nbThreads;
	   
    	@BeforeClass
    	public static void BeforeClass() throws Exception {
    		motif = new Tuple(String.class, Integer.class);
    		tuple = new Tuple("hamza", 22);
    	}

    	@Before
    	public void setUp() {
    		linda = new linda.shm.CentralizedLinda();
            //linda = new linda.server.LindaClient("//localhost:4000/MonServeur");
    		
            nbThreads = 1000;
    	}
    	
    	@Test
    	public void Test() throws InterruptedException {
                
        for (int i = 1; i <= nbThreads; i++) {
            final int j = i;
            new Thread() {  
                public void run() {
                    Tuple res = linda.read(motif);
                    System.out.println("("+j+") a lu :" + res);
                }
            }.start();
        }
        
        for (int i = 1; i <= nbThreads; i++) {
        	final int j = i;
            new Thread() {  
                public void run() {
                    Tuple res = linda.take(motif);
                    System.out.println("("+j+") a pris :" + res);
                }
            }.start();
        }
                
        
        for (int i = 1; i <= nbThreads; i++) {
        	final int j = i;
            new Thread() {  
                public void run() {
                	linda.write(tuple);
                    System.out.println("("+j+") a écrit :" + tuple);
                }
            }.start();
        }
    }
}