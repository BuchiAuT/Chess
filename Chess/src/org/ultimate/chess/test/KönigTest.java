/**
 * 
 * @author Tobias M�ltner
 */

package org.ultimate.chess.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.ultimate.chess.model.*;

import junit.framework.Assert;

import org.junit.Test;

public class K�nigTest 
{
	@Test
	public void testSpielzugMoeglich1() 
	{
		try
		{
			// Wei�en K�nig auf 4,0 setzen, wei�e Dame(3,0) wei�en L�ufer (5,0), 3 wei�e Bauern (3,1),(4,1),(5,1) setzen
			Position position=new Position(4,0);
			SpielFeld sf=SpielfeldIO.einlesen("TestData/K�nigtest1-Textdatei.txt");
			K�nig k�nig=(K�nig)sf.holeFigur(position);
			
			// ein K�nig der Farbe wei� wird getestet (von unten nach oben)
			
			// 1 nach unten am Spielbeginn (sollte nicht m�glich sein)
			boolean beobachtet =k�nig.spielzugMoeglich(sf, new Position(4,-1));
			Assert.assertFalse(beobachtet);
			
			// 1 nach rechts am Spielbeginn (sollte nicht m�glich sein, da eigene Figur auf dem Feld ist)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(5,0));
			Assert.assertFalse(beobachtet);
			
			// 1 nach links am Spielbeginn (sollte nicht m�glich sein, da eigene Figur auf dem Feld ist)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(3,0));
			Assert.assertFalse(beobachtet);
			
			// 1x Diagonal nach oben links (sollte nicht m�glich sein, da eigene Figur auf dem Feld ist)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(3,1));
			Assert.assertFalse(beobachtet); // <-- falls keine eigene Figur auf diesem Feld steht, auf asserTrue �ndern!
			
			// 1x Diagonal nach oben rechts (sollte nicht m�glich sein, da eigene Figur auf dem Feld ist)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(5,1));
			Assert.assertFalse(beobachtet); // <-- falls keine eigene Figur auf diesem Feld steht, auf asserTrue �ndern!
			
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
			// K�nig auf 4,2 setzen, schwarzen L�ufer auf (3,2), Dame auf (5,3), Turm auf (4,3)
			Position position=new Position(4,2);
			SpielFeld sf=SpielfeldIO.einlesen("TestData/K�nigtest2-Textdatei.txt");
			K�nig k�nig=(K�nig)sf.holeFigur(position);
			
			// ein K�nig der Farbe wei� wird getestet (von unten nach oben)
			
			// 1 nach unten auf freies Feld
			boolean beobachtet =k�nig.spielzugMoeglich(sf, new Position(4,1));
			Assert.assertTrue(beobachtet);
			
			// 1 nach rechts auf freies Feld
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(5,2));
			Assert.assertTrue(beobachtet);
			
			// 1x nach links schwarzen L�ufer (3,2) schlagen 
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(3,2));
			Assert.assertTrue(beobachtet);
			
			// 1x Diagonal nach oben rechts (5,3) schwarze Dame schlagen
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(5,3));
			Assert.assertTrue(beobachtet); 
			
			// 1 nach oben (4,3) schwarzen Turm schlagen
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(4,3));
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
			// K�nig auf 4,0 setzen, schwarze T�rme auf (0,0) & (7,0)
			Position position=new Position(4,0);
			SpielFeld sf=SpielfeldIO.einlesen("TestData/K�nigtest3-Textdatei.txt");
			K�nig k�nig=(K�nig)sf.holeFigur(position);
			
			// ein K�nig der Farbe wei� wird getestet (von unten nach oben)
			
			// Rochade kurz
			boolean beobachtet =k�nig.spielzugMoeglich(sf, new Position(6,0));
			Assert.assertTrue(beobachtet);
			
			// Rochade lang
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(2,0));
			Assert.assertTrue(beobachtet);		
			
		}catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}

}
