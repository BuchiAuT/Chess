/**
 * 
 * @author Tobias Möltner
 */

package org.ultimate.chess.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.ultimate.chess.model.*;

import junit.framework.Assert;

import org.junit.Test;

public class KönigTest 
{
	Position pos1=new Position(6,2);
	König könig1=new König(pos1,true);
	
	Position pos2=new Position(6,2);
	König könig2=new König(pos2,true);
	
	@Test
	public void testSpielzugMoeglich1() 
	{
		try
		{
			// Weißen König auf 4,0 setzen, weiße Dame(3,0) weißen Läufer (5,0), 3 weiße Bauern (3,1),(4,1),(5,1) setzen
			Position position=new Position(4,0);
			SpielFeld sf=SpielfeldIO.einlesen("Königtest1-Textdatei.txt");
			König könig=(König)sf.holeFigur(position);
			
			// ein König der Farbe weiß wird getestet (von unten nach oben)
			
			// 1 nach unten am Spielbeginn (sollte nicht möglich sein)
			boolean beobachtet =könig.spielzugMoeglich(sf, new Position(4,-1));
			Assert.assertFalse(beobachtet);
			
			// 1 nach rechts am Spielbeginn (sollte nicht möglich sein, da eigene Figur auf dem Feld ist)
			beobachtet=könig.spielzugMoeglich(sf, new Position(5,0));
			Assert.assertFalse(beobachtet);
			
			// 1 nach links am Spielbeginn (sollte nicht möglich sein, da eigene Figur auf dem Feld ist)
			beobachtet=könig.spielzugMoeglich(sf, new Position(3,0));
			Assert.assertFalse(beobachtet);
			
			// 1x Diagonal nach oben links (sollte nicht möglich sein, da eigene Figur auf dem Feld ist)
			beobachtet=könig.spielzugMoeglich(sf, new Position(3,1));
			Assert.assertFalse(beobachtet); // <-- falls keine eigene Figur auf diesem Feld steht, auf asserTrue ändern!
			
			// 1x Diagonal nach oben rechts (sollte nicht möglich sein, da eigene Figur auf dem Feld ist)
			beobachtet=könig.spielzugMoeglich(sf, new Position(5,1));
			Assert.assertFalse(beobachtet); // <-- falls keine eigene Figur auf diesem Feld steht, auf asserTrue ändern!
			
		}catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testSpielzugMoeglich2() 
	{
		try
		{
			// König auf 4,2 setzen, schwarzen Läufer auf (3,2), Dame auf (5,3), Turm auf (4,3
			Position position=new Position(4,2);
			SpielFeld sf=SpielfeldIO.einlesen("Königtest2-Textdatei.txt");
			König könig=(König)sf.holeFigur(position);
			
			// ein König der Farbe weiß wird getestet (von unten nach oben)
			
			// 1 nach unten auf freies Feld
			boolean beobachtet =könig.spielzugMoeglich(sf, new Position(4,1));
			Assert.assertTrue(beobachtet);
			
			// 1 nach rechts auf freies Feld
			beobachtet=könig.spielzugMoeglich(sf, new Position(5,2));
			Assert.assertTrue(beobachtet);
			
			// 1x nach links schwarzen Läufer (3,2) schlagen 
			beobachtet=könig.spielzugMoeglich(sf, new Position(3,2));
			Assert.assertTrue(beobachtet);
			
			// 1x Diagonal nach oben rechts (5,3) schwarze Dame schlagen
			beobachtet=könig.spielzugMoeglich(sf, new Position(5,3));
			Assert.assertTrue(beobachtet); 
			
			// 1 nach oben (4,3) schwarzen Turm schlagen
			beobachtet=könig.spielzugMoeglich(sf, new Position(4,3));
			Assert.assertTrue(beobachtet);
			
			
		}catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testSpielzugMoeglich3() 
	{
		try
		{
			//Rochade lang & kurz
			// König auf 4,0 setzen, schwarze Türme auf (0,0) & (7,0)
			Position position=new Position(4,0);
			SpielFeld sf=SpielfeldIO.einlesen("Königtest3-Textdatei.txt");
			König könig=(König)sf.holeFigur(position);
			
			// ein König der Farbe weiß wird getestet (von unten nach oben)
			
			// Rochade kurz
			boolean beobachtet =könig.spielzugMoeglich(sf, new Position(6,0));
			Assert.assertTrue(beobachtet);
			
			// Rochade lang
			beobachtet=könig.spielzugMoeglich(sf, new Position(2,0));
			Assert.assertTrue(beobachtet);		
			
		}catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testKönig() 
	{
		König könig3=könig1;
		
		assertEquals(könig1, könig3);
	}

}
