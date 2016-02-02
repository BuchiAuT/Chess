package org.ultimate.chess.model;

public class Figur 
{
	Position pos;
	private char name;
	boolean farbeWeiss; //true = weiﬂ
	
	public Figur(Position pos,boolean farbeWeiss)
	{	
		this.pos = pos;
		this.farbeWeiss = farbeWeiss;
		
	}
	
	public boolean getFarbe()
	{
		return farbeWeiss;
	}
	
	public char getName()
	{
		return name;
	}
	
	public Position getPos()
	{
		return pos;
	}

	public boolean spielZug(SpielFeld sp,Position nach)
	{
		boolean statement=false;
		
		if(spielzugMoeglich(sp,nach))
		{
			statement=true;
			for(int i = 0; i < sp.figuren.size();i++)
			{
				if(sp.figuren.get(i).getPos() == nach)
				{
					sp.figuren.remove(i);
				}
			}
			this.pos.setX(nach.getX());
			this.pos.setY(nach.getY());
		}
				
		return statement;
	}
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		return false;
	}
}
