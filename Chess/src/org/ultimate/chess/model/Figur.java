package org.ultimate.chess.model;

abstract class Figur 
{
	Position pos;

	public Figur(Position pos)
	{
		this.pos = pos;
	}

	boolean farbeWeiss;
	String name;
	public Figur(Position pos,String name)
	{	
		this.name = name;
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
	return name.charAt(1)+",W";
	}
	else
	{
	return name.charAt(1)+",S";
	}
}
	public abstract boolean spielZug(SpielFeld sp,Position nach);

	public abstract boolean spielzugMoeglich(SpielFeld sp, Position nach);
}
