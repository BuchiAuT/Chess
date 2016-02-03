/**
 * 
 * @author Michael Krapf
 * 
 */

package org.ultimate.chess.model;

public class Laeufer extends Figur
{	
	public char name;
	
	public Laeufer(Position pos, boolean farbeweiﬂ)
	{
		super(pos,farbeweiﬂ);
		name = 'L';
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Diagonal schlagen	(alle Kombinationen)
		
		boolean figurSchlagen = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if((((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()+i))) || (((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()+i))) || (((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()-i)))|| (((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()-i))))
			{
				figurSchlagen = true;
			}
		}
		
		if(figurSchlagen)
		{	
			if(spielfeld.holeFigur(position).getFarbe()!=this.getFarbe()) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach rechts und nach oben
		
		boolean rechtsOben = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()+i)))
			{
				rechtsOben = true;
			}
		}
		
		if(rechtsOben)
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht			
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts und nach unten
		
		boolean rechtsUnten = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()-i)))
			{
				rechtsUnten = true;
			}
		}
		
		if(rechtsUnten)
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht					
				{
					statement=true;
				}
			}
		}
			
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links und nach oben
		
		boolean linksOben = false; 
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()+i)))
			{
				linksOben = true;
			}
		}
		
		if(linksOben)
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht					
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links und nach unten
			
		boolean linksUnten = false; 
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()-i)))
			{
				linksUnten = true;
			}
		}
		
		if(linksUnten)
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht						
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
	public boolean spielZug(SpielFeld sp, Position nach) 
	{
		// TODO Auto-generated method stub
		return false;
	}
}