package src;

public class Springer extends Figur
{
	public Springer(Position pos)
	{
		super(pos);
	}
	
	public boolean spielZug(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		
		if(spielZugMoeglich(spielfeld,position))
		{
			statement=true;
			this.pos.setPosX(position.get(x));
			this.pos.setPosY(position.get(y));
		}
		
		return statement;
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
	
		// nach rechts vorne springen (x+1, y+2) 
		if(((position.get(x))==(this.pos.get(x)+1)) && ((position.get(y))==(this.pos.get(y)+2)))
		{
			if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts vorne springen2 (x+2, y+1)
		if(((position.get(x))==(this.pos.get(x)+2)) && ((position.get(y))==(this.pos.get(y)+1)))
		{
			if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links vorne springen (x-1, y+2)
		if(((position.get(x))==(this.pos.get(x)-1)) && ((position.get(y))==(this.pos.get(y)+2)))
		{
			if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links vorne springen2 (x-2, y+1)
		if(((position.get(x))==(this.pos.get(x)-2)) && ((position.get(y))==(this.pos.get(y)+1)))
		{
			if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts hinten springen (x+1, y-2)
		if(((position.get(x))==(this.pos.get(x)+1)) && ((position.get(y))==(this.pos.get(y)-2)))
		{
			if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


		// nach rechts hinten springen2 (x+2, y-1)
		if(((position.get(x))==(this.pos.get(x)+2)) && ((position.get(y))==(this.pos.get(y)-1)))
		{
			if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		

		// nach links hinten springen (x-1, y-2)
		if(((position.get(x))==(this.pos.get(x)-1)) && ((position.get(y))==(this.pos.get(y)-2)))
		{
			if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		

		// nach links hinten springen2 (x-2, y-1)
		if(((position.get(x))==(this.pos.get(x)-2)) && ((position.get(y))==(this.pos.get(y)-1)))
		{
			if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
			{
				if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
		return statement;

	}
		
}
