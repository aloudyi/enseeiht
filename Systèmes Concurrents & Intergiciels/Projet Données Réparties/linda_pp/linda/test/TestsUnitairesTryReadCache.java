package linda.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

import linda.*;
import linda.server.LindaClientCache;
import linda.server.LindaserverImplCache;

public class TestsUnitairesTryReadCache {
	
	private static LindaClientCache client;
	private static Tuple motif;
	private static Tuple fauxmotif;
	private static Tuple tuple;
	private static Tuple vide;
	private static LindaserverImplCache s;
	
	
	@BeforeClass
	public static void BeforeClass() throws Exception {
		motif = new Tuple(String.class, Integer.class);
		fauxmotif = new Tuple(Integer.class, String.class);
		tuple = new Tuple("testCacheTryRead", 22);
		vide = new Tuple();
		try {
			 s =new linda.server.LindaserverImplCache();
			s.main(new String[] {"4000", "MonServeur"});
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setUp() {
		//linda = new linda.shm.CentralizedLinda();
		client = new linda.server.LindaClientCache("//localhost:4000/MonServeur");
	}
	
	@Test
	public void testLectureSimple() {
		client.write(tuple);
		//Le cache ne doit pas contenir tuple
		assertFalse(client.cacheContains(tuple));
		
		assertEquals(client.tryRead(tuple),tuple);
		
		//Le cache doit contenir tuple
		assertTrue(client.cacheContains(tuple));
		
		assertEquals(client.tryRead(tuple),tuple);
		
		//Le cache doit contenir tuple
		assertTrue(client.cacheContains(tuple));
		
		client.take(tuple); //to test lindaserver
	}

	@Test
	public void testLectureMotifAvecTuple() {
		client.write(tuple);
		//Le cache ne doit contenir ni tuple ni motif 
		assertFalse(client.cacheContains(tuple));
		assertFalse(client.cacheContains(motif));
		
		assertEquals(client.tryRead(motif),tuple);
		
		//Le cache doit contenir le tuple mais non le motif
		assertTrue(client.cacheContains(tuple));
		assertFalse(client.cacheContains(motif));
		
		client.take(tuple); //to test lindaserver
	}
	
	@Test
	public void testLectureMotifAvecMotif() {
		client.write(motif);
		//Le cache ne doit pas contenir motif
		assertFalse(client.cacheContains(motif));
		
		assertEquals(client.tryRead(motif),motif);
		
		//Le cache doit contenir motif
		assertTrue(client.cacheContains(motif));
		
		client.take(motif); //to test lindaserver
	}
	
	@Test
	public void testLectureTupleAvecMotif() {
		client.write(motif);
		// Le motif n'est pas trouvé donc le tryRead retournera null
		assertEquals(client.tryRead(tuple), null);
		
		//Le cache ne doit contenir ni tuple ni motif 
		assertFalse(client.cacheContains(tuple));
		assertFalse(client.cacheContains(motif));
		
		// On read maintenant le motif avec read mais puisqu'il est bloquant il faut qu'il le trouve donc on commence par un write
		client.write(tuple);
		// Il doit le trouver maintenant normalement
		
		//Le cache ne doit contenir ni tuple ni motif 
		assertFalse(client.cacheContains(tuple));
		assertFalse(client.cacheContains(motif));
		
		assertEquals(client.tryRead(tuple), tuple);
		
		//Le cache doit contenir le tuple mais non le motif
		assertTrue(client.cacheContains(tuple));
		assertFalse(client.cacheContains(motif));
		
		client.take(tuple); //to test lindaserver
		client.take(motif); //to test lindaserver
	}
	
	@Test
	public void testTryReadNonBloquant() throws InterruptedException {
		client.write(motif);
		Thread th = new Thread() {
		            public void run() {
		                try {
		                    client.tryRead(fauxmotif);
		                    
		                } catch (Exception e) {
		                    ;
		                }
		            }
		};
        th.start();
        Thread.sleep(1000);
        // Puisque le tryRead n'est pas bloquant et que dans ce cas il ne trouvera pas le motif qu'il cherchait alors le thread doit se terminer
        assertEquals(th.getState(), Thread.State.TERMINATED);
        assertFalse(client.cacheContains(fauxmotif));
        // Et il doir retourner un nul
		assertNull(client.tryRead(fauxmotif));
		client.take(motif);
	}
	

	@Test(expected=NullPointerException.class)
	public void testLectureNull() {
		client.tryRead(null);
	}
	
}
