package org.ultimate.chess.model;

public class K�nig extends Figur
{
	// des steht da damit i's commiten kann...
	private boolean kurzeRochadeM�glich;
	private boolean langeRochadeM�glich;
	
	public K�nig(Position pos, String name)
	{
		super(pos,name);
	}
	
	public boolean spielZug(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		
		if(spielzugMoeglich(spielfeld,position))
		{
			statement=true;
			this.pos.setX(position.getX());
			this.pos.setY(position.getY());
		}
		
		return statement;
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Diagonal schlagen/fahren 	(links vor, rechts vor, links zur�ck, rechts zur�ck)	
		
		
		if((((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()-1))) || (((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))))	
		{	
				if((((spielfeld.holeFigur(pos).pos.getX()==position.getX()) && (spielfeld.holeFigur(pos).pos.getY()==position.getY())) && (spielfeld.holeFigur(pos).getFarbe()!=this.getFarbe())) || ((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY())))	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
					{
						spielfeld.figuren.remove(spielfeld.holeFigur(pos));		// Figur vom Spielfeld entfernen
						
						statement=true;
					}
				}
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// fragen ob kurze Rochade (Turmposition: x=7, y=0 & K�nigposition: x=4, y=0) m�glich
		if(((this.pos.getX()==4) && (this.pos.getY()==0)) && (spielfeld.holeFigur(pos).pos.getX()==7) && ((spielfeld.holeFigur(pos).pos.getY()==0)) && (spielfeld.holeFigur(pos).getFarbe()==this.getFarbe()))
		{
			kurzeRochadeM�glich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// fragen ob lange Rochade(Turmposition: x=0, y=0 & K�nigposition: x=4, y=0) m�glich
		if(((this.pos.getX()==4) && (this.pos.getY()==0)) && (spielfeld.holeFigur(pos).pos.getX()==0) && ((spielfeld.holeFigur(pos).pos.getY()==0)) && (spielfeld.holeFigur(pos).getFarbe()==this.getFarbe()))
		{
			langeRochadeM�glich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// kurze Rochade ausf�hren
		if(((position.getX())==(this.pos.getX()+2)) && ((position.getY())==(this.pos.getY()))) 
		{
			if(kurzeRochadeM�glich)
			{
				statement=true;
			}
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// lange Rochade ausf�hren
		if(((position.getX())==(this.pos.getX()-2)) && ((position.getY())==(this.pos.getY()))) 
		{
			if(langeRochadeM�glich)
			{
				statement=true;
			}
		}
		
		return statement;
		
	}
	
}
		
		
		