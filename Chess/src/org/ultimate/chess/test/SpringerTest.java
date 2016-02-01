package org.ultimate.chess.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.ultimate.chess.model.*;

import junit.framework.Assert;

import org.junit.Test;

public class SpringerTest 
{
	@Test
	public void testSpielzugMoeglich1() 
	{		
		try
		{
			// weiﬂen Springer auf (3,3) setzen
			Position position=new Position(3,3);
			SpielFeld sf=SpielfeldIO.einlesen("TestData/Springertest1-Textdatei.txt");
			Springer springer=(Springer)sf.holeFigur(position);
			
			// ein Springer der Farbe weiﬂ wird getestet (von unten nach oben)
			
			// 2 nach unten 1 nach links auf freies Feld (2,1)
			boolean beobachtet =springer.spielzugMoeglich(sf, new Position(2,1));
			Assert.assertTrue(beobachtet);
			
			// 2 nach rechts auf 1 nach oben freies Feld (5,4)
			beobachtet=springer.spielzugMoeglich(sf, new Position(5,4));
			Assert.assertTrue(beobachtet);
			
			// 2 nach links 1 nach unten auf freies Feld (1,2)
			beobachtet=springer.spielzugMoeglich(sf, new Position(1,2));
			Assert.assertTrue(beobachtet);
			
			// 2 nach oben 1 nach rechts (4,5)
			beobachtet=springer.spielzugMoeglich(sf, new Position(4,5));
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
			// weiﬂen Springer auf (3,3), schwarze Dame auf (2,1), schwarze L‰ufer auf(5,2) & (1,2), schwarzen Bauer auf (4,5) setzen 
			Position position=new Position(3,3);
			SpielFeld sf=SpielfeldIO.einlesen("TestData/Springertest2-Textdatei.txt");
			Springer springer=(Springer)sf.holeFigur(position);
			
			// ein Springer der Farbe weiﬂ wird getestet (von unten nach oben)
			
			// 2 nach unten 1 nach links auf freies Feld (2,1)
			boolean beobachtet =springer.spielzugMoeglich(sf, new Position(2,1));
			Assert.assertTrue(beobachtet);
			
			// 2 nach rechts auf 1 nach oben freies Feld (5,4)
			beobachtet=springer.spielzugMoeglich(sf, new Position(5,4));
			Assert.assertTrue(beobachtet);
			
			// 2 nach links 1 nach unten auf freies Feld (1,2)
			beobachtet=springer.spielzugMoeglich(sf, new Position(1,2));
			Assert.assertTrue(beobachtet);
			
			// 2 nach oben 1 nach rechts (4,5)
			beobachtet=springer.spielzugMoeglich(sf, new Position(4,5));
			Assert.assertTrue(beobachtet); 
			
		}catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}
}
