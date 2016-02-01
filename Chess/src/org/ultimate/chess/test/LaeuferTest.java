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

	Position pos1 = new Position(5,0);
	Laeufer laeufer1 = new Laeufer(pos1, true);
	
	@Test
	public void testSpielzugMoeglich() 
	{
		Position pos = new Position(2,7);
		Position pos2 = new Position(6,6);

		try
		{
			SpielFeld sf = SpielfeldIO.einlesen("TestData/LaeuferTestFile1.txt");
			Laeufer laeufer = (Laeufer)sf.holeFigur(pos);
						
			// kann nicht fahren, Bauer im Weg
			boolean beobachtet = laeufer.spielzugMoeglich(sf, new Position(1,6));
			Assert.assertFalse(beobachtet);
						
			// kann nicht fahren, Bauer im Weg
			beobachtet = laeufer.spielzugMoeglich(sf, new Position(3,6));
			Assert.assertFalse(beobachtet);
			
// --------------------------------------------------------------------------------------
			SpielFeld sf2 = SpielfeldIO.einlesen("TestData/LaeuferTestFile2.txt");
			Laeufer laeufer2 = (Laeufer)sf2.holeFigur(pos2);
			
			// kann nicht schlagen, da Bauer im Weg
			boolean beobachtet2 = laeufer.spielzugMoeglich(sf2, new Position(0,0));
			Assert.assertFalse(beobachtet2);
			
			// kann den Bauer schlagen
		    beobachtet2 = laeufer.spielzugMoeglich(sf2, new Position(1,1));
			Assert.assertTrue(beobachtet2);	
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
		Laeufer laeufer2 = laeufer1;
		assertEquals(laeufer1, laeufer2);
	}
}