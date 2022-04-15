package linda.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

import linda.*;

public class TestsUnitairesRead {
	
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
	public void testLectureSimple() {
		linda.write(tuple);
		assertEquals(linda.read(tuple),tuple);
		linda.take(tuple); //to test lindaserver
	}

	@Test
	public void testLectureMotifAvecTuple() {
		linda.write(tuple);
		assertEquals(linda.read(motif), tuple);
		linda.take(tuple); //to test lindaserver
	}
	
	@Test
	public void testLectureMotifAvecMotif() {
		linda.write(motif);
		assertEquals(linda.read(motif), motif);
		linda.take(motif); //to test lindaserver
	}
	
	@Test
	public void testLectureTupleAvecMotif() {
		linda.write(motif);
		// Le motif n'est pas trouvé donc le tryRead retournera null
		assertEquals(linda.tryRead(tuple), null);
		// On read maintenant le motif avec read mais puisqu'il est bloquant il faut qu'il le trouve donc on commence par un write
		linda.write(tuple);
		// Il doit le trouver maintenant normalement
		assertEquals(linda.read(tuple), tuple);
		linda.take(tuple); //to test lindaserver
		linda.take(motif); //to test lindaserver
	}
	
	@Test
	public void testLectureTupleVide() {
		linda.write(vide);
		assertEquals(linda.read(vide), vide);
		linda.take(vide); //to test lindaserver
	}
	
	@Test
	public void testReadBloquant() throws InterruptedException {
		linda.write(motif);
		Thread th = new Thread() {
		            public void run() {
		                try {          
		                    linda.read(fauxmotif);
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
		assertEquals(th.getState(), Thread.State.TERMINATED);
		linda.take(motif); //to test lindaserver
		linda.take(fauxmotif); //to test lindaserver
	}
	

	@Test(expected=NullPointerException.class)
	public void testLectureNull() {
		linda.read(null);
	}
	
}

