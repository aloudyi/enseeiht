package linda.premiers;
import java.util.Collection;

import linda.*;
import linda.shm.CentralizedLinda;

public class CribbleErathosteneConcurrent {
	
	public static void main(String[] args) {
		int limite = Integer.parseInt(args[0]);
		CentralizedLinda cribble = new CentralizedLinda();
		
		// Partie d'initialisation du Cribble
		for(int i=0; i<=limite; i++) {
			cribble.write(new Tuple(i));
		}
		
		cribble.take(new Tuple(0)); // 0 n'est pas premier
		cribble.take(new Tuple(1)); // 1 n'est pas premier
		
		int step = 2; // indice de départ du parcours du cribble
		for(int i = 0; i<3; i++) {
			final int j = i;
			new Thread() {
				public void run() {
					cribbler(step+((limite*j)%3), limite, cribble);
				}
			}.start();
		}
		Collection<Tuple> resultat_cribble = cribble.readAll(new Tuple(Integer.class)); // Affichage 
		System.out.println(resultat_cribble);	
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
