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
import org.ultimate.chess.model.Laeufer;
import org.ultimate.chess.model.Position;
import org.ultimate.chess.model.Turm;

public class TurmTest 
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
		Position pos = new Position(1, 7);
		Turm turm = new Turm(pos, "Turm");
	}

	@Test
	public void testTurm()
	{
		fail("Not yet implemented");
		// Konstruktor
	}
}