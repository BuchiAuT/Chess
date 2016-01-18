/**
 * 
 * @author Tobias Möltner
 */

package org.ultimate.chess.test;

import static org.junit.Assert.*;
import org.ultimate.chess.model.*;

import org.junit.Test;

public class KönigTest 
{
	Position pos1=new Position(6,2);
	König könig1=new König(pos1,"K");
	
	Position pos2=new Position(6,2);
	König könig2=new König(pos2,"K");
	@Test
	public void testSpielzugMoeglich() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testKönig() 
	{
		assertEquals(könig1, könig2);
	}

}
