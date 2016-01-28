/**
 * 
 * @author Tobias M�ltner
 */

package org.ultimate.chess.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.ultimate.chess.model.*;

import junit.framework.Assert;

public class BauerTest 
{
	Position pos1=new Position(1,4);
	Position pos2=new Position(1,4);
	
	Bauer bauer1=new Bauer(pos1,true); //wei�er Bauer
	Bauer bauer2=new Bauer(pos2,true); //schwarzer Bauer
	
	@Test
	public void testSpielzugMoeglich() 
	{
		try
		{
			// Im Textfile sollten auf Positionen (2,5) und (4,5) wei�e Figuren stehen
			// Und auf Position (3,6) ein schwarzer Bauer
			Position position=new Position(3,6);
			SpielFeld sf=SpielfeldIO.einlesen("TestData/Bauertest-Textdatei.txt");
			Bauer bauer=(Bauer)sf.holeFigur(position);
			
			// ein Bauer der Farbe schwarz wird getestet (von oben nach unten)
			
			// 3 nach unten (sollte nicht m�glich sein)
			boolean beobachtet =bauer.spielzugMoeglich(sf, new Position(3,3));
			Assert.assertFalse(beobachtet);
			
			// 2 nach unten am Spielbeginn (nur am Anfang m�glich)
			beobachtet=bauer.spielzugMoeglich(sf, new Position(3,4));
			Assert.assertTrue(beobachtet);
			
			// 1 nach unten am Spielbeginn
			beobachtet=bauer.spielzugMoeglich(sf, new Position(3,5));
			Assert.assertTrue(beobachtet);
			
			// 1x Diagonal nach unten links schlagen
			beobachtet=bauer.spielzugMoeglich(sf, new Position(2,5));
			Assert.assertTrue(beobachtet); // 
			
			// 1x Diagonal nach unten rechts schlagen
			beobachtet=bauer.spielzugMoeglich(sf, new Position(4,5));
			Assert.assertTrue(beobachtet); // <-- falls keine eigene Figur auf diesem Feld steht, auf asserTrue �ndern!
			
		}catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testGetObFigurGeholtWerdenKann() 
	{
		if(bauer1.getObFigurGeholtWerdenKann() == (bauer2.getObFigurGeholtWerdenKann()))
		{
			assertTrue(true);
		}
		else
		{
			assertTrue(false);
		}
	}

}
