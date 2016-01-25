/**
 * 
 * @author Michael Krapf
 * 
 */

package org.ultimate.chess.test;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.ultimate.chess.model.Laeufer;
import org.ultimate.chess.model.Position;
import org.ultimate.chess.model.SpielFeld;
import org.ultimate.chess.model.SpielfeldIO;
import org.ultimate.chess.model.Turm;
import junit.framework.Assert;

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

	Position pos1 = new Position(7,0);
	Turm turm1 = new Turm(pos1, true);
	
	@Test
	public void testSpielzugMoeglich()
	{
		Position pos = new Position(0,7);
		Position pos2 = new Position(0,7);
		
		try
		{
			SpielFeld sf = SpielfeldIO.einlesen("TestData/TurmTestFile1.txt");
			Turm turm1 = (Turm)sf.holeFigur(pos);
						
			// nach rechts, sollte nicht gehen da eingesperrt
			boolean beobachtet = turm1.spielzugMoeglich(sf, new Position(1,7));
			Assert.assertFalse(beobachtet);
						
			// nach unten, sollte nicht gehen da eingesperrt
			beobachtet = turm1.spielzugMoeglich(sf, new Position(0,6));
			Assert.assertFalse(beobachtet);
			
// --------------------------------------------------------------------------------------
			
			SpielFeld sf2 = SpielfeldIO.einlesen("TestData/TurmTestFile2.txt");
			Turm turm2 = (Turm)sf2.holeFigur(pos2);
			
			// Turm des Gegners schlagen, nicht möglich da Bauer davor steht
			boolean beobachtet2 = turm2.spielzugMoeglich(sf2, new Position(0,0));
			Assert.assertFalse(beobachtet2);		
			
			// Bauer des Gegners schlagen
		    beobachtet2 = turm2.spielzugMoeglich(sf2, new Position(0,1));
			Assert.assertTrue(beobachtet2);
			
			// zu Position (4,7) fahren --> nicht möglich da dort die Dame steht
		    beobachtet2 = turm2.spielzugMoeglich(sf2, new Position(4,7));
			Assert.assertFalse(beobachtet2);
		}
		catch(FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testTurm()
	{
		Turm turm2 = turm1;
		assertEquals(turm1, turm2);
	}
}