/**
 * 
 * @author Michael Krapf
 * 
 */

package org.ultimate.chess.model;

public class Dame extends Figur
{	
	public char name;

	public Dame(Position pos, boolean farbeweiß)
	{
		super(pos,farbeweiß);
		name = 'D';
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// figuren schlagen	(alle Kombinationen)
		
		if((((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()+1))) || (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()+1)))	|| (((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()-1))) || (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()-1)))
			|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+1)))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-1)))	|| (((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()+2))) || (((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY()+2)))	|| (((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()-2))) || (((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY()-2)))
			|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+2)))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-2)))	|| (((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()+3)) && ((position.getY())==(this.getPos().getY()+3))) || (((position.getX())==(this.getPos().getX()-3)) && ((position.getY())==(this.getPos().getY()+3)))	|| (((position.getX())==(this.getPos().getX()+3)) && ((position.getY())==(this.getPos().getY()-3))) || (((position.getX())==(this.getPos().getX()-3)) && ((position.getY())==(this.getPos().getY()-3)))
			|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+3)))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-3)))	|| (((position.getX())==(this.getPos().getX()+3)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX()-3)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()+4)) && ((position.getY())==(this.getPos().getY()+4))) || (((position.getX())==(this.getPos().getX()-4)) && ((position.getY())==(this.getPos().getY()+4)))	|| (((position.getX())==(this.getPos().getX()+4)) && ((position.getY())==(this.getPos().getY()-4))) || (((position.getX())==(this.getPos().getX()-4)) && ((position.getY())==(this.getPos().getY()-4)))
			|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+4)))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-4)))	|| (((position.getX())==(this.getPos().getX()+4)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX()-4)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()+5)) && ((position.getY())==(this.getPos().getY()+5))) || (((position.getX())==(this.getPos().getX()-5)) && ((position.getY())==(this.getPos().getY()+5)))	|| (((position.getX())==(this.getPos().getX()+5)) && ((position.getY())==(this.getPos().getY()-5))) || (((position.getX())==(this.getPos().getX()-5)) && ((position.getY())==(this.getPos().getY()-5)))
			|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+5)))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-5)))	|| (((position.getX())==(this.getPos().getX()+5)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX()-5)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()+6)) && ((position.getY())==(this.getPos().getY()+6))) || (((position.getX())==(this.getPos().getX()-6)) && ((position.getY())==(this.getPos().getY()+6)))	|| (((position.getX())==(this.getPos().getX()+6)) && ((position.getY())==(this.getPos().getY()-6))) || (((position.getX())==(this.getPos().getX()-6)) && ((position.getY())==(this.getPos().getY()-6)))
			|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+6)))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-6)))	|| (((position.getX())==(this.getPos().getX()+6)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX()-6)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()+7)) && ((position.getY())==(this.getPos().getY()+7))) || (((position.getX())==(this.getPos().getX()-7)) && ((position.getY())==(this.getPos().getY()+7)))	|| (((position.getX())==(this.getPos().getX()+7)) && ((position.getY())==(this.getPos().getY()-7))) || (((position.getX())==(this.getPos().getX()-7)) && ((position.getY())==(this.getPos().getY()-7)))
			|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+7)))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-7)))	|| (((position.getX())==(this.getPos().getX()+7)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX()-7)) && ((position.getY())==(this.getPos().getY()))))
		{	
			if(spielfeld.holeFigur(position).getFarbe()!=this.getFarbe())	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{	
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach rechts und nach oben
		
		if((((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()+1)))
		|| (((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()+2)))
		|| (((position.getX())==(this.getPos().getX()+3)) && ((position.getY())==(this.getPos().getY()+3)))
		|| (((position.getX())==(this.getPos().getX()+4)) && ((position.getY())==(this.getPos().getY()+4)))
		|| (((position.getX())==(this.getPos().getX()+5)) && ((position.getY())==(this.getPos().getY()+5)))
		|| (((position.getX())==(this.getPos().getX()+6)) && ((position.getY())==(this.getPos().getY()+6)))
		|| (((position.getX())==(this.getPos().getX()+7)) && ((position.getY())==(this.getPos().getY()+7))))
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{		
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts und nach unten
		
		if((((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()-1)))
		|| (((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()-2)))
		|| (((position.getX())==(this.getPos().getX()+3)) && ((position.getY())==(this.getPos().getY()-3)))
		|| (((position.getX())==(this.getPos().getX()+4)) && ((position.getY())==(this.getPos().getY()-4)))
		|| (((position.getX())==(this.getPos().getX()+5)) && ((position.getY())==(this.getPos().getY()-5)))
		|| (((position.getX())==(this.getPos().getX()+6)) && ((position.getY())==(this.getPos().getY()-6)))
		|| (((position.getX())==(this.getPos().getX()+7)) && ((position.getY())==(this.getPos().getY()-7))))
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{
					statement=true;
				}
			}
		}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links und nach oben
				
		if((((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()+1)))
		|| (((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY()+2)))
		|| (((position.getX())==(this.getPos().getX()-3)) && ((position.getY())==(this.getPos().getY()+3)))
		|| (((position.getX())==(this.getPos().getX()-4)) && ((position.getY())==(this.getPos().getY()+4)))
		|| (((position.getX())==(this.getPos().getX()-5)) && ((position.getY())==(this.getPos().getY()+5)))
		|| (((position.getX())==(this.getPos().getX()-6)) && ((position.getY())==(this.getPos().getY()+6)))
		|| (((position.getX())==(this.getPos().getX()-7)) && ((position.getY())==(this.getPos().getY()+7))))
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{
					statement=true;
				}
			}
		}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach links und nach unten
				
		if((((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()-1)))
		|| (((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY()-2)))
		|| (((position.getX())==(this.getPos().getX()-3)) && ((position.getY())==(this.getPos().getY()-3)))
		|| (((position.getX())==(this.getPos().getX()-4)) && ((position.getY())==(this.getPos().getY()-4)))
		|| (((position.getX())==(this.getPos().getX()-5)) && ((position.getY())==(this.getPos().getY()-5)))
		|| (((position.getX())==(this.getPos().getX()-6)) && ((position.getY())==(this.getPos().getY()-6)))
		|| (((position.getX())==(this.getPos().getX()-7)) && ((position.getY())==(this.getPos().getY()-7))))
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach rechts
				
		if(((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()))
		|| ((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()))
		|| ((position.getX())==(this.getPos().getX()+3)) && ((position.getY())==(this.getPos().getY()))
		|| ((position.getX())==(this.getPos().getX()+4)) && ((position.getY())==(this.getPos().getY()))
		|| ((position.getX())==(this.getPos().getX()+5)) && ((position.getY())==(this.getPos().getY()))
		|| ((position.getX())==(this.getPos().getX()+6)) && ((position.getY())==(this.getPos().getY()))
		|| ((position.getX())==(this.getPos().getX()+7)) && ((position.getY())==(this.getPos().getY())))
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links
				
		if((((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()-3)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()-4)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()-5)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()-6)) && ((position.getY())==(this.getPos().getY())))
		|| (((position.getX())==(this.getPos().getX()-7)) && ((position.getY())==(this.getPos().getY()))))
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach oben
				
		if((((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+1)))
		|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+2)))
		|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+3)))
		|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+4)))
		|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+5)))
		|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+6)))
		|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+7))))
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach unten
		
		if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-1))
		|| ((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-2))
		|| ((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-3))
		|| ((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-4))
		|| ((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-5))
		|| ((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-6))
		|| ((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-7)))
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
				{
					statement=true;
				}
			}
		}
		
		return statement;
	}
	public char getName()
	{
		return name;
	}

	@Override
	public boolean spielZug(SpielFeld sp, Position nach) {
		// TODO Auto-generated method stub
		return false;
	}
}