/**
 * 
 * @author Tobias M�ltner
 */

package org.ultimate.chess.test;

import static org.junit.Assert.*;
import org.ultimate.chess.model.*;

import org.junit.Test;

public class K�nigTest 
{
	Position pos1=new Position(6,2);
	K�nig k�nig1=new K�nig(pos1,"K");
	
	Position pos2=new Position(6,2);
	K�nig k�nig2=new K�nig(pos2,"K");
	@Test
	public void testSpielzugMoeglich() 
	{
		fail("Not yet implemented");
	}

	@Test
	public void testK�nig() 
	{
		assertEquals(k�nig1, k�nig2);
	}

}
