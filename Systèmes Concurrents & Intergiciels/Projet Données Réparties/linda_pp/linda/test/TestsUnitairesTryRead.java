package linda.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

import linda.*;

public class TestsUnitairesTryRead {
	
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
		linda = new linda.shm.CentralizedLindaUpgrade5(3);
        // linda = new linda.server.LindaClient("//localhost:4000/MonServeur");
	}
	
	@Test
	public void testLectureSimple() {
		linda.write(tuple);
		assertEquals(linda.tryRead(tuple),tuple);
		linda.take(tuple);

	}

	@Test
	public void testLectureMotifAvecTuple() {
		linda.write(tuple);
		assertEquals(linda.tryRead(motif), tuple);
		linda.take(tuple);
	}
	
	@Test
	public void testLectureMotifAvecMotif() {
		linda.write(motif);
		assertEquals(linda.tryRead(motif), motif);
		linda.take(motif);
	}
	
	@Test
	public void testLectureTupleAvecMotif() {
		linda.write(motif);
		// Le tuple ne matche pas le motif
		assertNotEquals(linda.tryRead(tuple), motif);
		// Il retourne donc un nul
		assertEquals(linda.tryRead(tuple), null);
		linda.take(motif);
	}
	
	@Test
	public void testLectureTupleVide() {
		linda.write(vide);
		assertEquals(linda.tryRead(vide), vide);
		linda.take(vide);
	}
	
	@Test
	public void testTryReadNonBloquant() throws InterruptedException {
		linda.write(motif);
		Thread th = new Thread() {
		            public void run() {
		                try {
		                    linda.tryRead(fauxmotif);
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
		assertNull(linda.tryRead(fauxmotif));
		linda.take(motif);
	}
	

	@Test(expected=NullPointerException.class)
	public void testLectureNull() {
		linda.tryRead(null);
	}
	
}
