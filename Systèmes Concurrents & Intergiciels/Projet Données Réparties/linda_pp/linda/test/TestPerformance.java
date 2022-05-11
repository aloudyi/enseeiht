package linda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import linda.Linda;
import linda.Tuple;

public class TestPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		if (args.length != 4) {
			
			System.out.println("il faut donner 4 entiers a, b, c et d avec a le nombre de read, b le nombre de write, c le nombre de take et d le nombre moyen de read par client(pour le test du cache). ");
		
		}else {
			
			int nbReads = Integer.parseInt(args[0]);
			int nbWrites = Integer.parseInt(args[1]);
			int nbTakes = Integer.parseInt(args[2]);
			int nbRead_par_thread = Integer.parseInt(args[3]);
			
			//Test de la version centralisée de linda
			System.out.println("****Test de la version centralisée de linda****");
			System.out.println("");
			// on peut ici changer la version de linda testée
			final Linda linda = new linda.shm.CentralizedLinda();
			//final Linda linda = new linda.shm.CentralizedLinda();
			
			// Listes des motifs sur lesquels on effectue les tests de write/read/take
			List<Tuple> motif = new ArrayList<Tuple>();
			int nbThreads = 10000;
			for (int i = 0; i< nbThreads; i++) {
    			motif.add(new Tuple(i, 2*i));
    		}
			
			//Test write parallele
			System.out.println("1) Test sur les Writes uniquement :");
			// on crée nbThread qui font tous que des writes 
			System.out.println("Lancement de 10000 threads");
			long start = System.currentTimeMillis()  ;   
	                
	        for (int i = 0; i < nbThreads; i++) {
	        	final int j = i;
	            new Thread() {  
	                public void run() {
	                
	                    linda.write(motif.get(j));
	                }
	            }.start();
	        }
	                	        
	        long finish = System.currentTimeMillis()  - start;
	        
	        System.out.println("Temps d'éxécution : "+ finish + " ms");
	        System.out.println("");
	        
	        
	      //Test read parallele
			System.out.println("2) Test sur les Reads uniquement :");
			// on crée nbThread qui font tous que des Reads sur les mêmes tuples précédemment écrits 
			System.out.println("Lancement de 10000 threads");
			start = System.currentTimeMillis()  ;   
	                
	        for (int i = 0; i < nbThreads; i++) {
	        	final int j = i;
	            new Thread() {  
	                public void run() {
	                	
	                	
	                    Tuple res = linda.read(motif.get(j));
	                }
	            }.start();
	        }
	                	        
	        finish = System.currentTimeMillis()  - start;
	        
	        System.out.println("Temps d'éxécution : "+ finish + " ms");
	        System.out.println("");
	        
	      //Test take 
			System.out.println("3) Test sur les Takes uniquement :");
			// on crée nbThread qui font tous que des Reads sur les mêmes tuples précédemment écrits 
			System.out.println("Lancement de 10000 threads");
			start = System.currentTimeMillis()  ;   
	                
	        for (int i = 0; i < nbThreads; i++) {
	        	final int j = i;
	            new Thread() {  
	                public void run() {
	            
	                	Tuple res =  linda.take(motif.get(j));
	                }
	            }.start();
	        }
	                	        
	        finish = System.currentTimeMillis()  - start;
	        
	        System.out.println("Temps d'éxécution : "+ finish + " ms");
	        System.out.println("");
	        
	        
	        
	      //on mélange maintenant les opérations
		       int nbOpTotal = nbReads + nbWrites + nbTakes;
		      System.out.println("4)Lancement des Threads éxécutants plusieurs opérations différentes à la fois" );
		      System.out.println("Pourcentage des reads: " + (((float)nbReads)/nbOpTotal)*100 + "%");
		      System.out.println("Pourcentage des takes: " + (((float)nbTakes)/nbOpTotal)*100 + "%");
		      System.out.println("Pourcentage des writes: " + (((float)nbWrites)/nbOpTotal)*100 + "%");
		      
		      List<Tuple> motif2 = new ArrayList<Tuple>(); 
		      for (int i = 0; i< nbOpTotal; i++) {
	  			motif2.add(new Tuple(i, 2*i));
	  			linda.write(new Tuple(i, 2*i));
	  		  }
		      start = System.currentTimeMillis()  ;
		      for (int i = 0; i < nbOpTotal; i++) {
		            final int j = i;
		            new Thread() {  
		                public void run() {
		                	int randomNum = ThreadLocalRandom.current().nextInt(0, nbOpTotal);
		                	
		                	if(randomNum<nbReads) {
		                		Tuple res = linda.read(motif2.get(j));
		                	}else if(randomNum<nbReads+nbWrites) {
		                		linda.write(motif2.get(j));
		                	}else {
		                		Tuple res = linda.take(motif2.get(j));
		                	}
		                	
		                      
		                }
		            }.start();
		        }
				
		        finish = System.currentTimeMillis()  - start;
		        
		        System.out.println("Temps d'éxécution : "+ finish + " ms");
		        System.out.println("");
		        
		        
		        
		        
		        
		      //on mélange maintenant les opérations en mettant en evidence l'importance du cache
			      
			      System.out.println("5)Lancement des Threads éxécutants plusieurs opérations différentes à la fois avec utilisation multiple du meme tuple" );
			      System.out.println("Pourcentage des reads: " + (((float)nbReads)/nbOpTotal)*100 + "%");
			      System.out.println("Pourcentage des takes: " + (((float)nbTakes)/nbOpTotal)*100 + "%");
			      System.out.println("Pourcentage des writes: " + (((float)nbWrites)/nbOpTotal)*100 + "%");
			      System.out.println("Nombre de fois qu'un thread utilise le meme tuple: " + nbRead_par_thread);
			      System.out.println("Nombre total d'opération: " + nbOpTotal);
			      
			     
			      for (int i = 0; i< nbOpTotal; i++) {
	
		  			linda.write(new Tuple(i, 2*i));
		  		  }
			      start = System.currentTimeMillis()  ;
			      for (int i = 0; i < nbOpTotal; i++) {
			            final int j = i;
			            new Thread() {  
			                public void run() {
			                	int randomNum = ThreadLocalRandom.current().nextInt(0, nbOpTotal);
			                	int randomNumRead = ThreadLocalRandom.current().nextInt(1, 2*nbRead_par_thread);
			                	if(randomNum<nbReads) {
			                		for(int p=0;p<randomNumRead;p++) {
			                			Tuple res = linda.read(motif2.get(j));
			                		}
			                		
			                	}else if(randomNum<nbReads+nbWrites) {
			                		linda.write(motif2.get(j));
			                	}else {
			                		Tuple res = linda.take(motif2.get(j));
			                	}
			                	
			                      
			                }
			            }.start();
			        }
					
			        finish = System.currentTimeMillis()  - start;
			        
			        System.out.println("Temps d'éxécution : "+ finish + " ms");
			        System.out.println("");
		}
		
		
		
	}

}
