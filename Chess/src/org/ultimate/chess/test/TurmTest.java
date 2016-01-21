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

	@Test
	public void testSpielzugMoeglich()
	{
		Position pos = new Position(1, 7);
		Turm turm = new Turm(pos, true);
		
		try
		{
			SpielFeld sf = SpielfeldIO.einlesen("feld.txt");
			Turm turm1 = (Turm)sf.holeFigur(pos);
						
			// nach oben
			boolean beobachtet = turm1.spielzugMoeglich(sf, new Position(3,4));
			Assert.assertFalse(beobachtet);
						
			// nach unten
			beobachtet = turm1.spielzugMoeglich(sf, new Position(3,2));
			Assert.assertFalse(beobachtet);
			
			// nach links
			beobachtet = turm1.spielzugMoeglich(sf, new Position(2,3));
			Assert.assertFalse(beobachtet);
			
			// nach rechts
			beobachtet = turm1.spielzugMoeglich(sf, new Position(4,3));
			Assert.assertFalse(beobachtet);
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
		fail("Not yet implemented");
		// Konstruktor
	}
}