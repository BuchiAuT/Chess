/**
 * 
 * @author Michael Krapf
 * 
 */

package org.ultimate.chess.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.ultimate.chess.model.Dame;
import org.ultimate.chess.model.Laeufer;
import org.ultimate.chess.model.Position;

public class LaeuferTest 
{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSpielZug() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSpielzugMoeglich() 
	{
		Position pos = new Position(1, 3);
		Laeufer laeufer = new Laeufer(pos, "Läufer");
	}

	@Test
	public void testLaeufer() 
	{
		fail("Not yet implemented");
		// Konstruktor
	}
}