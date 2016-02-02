/**
 * 
 * @author Tobias M�ltner
 */

package org.ultimate.chess.model;

public class Bauer extends Figur
{	
	private boolean eineFigurKannZurueckgeholtWerden;
	
	public char name;
	
	public Bauer(Position pos, boolean farbewei�)
	{
		super(pos,farbewei�);
		name='B';
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Diagonal schlagen Spieler wei� (rechts nach oben, links nach oben)
		
		
		if((((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()+1))) && (this.getFarbe()==true) || (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()+1))) && (this.getFarbe()==true))	
		{	
				if((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe()) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
					{						
						statement=true;
					}
				}
		}
		
		// Diagonal schlagen Spieler schwarz (links nach unten, rechts nach unten)
		
		if(((((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()-1))) && (this.getFarbe()==false))|| ((((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()-1))) && (this.getFarbe()==false)))	
		{	
				if((spielfeld.holeFigur(position).getFarbe()!=this.getFarbe())) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
					{		
						statement=true;
					}
				}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// 1 Feld nach vorne wei� (1 nach oben)	
		
		if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+1)) && (this.getFarbe()==true)) 
		{
				if(((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100)) // Abfragen dass keine Figur auf dem Feld steht 
				{					
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
					{
							statement=true;
							
							if(position.getY()==spielfeldendeY)	// wenn Bauer an Spielfeldende ankommt, kann eine beliebige Figur zurueck geholt werden. Um zu zeigen dass eine Figur zurueckgeholt werden kann, 
															// gibt es die Variable "figurKannZurueckgeholtWerden".
							{
								eineFigurKannZurueckgeholtWerden=true;
							}
					}
				}
		}
		
		// 1 Feld nach vorne schwarz (1 nach unten)
		if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-1)) && (this.getFarbe()==false)) 
		{
				if(((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100)) // Abfragen dass keine Figur auf dem Feld steht 
				{					
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
					{
							statement=true;
							
							if(position.getY()==spielfeldendeY)	// wenn Bauer an Spielfeldende ankommt, kann eine beliebige Figur zurueck geholt werden. Um zu zeigen dass eine Figur zurueckgeholt werden kann, 
															// gibt es die Variable "figurKannZurueckgeholtWerden".
							{
								eineFigurKannZurueckgeholtWerden=true;
							}
					}
				}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// 2 gerade nach oben bewegen wei� , kann nur gemacht werden wenn y=1 (Y-Position des wei�en Bauern zu Beginn des Spiels)	
		
		if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY())+2) && (this.getFarbe()==true))
		{
			if(((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100)) // Abfragen ob generell keine Figur auf dem Feld steht 
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
					{
						if(this.getPos().getY()==1)	//wei�er Bauer steht an Startposition
						{
							statement=true;
						}
					}
				}
		}
			
	
		// 2 gerade nach unten bewegen schwarz , kann nur gemacht werden wenn y=6 (Y-Position des schwarzen Bauern zu Beginn des Spiels)	
	
		if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY())-2) && (this.getFarbe()==false))
		{
			if(((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100)) // Abfragen ob generell keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
				{
					if(this.getPos().getY()==6)	//schwarzer Bauer steht an Startposition
					{
						statement=true;
					}
				}
			}
		}
	
	return statement;

	}
	
	public boolean getObFigurGeholtWerdenKann()
	{
		return eineFigurKannZurueckgeholtWerden;
	}
}
