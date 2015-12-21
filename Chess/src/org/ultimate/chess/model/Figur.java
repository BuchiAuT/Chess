package org.ultimate.chess.model;
import org.ultimate.chess.logic.Position;
import org.ultimate.chess.logic.SpielFeld;

abstract class Figur 
{
	Position pos;
	boolean farbeWeiss;
	public Figur(Position pos)
	{	
		if(pos.getY()== 0 || pos.getX()== 1)
		{
			farbeWeiss = true;
		}
		else
		{
			farbeWeiss = false;
		}
		this.pos = pos;
	}
@Override
public String toString() 
{
	if(farbeWeiss)
	{
	return ",Weiss";
	}
	else
	{
	return ",Schwarz";
	}
}
	public abstract boolean spielZug(SpielFeld sp,Position nach);

	public abstract boolean spielZug(SpielFeld sp, Position von, Position nach);
}
