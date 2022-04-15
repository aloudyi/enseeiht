package linda.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import linda.Linda;
import linda.Tuple;

public class TestsUnitairesReadAll {
	
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
	public void testLectureTotaleSimple() {
		for (int i = 0; i < 20; i++) {
			linda.write(tuple);
		}
		Collection<Tuple> result = linda.readAll(tuple);
		assertTrue(result.contains(tuple));
		assertEquals(result.size(),20);
		linda.takeAll(tuple);
	}

	@Test
	public void testLectureTotaleMotifAvecTuple() {
		for (int i = 0; i < 20; i++) {
			linda.write(tuple);
		}
		Collection<Tuple> result = linda.readAll(motif);
		assertTrue(result.contains(tuple));
		assertEquals(result.size(),20);
		linda.takeAll(tuple);
	}
	
	@Test
	public void testLectureTotaleMotifAvecMotif() {
		for (int i = 0; i < 20; i++) {
			linda.write(motif);
		}
		Collection<Tuple> result = linda.readAll(motif);
		assertTrue(result.contains(motif));
		assertEquals(result.size(),20);
		linda.takeAll(motif);
	}
	
	@Test
	public void testLectureTotaleTupleAvecMotif() {
		// Ici aucun des tuples écrits ne correspond au tuple recherché, donc readAll retournera une collection vide
		for (int i = 0; i < 20; i++) {
			linda.write(motif);
		}
		Collection<Tuple> result = linda.readAll(tuple);
		assertFalse(result.contains(tuple));
		assertEquals(result.size(),0);
		assertEquals(linda.read(motif), motif);
		linda.takeAll(motif);
	}
	
	@Test
	public void testLectureTotaleMotifUnique() {
		// Ici seul un tuple match le motif qu'on cherche 
		for (int i = 0; i < 19; i++) {
			linda.write(motif);
		}
		linda.write(tuple);
		Collection<Tuple> result = linda.readAll(tuple);
		assertTrue(result.contains(tuple));
		assertEquals(result.size(),1);
		linda.takeAll(tuple);
		linda.takeAll(motif);
	}
	
	@Test
	public void testLectureTotaleTupleVide() {
		for (int i = 0; i < 20; i++) {
			linda.write(vide);
		}
		Collection<Tuple> result = linda.readAll(vide);
		assertTrue(result.contains(vide));
		assertEquals(result.size(),20);
		linda.takeAll(vide);
	}
	
	@Test
	public void testReadAllNonBloquant() throws InterruptedException {
		for (int i = 0; i < 20; i++) {
			linda.write(motif);
		}
		Thread th = new Thread() {
		            public void run() {
		                try {
		                	linda.readAll(fauxmotif);
		                } catch (Exception e) {
		                    ;
		                }
		            }
		};
        th.start();
        Thread.sleep(1000);
        // Puisque le ReadAll n'est pas bloquant et que dans ce cas il ne trouvera pas le motif qu'il cherchait alors le thread doit se terminer
        assertEquals(th.getState(), Thread.State.TERMINATED);
        // Et il doir retourner un nul
		assertTrue(linda.readAll(fauxmotif).isEmpty());
	}
	

	@Test(expected=NullPointerException.class)
	public void testLectureTotaleNull() {
		linda.readAll(null);
	}
	
}
