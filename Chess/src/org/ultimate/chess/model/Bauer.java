package org.ultimate.chess.model;

public class Bauer extends Figur
{	
	private boolean eineFigurKannZurueckgeholtWerden;
	
	// es muss noch folgendes implementiert werden:
	//						Es werden in den einzelnen Klassen nur Bewegungen von unten nach oben
	//						realisiert! Es soll abgefragt werden welche Farbe am Zug ist...
	//						Schwarz fährt zum Beispiel von oben nach unten und Weiß umgekehrt.
	
	public Bauer(Position pos, String name)
	{
		super(pos,name);
	}
	
	public boolean spielZug(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		
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
		
		// Diagonal schlagen Spieler weiß (rechts vor, links vor)
		
		
		if((((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()+1))))	
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
		
		// Diagonal schlagen Spieler schwarz
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// 1 Feld nach vorne	
		
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY()+1))) 
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
		
		// 2 gerade nach Vorne bewegen, kann nur gemacht werden wenn y=1 (Y-Position des Bauern zu Beginn des Spiels)	
		
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY())+2))
		{
			if(((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY()))) // Abfragen ob generell keine Figur auf dem Feld steht 
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auï¿½erhalb des Feldes geht
					{
						if(this.pos.getY()==1)	//Bauer steht an Startposition
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
