package org.ultimate.chess.test;

import static org.junit.Assert.*;
import org.ultimate.chess.model.*;

import org.junit.Test;

public class SpringerTest 
{
	Position pos1=new Position(4,3);
	Springer springer1=new Springer(pos1,"S");
	
	Position pos2=new Position(4,3);
	Springer springer2=new Springer(pos2,"S");
	
	@Test
	public void testSpielzugMoeglich() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSpringer() 
	{
		assertEquals(pos1, pos2);
	}

}
