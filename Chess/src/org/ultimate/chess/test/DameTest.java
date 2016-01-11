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
import org.ultimate.chess.model.Position;

public class DameTest 
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
		Position pos = new Position(1, 5);
		Dame dame = new Dame(pos, "Dame");
	}

	@Test
	public void testDame() 
	{
		fail("Not yet implemented");
		// Konstruktor
	}
}