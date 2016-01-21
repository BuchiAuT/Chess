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
import org.ultimate.chess.model.Bauer;
import org.ultimate.chess.model.Dame;
import org.ultimate.chess.model.Position;
import org.ultimate.chess.model.SpielFeld;
import org.ultimate.chess.model.SpielfeldIO;
import junit.framework.Assert;

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
		Dame dame = new Dame(pos, true);
		
		try
		{
			SpielFeld sf = SpielfeldIO.einlesen("feld.txt");
			Dame dame1 = (Dame)sf.holeFigur(pos);
						
			// 1 nach unten
			boolean beobachtet = dame1.spielzugMoeglich(sf, new Position(3,5));
			Assert.assertFalse(beobachtet);
						
			// 2 nach unten
			beobachtet = dame1.spielzugMoeglich(sf, new Position(3,4));
			Assert.assertTrue(beobachtet);
						
			// 3 nach unten
			beobachtet = dame1.spielzugMoeglich(sf, new Position(3,3));
			Assert.assertTrue(beobachtet);
			
			// 1 nach oben
			beobachtet = dame1.spielzugMoeglich(sf, new Position(3,7));
			Assert.assertTrue(beobachtet);
				
			// 1 nach rechts
			beobachtet = dame1.spielzugMoeglich(sf, new Position(4,6));
			Assert.assertTrue(beobachtet);
			
			// 1 nach links
			beobachtet = dame1.spielzugMoeglich(sf, new Position(2,6));
			Assert.assertTrue(beobachtet);
			
			// 1 nach links und 1 nach oben
			beobachtet = dame1.spielzugMoeglich(sf, new Position(2,7));
			Assert.assertTrue(beobachtet);
						
			// 1 nach links und 1 nach unten
			beobachtet = dame1.spielzugMoeglich(sf, new Position(2,5));
			Assert.assertTrue(beobachtet);
						
			// 1 nach rechts und 1 nach oben
			beobachtet = dame1.spielzugMoeglich(sf, new Position(4,7));
			Assert.assertTrue(beobachtet);
						
			// 1 nach rechts und 1 nach unten
			beobachtet = dame1.spielzugMoeglich(sf, new Position(4,5));
			Assert.assertTrue(beobachtet);
		}
		catch(FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testDame() 
	{
		fail("Not yet implemented");
		// Konstruktor
	}
}