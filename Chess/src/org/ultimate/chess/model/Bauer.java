package org.ultimate.chess.model;

public class Bauer extends Figur
{	
	private boolean eineFigurKannZurueckgeholtWerden;
	
	public String name;
	
	public Bauer(Position pos, String name)
	{
		super(pos,name);
		name="B";
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Diagonal schlagen Spieler weiß (rechts nach oben, links nach oben)
		
		
		if((((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()+1))) && (this.getFarbe()==true))	
		{	
				if((((spielfeld.holeFigur(pos).pos.getX()==position.getX()) && (spielfeld.holeFigur(pos).pos.getY())==position.getY())) && (spielfeld.holeFigur(pos).getFarbe()!=this.getFarbe())) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
					{
						spielfeld.figuren.remove(spielfeld.holeFigur(pos));		// Figur vom Spielfeld entfernen
						
						statement=true;
					}
				}
		}
		
		// Diagonal schlagen Spieler schwarz (links nach unten, rechts nach unten)
		
		if((((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()-1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()-1))) && (this.getFarbe()==false))	
		{	
				if((((spielfeld.holeFigur(pos).pos.getX()==position.getX()) && (spielfeld.holeFigur(pos).pos.getY())==position.getY())) && (spielfeld.holeFigur(pos).getFarbe()!=this.getFarbe())) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
					{
						spielfeld.figuren.remove(spielfeld.holeFigur(pos));		// Figur vom Spielfeld entfernen
						
						statement=true;
					}
				}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// 1 Feld nach vorne weiß (1 nach oben)	
		
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY()+1)) && (this.getFarbe()==true)) 
		{
				if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
				{					
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
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
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY()-1)) && (this.getFarbe()==false)) 
		{
				if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
				{					
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
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
		
		// 2 gerade nach oben bewegen weiß , kann nur gemacht werden wenn y=1 (Y-Position des weißen Bauern zu Beginn des Spiels)	
		
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY())+2) && (this.getFarbe()==true))
		{
			if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen ob generell keine Figur auf dem Feld steht 
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
					{
						if(this.pos.getY()==1)	//weißer Bauer steht an Startposition
						{
							statement=true;
						}
					}
				}
		}
			
	
		// 2 gerade nach unten bewegen schwarz , kann nur gemacht werden wenn y=6 (Y-Position des schwarzen Bauern zu Beginn des Spiels)	
	
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY())-2) && (this.getFarbe()==false))
		{
			if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen ob generell keine Figur auf dem Feld steht 
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
				{
					if(this.pos.getY()==6)	//schwarzer Bauer steht an Startposition
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
