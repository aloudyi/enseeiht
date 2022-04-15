package linda.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

import linda.*;

public class TestsUnitairesTryTake {
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
		assertEquals(linda.tryTake(tuple),tuple);
		// Relecture après le take donc tuple inexistant
		assertEquals(linda.tryRead(tuple),null);
		linda.tryTake(tuple);
	}

	@Test
	public void testTakeMotifAvecTuple() {
		linda.write(tuple);
		assertEquals(linda.tryTake(motif), tuple);
		// Relecture après le take donc motif inexistant
		assertEquals(linda.tryRead(motif),null);
		linda.tryTake(tuple);
	}
	
	@Test
	public void testTakeMotifAvecMotif() {
		linda.write(motif);
		assertEquals(linda.tryTake(motif), motif);
		// Relecture après le take donc motif inexistant
		assertEquals(linda.tryRead(motif),null);
		linda.tryTake(motif);
	}
	
	@Test
	public void testTakeTupleAvecMotif() {
		linda.write(motif);
		// Le tuple ne matche pas le motif
		assertNotEquals(linda.tryTake(tuple), motif);
		// Il retourne donc un nul
		assertEquals(linda.tryTake(tuple), null);
		// motif non trouvé donc non supprimé
		assertEquals(linda.tryRead(motif), motif);
		linda.tryTake(motif);
	}
	
	@Test
	public void testTakeTupleVide() {
		linda.write(vide);
		assertEquals(linda.tryTake(vide), vide);
		// Meme s'il est vide il est supprimé
		assertNotEquals(linda.tryRead(vide), vide);
		linda.tryTake(vide);
	}
	
	@Test
	public void testTryTakeNonBloquant() throws InterruptedException {
		linda.write(motif);
		Thread th = new Thread() {
		            public void run() {
		                try {
		                    linda.tryTake(fauxmotif);
		                } catch (Exception e) {
		                    ;
		                }
		            }
		};
        th.start();
        Thread.sleep(1000);
        // Puisque le tryRead n'est pas bloquant et que dans ce cas il ne trouvera pas le motif qu'il cherchait alors le thread doit se terminer
        assertEquals(th.getState(), Thread.State.TERMINATED);
        // Et il doir retourner un nul
		assertNull(linda.tryTake(fauxmotif));
		linda.tryTake(motif);
	}

	@Test(expected=NullPointerException.class)
	public void testLectureNull() {
		linda.tryTake(null);
	}
	
}
