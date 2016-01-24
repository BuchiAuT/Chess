package org.ultimate.chess.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.ultimate.chess.model.*;

import junit.framework.Assert;

import org.junit.Test;

public class SpringerTest 
{
	Position pos1=new Position(4,3);
	Springer springer1=new Springer(pos1,true);
	
	Position pos2=new Position(4,3);
	Springer springer2=new Springer(pos2,true);
	
	@Test
	public void testSpielzugMoeglich1() 
	{		
		try
		{
			// wei�en Springer auf (3,3) setzen
			Position position=new Position(3,3);
			SpielFeld sf=SpielfeldIO.einlesen("Springertest1-Textdatei.txt");
			K�nig k�nig=(K�nig)sf.holeFigur(position);
			
			// ein Springer der Farbe wei� wird getestet (von unten nach oben)
			
			// 2 nach unten 1 nach links auf freies Feld (2,1)
			boolean beobachtet =k�nig.spielzugMoeglich(sf, new Position(2,1));
			Assert.assertTrue(beobachtet);
			
			// 2 nach rechts auf 1 nach oben freies Feld (5,4)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(5,4));
			Assert.assertTrue(beobachtet);
			
			// 2 nach links 1 nach unten auf freies Feld (1,2)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(1,2));
			Assert.assertTrue(beobachtet);
			
			// 2 nach oben 1 nach rechts (4,5)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(4,5));
			Assert.assertTrue(beobachtet); 
			
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
			// wei�en Springer auf (3,3), schwarze Dame auf (2,1), schwarze L�ufer auf(5,2) & (1,2), schwarzen Bauer auf (4,5) setzen 
			Position position=new Position(3,3);
			SpielFeld sf=SpielfeldIO.einlesen("Springertest2-Textdatei.txt");
			K�nig k�nig=(K�nig)sf.holeFigur(position);
			
			// ein Springer der Farbe wei� wird getestet (von unten nach oben)
			
			// 2 nach unten 1 nach links auf freies Feld (2,1)
			boolean beobachtet =k�nig.spielzugMoeglich(sf, new Position(2,1));
			Assert.assertTrue(beobachtet);
			
			// 2 nach rechts auf 1 nach oben freies Feld (5,4)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(5,4));
			Assert.assertTrue(beobachtet);
			
			// 2 nach links 1 nach unten auf freies Feld (1,2)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(1,2));
			Assert.assertTrue(beobachtet);
			
			// 2 nach oben 1 nach rechts (4,5)
			beobachtet=k�nig.spielzugMoeglich(sf, new Position(4,5));
			Assert.assertTrue(beobachtet); 
			
		}catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testSpringer() 
	{
		assertEquals(pos1, pos2);
	}

}
