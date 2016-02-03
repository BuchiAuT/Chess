/**
 * 
 * @author Michael Krapf
 * 
 */

package org.ultimate.chess.model;

public class Turm extends Figur
{	
	public char name;
	
	public Turm(Position pos, boolean farbeweiﬂ)
	{
		super(pos,farbeweiﬂ);
		name = 'T';
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Figuren schlagen	(alle Kombinationen)
		
		boolean figurSchlagen = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if((((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()))) || (((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+i))) || (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-i))))
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
		
		// nach oben	
		
		boolean oben = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+i)))
			{
				oben = true;
			}
		}
		
		if(oben)
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
		
		// nach unten	
		
		boolean unten = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-i)))
			{
				unten = true;
			}
		}
		
		if(unten)
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
		
		// nach rechts	
		
		boolean rechts = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY())))
			{
				rechts = true;
			}
		}
		
		if(rechts)
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
		
		// nach links	
				
		boolean links = false; 
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY())))
			{
				links = true;
			}
		}
		
		if(links)
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
	public boolean spielZug(SpielFeld sp, Position nach) {
		// TODO Auto-generated method stub
		return false;
	}
}