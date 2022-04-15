package linda.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;

import linda.*;
import linda.server.LindaClientCache;
import linda.server.LindaserverImplCache;

public class TestsUnitairesTakeCache {
	private static LindaClientCache cl1,cl2;
	private static Tuple motif;
	private static Tuple fauxmotif;
	private static Tuple tuple;
	private static Tuple vide;
	private static LindaserverImplCache s;
	
	@BeforeClass
	public static void BeforeClass() throws Exception {
		motif = new Tuple(String.class, Integer.class);
		fauxmotif = new Tuple(Integer.class, String.class);
		tuple = new Tuple("CacheTakeTest", 22);
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
		//linda = new linda.shm.CentralizedLindaCache();
		cl1 = new linda.server.LindaClientCache("//localhost:4000/MonServeur");
		cl2 = new linda.server.LindaClientCache("//localhost:4000/MonServeur");
	}
	
	@Test
	public void testTakeSimple() {
		cl1.write(tuple);
		// On lit et on take
		assertFalse(cl1.cacheContains(tuple));
		assertFalse(cl2.cacheContains(tuple));
		cl1.read(tuple);
		cl2.read(tuple);
		assertTrue(cl1.cacheContains(tuple));
		assertTrue(cl2.cacheContains(tuple));
		
		assertEquals(cl2.take(tuple),tuple);
		
		assertFalse(cl1.cacheContains(tuple));
		assertFalse(cl2.cacheContains(tuple));
		
		// Relecture après le take donc tuple inexistant
		assertEquals(cl1.tryRead(tuple),null);
		cl1.tryTake(tuple);
		cl1.debug("takeSimple");
	}

	@Test
	public void testTakeMotifAvecTuple() {
		cl1.write(tuple);
		
		assertFalse(cl1.cacheContains(tuple));
		assertFalse(cl2.cacheContains(tuple));
		cl1.read(tuple);
		assertTrue(cl1.cacheContains(tuple));
		cl2.read(tuple);
		assertTrue(cl2.cacheContains(tuple));
		
		assertEquals(cl2.take(motif), tuple);
		
		assertFalse(cl1.cacheContains(tuple));
		assertFalse(cl2.cacheContains(tuple));
		
		// Relecture après le take donc motif inexistant
		assertEquals(cl1.tryRead(motif),null);
		cl1.tryTake(tuple);
		cl1.debug("TakeMotifAvecTuple");
	}
	
	
	
	
	@Test
	public void testTakeTupleVide() {
		cl1.write(vide);
		// On lit et on take
		assertFalse(cl1.cacheContains(vide));
		assertFalse(cl2.cacheContains(vide));
		cl1.read(vide);
		assertTrue(cl1.cacheContains(vide));
		cl2.read(vide);
		assertTrue(cl2.cacheContains(vide));
		
		assertEquals(cl2.take(vide),vide);
		
		assertFalse(cl1.cacheContains(vide));
		assertFalse(cl2.cacheContains(vide));
		
		// Meme s'il est vide il est supprimé
		assertEquals(cl1.tryRead(vide), null);
		cl1.tryTake(vide);
		cl1.debug("Vide");
	}

	@Test
	public void testTakeBloquant() throws InterruptedException {
		cl1.write(motif);
		Thread th = new Thread() {
		            public void run() {
		                try {

		            		cl2.read(fauxmotif);
		            		cl1.read(fauxmotif);
		            		assertTrue(cl1.cacheContains(fauxmotif));
		            		assertTrue(cl2.cacheContains(fauxmotif));
		                    cl1.take(fauxmotif);
		                    assertFalse(cl1.cacheContains(fauxmotif));
		            		assertFalse(cl2.cacheContains(fauxmotif));
		                } catch (Exception e) {
		                    ;
		                }
		            }
		};
        th.start();
        Thread.sleep(1000);
        // Puisque le tryRead n'est pas bloquant et que dans ce cas il ne trouvera pas le motif qu'il cherchait alors le thread doit se terminer
       
        // Le fauxmotif n'est pas encore écrit
		assertNull(cl1.tryRead(fauxmotif));
		// On écrit le motif et le thread maintenant doit se terminer normalement
		cl2.write(fauxmotif);
		
		Thread.sleep(1000);
		// Là le take est fait, le tryRead doit normalement retourner null
		assertNull(cl1.tryRead(fauxmotif));
		assertEquals(th.getState(), Thread.State.TERMINATED);
		cl1.tryTake(motif);
		cl1.tryTake(fauxmotif);
		cl1.debug("Bloquantn");
	}

	@Test(expected=NullPointerException.class)
	public void testtakeNull() {
		cl1.take(null);
	}
}
