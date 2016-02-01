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
import org.ultimate.chess.model.König;
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

	Position pos1 = new Position(4,0);
	Dame dame1 = new Dame(pos1, true);
	
	@Test
	public void testSpielzugMoeglich() 
	{
		Position pos = new Position(4,4);
		Position pos2 = new Position(4,5);
		
		try
		{
			SpielFeld sf1 = SpielfeldIO.einlesen("TestData/DameTestFile1.txt");
			SpielFeld sf2 = SpielfeldIO.einlesen("TestData/DameTestFile2.txt");
			
			Dame dame1 = (Dame)sf1.holeFigur(pos);
						
			// 1 nach unten
			boolean beobachtet = dame1.spielzugMoeglich(sf1, new Position(4,3));
			Assert.assertTrue(beobachtet);
						
			// 2 nach unten
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(4,2));
			Assert.assertTrue(beobachtet);
			
			// 1 nach oben
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(4,5));
			Assert.assertTrue(beobachtet);
			
			// 4 nach oben
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(4,8));
			Assert.assertFalse(beobachtet);
				
			// 1 nach rechts
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(5,4));
			Assert.assertTrue(beobachtet);
			
			// 1 nach links
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(3,4));
			Assert.assertTrue(beobachtet);
			
			// 1 nach links und 1 nach oben
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(3,5));
			Assert.assertTrue(beobachtet);
						
			// 1 nach links und 1 nach unten
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(3,3));
			Assert.assertTrue(beobachtet);
						
			// 1 nach rechts und 1 nach oben
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(5,5));
			Assert.assertTrue(beobachtet);
						
			// 1 nach rechts und 1 nach unten
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(5,3));
			Assert.assertTrue(beobachtet);
			
			// 1 nach rechts und 1 nach unten
			beobachtet = dame1.spielzugMoeglich(sf1, new Position(2,3));
			Assert.assertFalse(beobachtet);
// --------------------------------------------------------------------------------------
			Dame dame2 = (Dame)sf2.holeFigur(pos2);
			
			// an Position des eigenen Bauers fahren --> sollte nicht möglich sein
			boolean beobachtet2 = dame2.spielzugMoeglich(sf2, new Position(7,5));
			Assert.assertFalse(beobachtet2);
									
			// Turm des Gegners schlagen --> nicht möglich da Bauer davor steht
			beobachtet = dame2.spielzugMoeglich(sf2, new Position(7,0));
			Assert.assertFalse(beobachtet2);
						
			// Bauer des Gegners schlagen --> sollte möglich sein
			beobachtet = dame2.spielzugMoeglich(sf2, new Position(6,1));
			Assert.assertTrue(beobachtet2);
						
			// Bauer schlagen (4,3) --> sollte möglich sein
			beobachtet = dame2.spielzugMoeglich(sf2, new Position(4,3));
			Assert.assertTrue(beobachtet2);	
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
		Dame dame2 = dame1;
		assertEquals(dame1, dame2);
	}
}