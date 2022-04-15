package linda.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

import linda.*;

public class TestsUnitairesTake {
	private static Linda linda;
	private static Tuple motif;
	private static Tuple fauxmotif;
	private static Tuple tuple;
	private static Tuple vide;
	
	@BeforeClass
	public static void BeforeClass() throws Exception {
		motif = new Tuple(String.class, Integer.class);
		fauxmotif = new Tuple(Integer.class, String.class);
		tuple = new Tuple("hamza", 22);
		vide = new Tuple();
	}
	
	@Before
	public void setUp() {
		linda = new linda.shm.CentralizedLinda();
        // linda = new linda.server.LindaClient("//localhost:4000/MonServeur");
	}
	
	@Test
	public void testTakeSimple() {
		linda.write(tuple);
		// On lit et on take
		assertEquals(linda.take(tuple),tuple);
		// Relecture après le take donc tuple inexistant
		assertEquals(linda.tryRead(tuple),null);
		linda.tryTake(tuple);
		linda.debug("takeSimple");
	}

	@Test
	public void testTakeMotifAvecTuple() {
		linda.write(tuple);
		assertEquals(linda.take(motif), tuple);
		// Relecture après le take donc motif inexistant
		assertEquals(linda.tryRead(motif),null);
		linda.tryTake(tuple);
		linda.debug("TakeMotifAvecTuple");
	}
	
	@Test
	public void testTakeMotifAvecMotif() {
		linda.write(motif);
		assertEquals(linda.take(motif), motif);
		// Relecture après le take donc motif inexistant
		assertEquals(linda.tryRead(motif),null);
		linda.tryTake(motif);
		linda.debug("wMotifMotifn");
	}
	
	@Test
	public void testTakeTupleAvecMotif() {
		linda.write(motif);
		// Le motif n'est pas trouvé donc le tryTake retournera null
		assertEquals(linda.tryTake(tuple), null);
		// On supprime maintenant le motif avec take mais puisqu'il est bloquant il faut qu'il le trouve donc on commence par un write
		linda.write(tuple);
		// Il doit le trouver maintenant normalement
		assertEquals(linda.take(tuple), tuple);
		// Supprimé par take il ne sera pas lu par tryRead et doit normalement retourner null
		assertEquals(linda.tryRead(tuple), null);
		linda.tryTake(tuple);
		linda.tryTake(motif);
		linda.debug("TupleMotif");
	}
	
	@Test
	public void testTakeTupleVide() {
		linda.write(vide);
		assertEquals(linda.take(vide), vide);
		// Meme s'il est vide il est supprimé
		assertEquals(linda.tryRead(vide), null);
		linda.tryTake(vide);
		linda.debug("Vide");
	}

	@Test
	public void testTakeBloquant() throws InterruptedException {
		linda.write(motif);
		Thread th = new Thread() {
		            public void run() {
		                try {
		                    linda.take(fauxmotif);
		                } catch (Exception e) {
		                    ;
		                }
		            }
		};
        th.start();
        Thread.sleep(1000);
        // Puisque le tryRead n'est pas bloquant et que dans ce cas il ne trouvera pas le motif qu'il cherchait alors le thread doit se terminer
        if (this.linda instanceof linda.shm.CentralizedLinda) {
        	assertEquals(th.getState(), Thread.State.WAITING);}
        else {
        	assertEquals(th.getState(), Thread.State.RUNNABLE);
        }
        // Le fauxmotif n'est pas encore écrit
		assertNull(linda.tryRead(fauxmotif));
		// On écrit le motif et le thread maintenant doit se terminer normalement
		linda.write(fauxmotif);
		Thread.sleep(1000);
		// Là le take est fait, le tryRead doit normalement retourner null
		assertNull(linda.tryRead(fauxmotif));
		assertEquals(th.getState(), Thread.State.TERMINATED);
		linda.tryTake(motif);
		linda.tryTake(fauxmotif);
		linda.debug("Bloquantn");
	}

	@Test(expected=NullPointerException.class)
	public void testtakeNull() {
		linda.take(null);
	}
}
