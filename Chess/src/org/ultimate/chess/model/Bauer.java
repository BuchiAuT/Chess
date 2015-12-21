package org.ultimate.chess.model;

public class Bauer extends Figur
{	
	private boolean eineFigurKannZurueckgeholtWerden;
	
	public Bauer(Position pos)
	{
		super(pos);
	}
	
	public boolean spielZug(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		
		if(spielZugMoeglich(spielfeld,position))
		{
			statement=true;
			this.pos.setPosX(position.getX());
			this.pos.setPosY(position.getY());
		}
				
		return statement;
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Diagonal schlagen	(rechts vor, links vor)
		
		
		if((((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()+1))))	
		{	
				if((((spielfeld.holeFigur(pos).getX()==position.getX()) && (spielfeld.holeFigur(pos).getY())==position.getY())) && (spielfeld.holeFigur(pos).getFarbe()!=this.getFarbe())) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
					{
						spielfeld.figuren.remove(spielfeld.holeFigur(pos));		// Figur vom Spielfeld entfernen
						
						statement=true;
					}
				}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// 1 Feld nach vorne	
		
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY()+1))) 
		{
				if(((spielfeld.holeFigur(pos).getX()!=position.getX()) && (spielfeld.holeFigur(pos).getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
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
		
		// 2 gerade nach Vorne bewegen, kann nur gemacht werden wenn y=1 (Y-Position des Bauern zu Beginn des Spiels)	
		
		if(((position.getX())==(this.pos.getX())) && ((position.getY())==(this.pos.getY())+2))
		{
			if(((spielfeld.holeFigur(pos).getX()!=position.getX()) && (spielfeld.holeFigur(pos).getY()!=position.getY()))) // Abfragen ob generell keine Figur auf dem Feld steht 
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
					{
						if(this.getY()==1)	//Bauer steht an Startposition
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
