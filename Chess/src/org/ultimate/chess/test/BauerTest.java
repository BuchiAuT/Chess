/**
 * 
 * @author Tobias Möltner
 */

package org.ultimate.chess.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;
import org.ultimate.chess.model.*;

import junit.framework.Assert;

public class BauerTest 
{
	// so lafft des nit...
	
	Position pos1=new Position(3,1);
	Bauer bauer1=new Bauer(pos1, "W");
	
	Position pos2=new Position(3,1);
	Bauer bauer2=new Bauer(pos2,"W");

	@Test
	public void testSpielzugMoeglich() 
	{
		try
		{
			// Bernie muss Spielfeld einlesen noch machen...
			SpielFeld sf=SpielfeldIO.einlesen("dateeeeinamealda");
			Bauer bauer=(Bauer)sf.getFeld(3,6);
			
			// ein Bauer der Farbe schwarz wird getestet (von oben nach unten)
			
			// 3 nach unten (sollte nicht möglich sein)
			boolean beobachtet =b.spielzugMoeglich(sf, new Position(3,3));
			Assert.assertFalse(beobachtet);
			
			// 2 nach unten am Spielbeginn (nur am Anfang möglich)
			beobachtet=b.spielzugMoeglich(sf, new Position(3,4));
			Assert.assertTrue(beobachtet);
			
			// 1 nach unten am Spielbeginn
			beobachtet=b.spielzugMoeglich(sf, new Position(3,5));
			Assert.assertTrue(beobachtet);
			
			// 1x Diagonal nach unten links schlagen
			beobachtet=b.spielzugMoeglich(sf, new Position(2,5));
			Assert.assertFalse(beobachtet); // <-- falls keine eigene Figur auf diesem Feld steht, auf asserTrue ändern!
			
			// 1x Diagonal nach unten rechts schlagen
			beobachtet=b.spielzugMoeglich(sf, new Position(4,5));
			Assert.assertFalse(beobachtet); // <-- falls keine eigene Figur auf diesem Feld steht, auf asserTrue ändern!
			
		}catch (FileNotFoundException exception)
		{
			exception.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void testBauer() 
	{
		assertEquals(bauer1, bauer2);
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
