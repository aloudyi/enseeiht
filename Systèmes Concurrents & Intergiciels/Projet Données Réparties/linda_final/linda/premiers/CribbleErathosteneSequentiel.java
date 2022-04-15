package linda.premiers;
import java.util.Collection;

import linda.*;
import linda.shm.CentralizedLinda;

public class CribbleErathosteneSequentiel {
	
	public static void main(String[] args) {
		int limite = Integer.parseInt(args[0]);
		CentralizedLinda cribble = new CentralizedLinda();
		
		// Partie d'initialisation du Cribble
		for(int i=0; i<=limite; i++) {
			cribble.write(new Tuple(i));
		}
		
		cribble.take(new Tuple(0)); // 0 n'est pas premier
		cribble.take(new Tuple(1)); // 1 n'est pas premier
		
		int i = 2; // indice de d�part du parcours du cribble
		while(i*i<limite) {
			if(cribble.tryRead(new Tuple(i))==(new Tuple(i))) {
				for(int j = i*i; j<limite; j+=i) { // On commence � i*i car 2*i est multiple de 2(s i<i), 3*i,.... ainsi de suites on �t� ray� avant
					cribble.tryTake(new Tuple(j));
				}
			}
			i++;  // Icr�mentation de l'indice
		}
		
		Collection<Tuple> resultat_cribble = cribble.readAll(new Tuple(Integer.class)); // Affichage 
		System.out.println(resultat_cribble);

	}
}
