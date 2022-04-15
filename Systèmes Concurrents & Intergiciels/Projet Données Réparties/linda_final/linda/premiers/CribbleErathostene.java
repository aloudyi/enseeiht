package linda.premiers;
import java.util.Collection;

import linda.*;
import linda.shm.CentralizedLinda;

public class CribbleErathostene {
	
	public static void main(String[] args) {
		final int limite = Integer.parseInt(args[0]);
		final CentralizedLinda cribble = new CentralizedLinda();
		
		// Partie d'initialisation du Cribble
		for(int i=0; i<=limite; i++) {
			cribble.write(new Tuple(i));
		}
		
		cribble.take(new Tuple(0)); // 0 n'est pas premier
		cribble.take(new Tuple(1)); // 1 n'est pas premier 
		long start = System.nanoTime();
		int step = 2; // indice de départ du parcours du cribble
		for(int nbThreads =1; nbThreads<50; nbThreads++) {
			for(int i = 0; i<nbThreads; i++) {
				final int k = nbThreads;
				final int j = i;
				start = System.nanoTime();
				new Thread() {
					public void run() {
						cribbler(step+(limite*j)/k, limite, cribble);
					}
				}.start();
			}
			//Collection<Tuple> resultat_cribble = cribble.readAll(new Tuple(Integer.class)); // Affichage 
			//System.out.println(resultat_cribble);
		    long end = System.nanoTime();
		    System.out.println("Concurrent Execution Time : "+(end-start)/1000+" milliseconds, with "+nbThreads+" threads.");
		    System.out.println("------------------------------------------------------------");
		}
		CentralizedLinda cribble2 = new CentralizedLinda();
		
		// Partie d'initialisation du Cribble
		for(int i=0; i<=limite; i++) {
			cribble2.write(new Tuple(i));
		}
		
		cribble2.take(new Tuple(0)); // 0 n'est pas premier
		cribble2.take(new Tuple(1)); // 1 n'est pas premier
		
		start = System.nanoTime();
		int i = 2; // indice de départ du parcours du cribble
		while(i*i<limite) {
			if(cribble2.tryRead(new Tuple(i))==(new Tuple(i))) {
				for(int j = i*i; j<limite; j+=i) { // On commence à i*i car 2*i est multiple de 2(s i<i), 3*i,.... ainsi de suites on été rayé avant
					cribble2.tryTake(new Tuple(j));
				}
			}
			i++;  // Icrémentation de l'indice
		}
		
		//resultat_cribble = cribble2.readAll(new Tuple(Integer.class)); // Affichage 
		//System.out.println(resultat_cribble);
		long end = System.nanoTime();
		System.out.print("Sequential Execution Time : "+(end-start)/1000+" milliseconds.");
	}
	
	public static void cribbler(int step, int limit, CentralizedLinda cribble) {
		// Résolution du cribble
		int i = step;
		while(i*i<limit) {
			if(cribble.tryRead(new Tuple(i))==(new Tuple(i))) {
				for(int j = i*i; j<limit; j+=step) { // On commence à i*i car 2*i est multiple de 2(s i<i), 3*i,.... ainsi de suites on été rayé avant
					cribble.tryTake(new Tuple(j));
				}
			}
			i++;  // Icrémentation de l'indice
		}
	}
}
