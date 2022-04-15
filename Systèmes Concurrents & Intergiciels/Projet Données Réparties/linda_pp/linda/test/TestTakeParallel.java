package linda.test;
import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import linda.*;

public class TestTakeParallel {
	
		private static Linda linda;
		private static List<Tuple> motif = new ArrayList<Tuple>();
		private static  List<Tuple> tuple  = new ArrayList<Tuple>();
		private int nbThreads;
	   
    	@BeforeClass
    	public static void BeforeClass() throws Exception {
    		for (int j = 0; j< 1; j++) { 
    		for (int i = 0; i< 10000; i++) {
    			motif.add(new Tuple(i, 2*i));
    		}}
    		//tuple = new Tuple("hamza", 22);
    	}

    	@Before
    	public void setUp() {
    		linda = new linda.shm.CentralizedLindaUpgrade();
            //linda = new linda.server.LindaClient("//localhost:4000/MonServeur");
    		
            nbThreads = 10000;
            for (int i = 0; i < 10000; i++) {
                    	linda.write(motif.get(i));
                       // System.out.println("("+i+") a écrit :" + tuple);
               
            }
    	}
    	
    	@Test
    	public void Test() throws InterruptedException {
           long start = System.currentTimeMillis()  ;   
        
        
        for (int i = 1; i <= nbThreads; i++) {
        	final int j = i;
            new Thread() {  
                public void run() {
                    Tuple res = linda.take(motif.get(j-1));
                   // System.out.println("("+j+") a pris :" + res);
                }
            }.start();
        }
                
        
        long finish = System.currentTimeMillis()  - start;
        System.out.println(finish);
    }
}