package org.ultimate.chess.model;

public class Position 
{
	private int x;
	private int y;
	public Position(int x, int y)	
	{
		this.x = x;
		this.y = y;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getX()
	{
		return x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public int getY()
	{
		return y;
	}
	@Override
	public boolean equals(Object arg0) {
	 Position p = (Position)arg0;
		return p.getX() == x &&  p.getY() == y;
	}
}
