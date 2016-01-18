/**
 * 
 * @author Michael Krapf
 * 
 */

package org.ultimate.chess.model;

public class Turm extends Figur
{	
	public String name;
	
	public Turm(Position pos, boolean farbeweiß)
	{
		super(pos,farbeweiß);
		name = "T";
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// figuren schlagen	(alle Kombinationen)
		
		
		if((((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()))) || (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+1))) || (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-1))))	
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()==position.getX()) && (spielfeld.holeFigur(position).getPos().getY())==position.getY())) && (spielfeld.holeFigur(position).getFarbe()!=this.getFarbe())) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{
					spielfeld.figuren.remove(spielfeld.holeFigur(position));		// Figur vom Spielfeld entfernen
						
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach oben	
		
		if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+1))) 
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach unten	
		
		if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-1))) 
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts	
				
		if(((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()))) 
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
				{
					statement=true;
				}
			}
		}
			
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links	
				
		if(((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()))) 
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

	@Override
	public boolean spielZug(SpielFeld sp, Position nach) {
		// TODO Auto-generated method stub
		return false;
	}
}