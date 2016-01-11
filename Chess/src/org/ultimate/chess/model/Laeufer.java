package org.ultimate.chess.model;

public class Laeufer extends Figur
{	
	public Laeufer(Position pos, String name)
	{
		super(pos,name);
	}
	
	public boolean spielZug(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		// des steht da damit i's commiten kann...
		
		
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
		
		// Diagonal schlagen	(alle Kombinationen)
		
		
		if((((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()-1)))|| (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()-1))))
		{	
			if((((spielfeld.holeFigur(pos).pos.getX()==position.getX()) && (spielfeld.holeFigur(pos).pos.getY())==position.getY())) && (spielfeld.holeFigur(pos).getFarbe()!=this.getFarbe())) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
				{
					spielfeld.figuren.remove(spielfeld.holeFigur(pos));		// Figur vom Spielfeld entfernen
						
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach rechts und nach oben
		
		if(((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))) 
		{
			if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
				{
						statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts und nach unten
		
		if(((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()-1))) 
		{
			if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
				{
					statement=true;
				}
			}
		}
				
		// nach links und nach oben
				
		if(((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()+1))) 
		{
			if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
				{
					statement=true;
				}
			}
		}
				
		// nach links und nach unten
				
		if(((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()-1))) 
		{
			if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
				{
					statement=true;
				}
			}
		}
						
		return statement;
	}
}