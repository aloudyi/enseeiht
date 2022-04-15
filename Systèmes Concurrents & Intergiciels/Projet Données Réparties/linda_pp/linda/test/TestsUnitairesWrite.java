package linda.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import linda.*;

public class TestsUnitairesWrite {
	
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
	public void testWriteSimple() {
		linda.write(tuple);
		assertEquals(linda.tryRead(tuple),tuple);
		linda.tryTake(tuple);
	}
	
	@Test
	public void testWriteInsensibleRepetition() {
		for (int i = 0; i < 20; i++) {
			linda.write(tuple);
		}
		assertEquals(linda.takeAll(tuple).size(),20);
	}
	
	@Test
	public void testPeuWriteVide() {
		linda.write(vide);
		assertEquals(linda.tryRead(vide), vide);
		linda.tryTake(vide);
	}
	
	
	@Test(expected=NullPointerException.class)
	public void testWriteNull() {
		linda.write(null);
	}

}