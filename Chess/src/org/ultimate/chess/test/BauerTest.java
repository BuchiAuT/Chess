package org.ultimate.chess.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ultimate.chess.model.*;

public class BauerTest 
{
	Position pos1=new Position(3,1);
	Bauer bauer1=new Bauer(pos1, "W");
	
	Position pos2=new Position(3,1);
	Bauer bauer2=new Bauer(pos2,"W");

	@Test
	public void testSpielzugMoeglich() 
	{
		fail("Not yet implemented");
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
