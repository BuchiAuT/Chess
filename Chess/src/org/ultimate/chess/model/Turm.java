package org.ultimate.chess.model;

public class Turm extends Figur
{	
	public Turm(Position pos, String name)
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
		
		// figuren schlagen	(alle Kombinationen)
		
		
		if((((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY())))	|| (((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY()-1))))	
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
		
		// nach oben	
		
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY()+1))) 
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
		
		// nach unten	
		
				if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY()-1))) 
				{
						if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
						{					
							if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
							{
									statement=true;
							}
						}
				}
				
				// nach rechts	
				
				if(((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()))) 
				{
						if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
						{					
							if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
							{
									statement=true;
							}
						}
				}
				
				// nach links	
				
				if(((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()))) 
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
