package org.ultimate.chess.model;

abstract class Figur 
{
	Position pos;
	private String name;
	boolean farbeWeiss;
	public Figur(Position pos,boolean farbeWeiss)
	{	
		this.pos = pos;
		this.farbeWeiss = farbeWeiss;
		
	}
	public boolean getFarbe()
	{
		return farbeWeiss;
	}
	public String getName()
	{
		return name;
	}
	public Position getPos()
	{
		return pos;
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
	public boolean spielZug(SpielFeld sp,Position nach)
	{
		boolean statement=false;
		
		if(spielzugMoeglich(sp,nach))
		{
			statement=true;
			this.pos.setX(nach.getX());
			this.pos.setY(nach.getY());
		}
				
		return statement;
	}

	public abstract boolean spielzugMoeglich(SpielFeld sp, Position nach);
}
