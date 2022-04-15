package linda.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import linda.Linda;
import linda.Tuple;

public class TestsUnitairesTakeAll {
	
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
		//linda = new linda.shm.CentralizedLinda();
         linda = new linda.server.LindaClient("//localhost:4000/MonServeur");
	}
	
	@Test
	public void testTakeAllSimple() {
		for (int i = 0; i < 20; i++) {
			linda.write(tuple);
		}
		Collection<Tuple> result = linda.takeAll(tuple);
		assertTrue(result.contains(tuple));
		assertEquals(result.size(),20);
		// Le tuplespace est donc vide
		assertEquals(linda.tryRead(tuple), null);
	}

	@Test
	public void testTakeAllMotifAvecTuple() {
		for (int i = 0; i < 20; i++) {
			linda.write(tuple);
		}
		Collection<Tuple> result = linda.takeAll(motif);
		assertTrue(result.contains(tuple));
		assertEquals(result.size(),20);
		// TupleSpace Vide
		assertEquals(linda.tryRead(motif), null);
	}

	@Test
	public void testTakeAllMotifAvecMotif() {
		for (int i = 0; i < 20; i++) {
			linda.write(motif);
		}
		Collection<Tuple> result = linda.takeAll(motif);
		assertTrue(result.contains(motif));
		assertEquals(result.size(),20);
		assertEquals(linda.tryRead(motif), null);
	}
	
	@Test
	public void testTakeAllAvecMotif() {
		// Ici aucun des tuples écrits ne correspond au tuple recherché, donc takeAll retournera une collection vide
		for (int i = 0; i < 20; i++) {
			linda.write(motif);
		}
		Collection<Tuple> result = linda.takeAll(tuple);
		assertFalse(result.contains(tuple));
		assertEquals(result.size(),0);
		assertEquals(linda.tryRead(motif), motif);
		linda.takeAll(motif);
	}
	
	@Test
	public void testTakeAllMotifUnique() {
		// Ici seul un tuple match le motif qu'on cherche 
		for (int i = 0; i < 19; i++) {
			linda.write(motif);
		}
		linda.write(tuple);
		Collection<Tuple> result = linda.takeAll(tuple);
		assertTrue(result.contains(tuple));
		assertEquals(result.size(),1);
		// tuple n'est plus préent
		assertEquals(linda.tryRead(tuple), null);
		// Par contre motif existe encore
		assertEquals(linda.tryRead(motif), motif);
		linda.takeAll(motif);
	}
	
	@Test
	public void testTakeAllTupleVide() {
		for (int i = 0; i < 20; i++) {
			linda.write(vide);
		}
		Collection<Tuple> result = linda.takeAll(vide);
		assertTrue(result.contains(vide));
		assertEquals(result.size(),20);
		// Même s'il est vide le tuple est supprimé
		assertEquals(linda.tryRead(vide),null);
	} 
	
	@Test
	public void testTakeAllNonBloquant() throws InterruptedException {
		for (int i = 0; i < 20; i++) {
			linda.write(motif);
		}
		Thread th = new Thread() {
		            public void run() {
		                try {
		                	linda.takeAll(fauxmotif);
		                } catch (Exception e) {
		                    ;
		                }
		            }
		};
        th.start();
        Thread.sleep(1000);
        // Puisque le TakeAll n'est pas bloquant et que dans ce cas il ne trouvera pas le motif qu'il cherchait alors le thread doit se terminer
        assertEquals(th.getState(), Thread.State.TERMINATED);
        // Et il doir retourner un nul
		assertTrue(linda.readAll(fauxmotif).isEmpty());
	}
	

	@Test(expected=NullPointerException.class)
	public void testTakeAllNull() {
		linda.takeAll(null);
	}
}