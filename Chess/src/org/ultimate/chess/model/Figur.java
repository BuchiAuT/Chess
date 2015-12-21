package org.ultimate.chess.model;

abstract class Figur 
{
	Position pos;
	public Figur(Position pos)
	{
		this.pos = pos;
	}
	public abstract boolean spielZug(SpielFeld sp,Position nach);

	public abstract boolean spielZug(SpielFeld sp, Position von, Position nach);
}
