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
import org.ultimate.chess.model.Dame;
import org.ultimate.chess.model.Laeufer;
import org.ultimate.chess.model.Position;
import org.ultimate.chess.model.SpielFeld;
import org.ultimate.chess.model.SpielfeldIO;
import junit.framework.Assert;

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
		Laeufer laeufer = new Laeufer(pos, true);

		try
		{
			SpielFeld sf = SpielfeldIO.einlesen("Dateiname");
			Laeufer laeufer1 = (Laeufer)sf.holeFigur(pos);
						
			// nach rechts und nach oben
			boolean beobachtet = laeufer1.spielzugMoeglich(sf, new Position(4,4));
			Assert.assertFalse(beobachtet);
						
			// nach rechts und nach unten
			beobachtet = laeufer1.spielzugMoeglich(sf, new Position(4,2));
			Assert.assertFalse(beobachtet);
			
			// nach links und nach unten
			beobachtet = laeufer1.spielzugMoeglich(sf, new Position(2,2));
			Assert.assertFalse(beobachtet);
			
			// nach links und nach oben
			beobachtet = laeufer1.spielzugMoeglich(sf, new Position(2,4));
			Assert.assertFalse(beobachtet);
		}
		catch(FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testLaeufer() 
	{
		fail("Not yet implemented");
		// Konstruktor
	}
}