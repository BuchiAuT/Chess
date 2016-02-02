/**
 * 
 * @author Tobias Mˆltner
 */

package org.ultimate.chess.model;

public class Springer extends Figur
{
	public char name;
	
	// alle Figuren wie beim Bauern... also holeFigur(position) anstatt holeFigur(position) und 
	
	public Springer(Position pos, boolean farbeweiﬂ)
	{
		super(pos,farbeweiﬂ);
		name='S';
	}
		
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
	
		// nach rechts vorne springen (x+1, y+2) 
		if(((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()+2)))
		{
			if(((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts vorne springen2 (x+2, y+1)
		if(((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()+1)))
		{
			if(((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links vorne springen (x-1, y+2)
		if(((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()+2)))
		{
			if(((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links vorne springen2 (x-2, y+1)
		if(((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY()+1)))
		{
			if(((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts hinten springen (x+1, y-2)
		if(((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()-2)))
		{
			if(((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


		// nach rechts hinten springen2 (x+2, y-1)
		if(((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()-1)))
		{
			if(((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		

		// nach links hinten springen (x-1, y-2)
		if(((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()-2)))
		{
			if(((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		

		// nach links hinten springen2 (x-2, y-1)
		if(((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY()-1)))
		{
			if(((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
		return statement;

	}		
}
