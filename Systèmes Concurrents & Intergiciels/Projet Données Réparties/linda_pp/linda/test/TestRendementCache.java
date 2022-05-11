package linda.test;

import java.util.Random;

import linda.*;
import linda.server.LindaserverImplCache;
import linda.shm.CentralizedLindaCache3;

public class TestRendementCache {
	private static LindaserverImplCache s;
    public static void main(String[] a) {
    	try {
			 s =new linda.server.LindaserverImplCache();
			s.main(new String[] {"4000", "MonServeur"});
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        //final Linda linda = new linda.shm.CentralizedLindaCache();
    	final Linda cl1 = new linda.server.LindaClientCache("//localhost:4000/MonServeur");
    	final Linda cl2 = new linda.server.LindaClientCache("//localhost:4000/MonServeur");
     	
    	Tuple motif = new Tuple(String.class, Integer.class);
    	
         
         
         for(int i=0;i<1000;i++) {
        	 cl1.write(new Tuple("CacheTest",i));
         }
         
         
         
         new Thread() {
             public void run() {
                 try {
                     Thread.sleep(2);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 Random r= new Random(3);
                 while(true) {
                 	
                 	int n=r.nextInt(1000);
                 	 if(r.nextInt(2)>0) {
                      	cl1.tryRead(new Tuple("CacheTest",n)); 
                 	 } else {
                 		cl1.tryTake(new Tuple("CacheTest",n)); 
                 	 }
                 }
                 
             }
         }.start();
         new Thread() {
             public void run() {
                 try {
                     Thread.sleep(2);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 Random r= new Random(352);
                 while(true) {
                 	
                 	int n=r.nextInt(1000);
                 	 if(r.nextInt(2)>0) {
                      	cl2.tryRead(new Tuple("CacheTest",n)); 
                 	 } else {
                 		cl2.tryTake(new Tuple("CacheTest",n)); 
                 	 }
                 }
                 
             }
         }.start();
                
    }
}
