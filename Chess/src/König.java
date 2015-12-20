package src;

public class König 
{
	public König()
	{
		super();
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
		
		// Diagonal schlagen/fahren 	(links vor, rechts vor, links zurück, rechts zurück)	
		
		
		if((((position.get(x))==(this.pos.get(x)+1)) && ((position.get(y))==(this.pos.get(y)+1))) || (((position.get(x))==(this.pos.get(x)-1)) && ((position.get(y))==(this.pos.get(y)+1))) || (((position.get(x))==(this.pos.get(x)-1)) && ((position.get(y))==(this.pos.get(y)-1))) || (((position.get(x))==(this.pos.get(x)+1)) && ((position.get(y))==(this.pos.get(y)+1))))	
		{	
				if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
				{
					if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht außerhalb des Feldes geht
					{
						statement=true;
					}
				}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// 1 Feld nach vorne	
		
		if(((position.get(x))==(this.pos.get(x))) && ((position.get(y))==(this.pos.get(y)+1))) 
		{
			if(((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pos.get(y)!=position.get(y)))) // Abfragen ob generell keine Figur auf dem Feld steht 
				{
					if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht außerhalb des Feldes geht, da Bauern nur Diagonal schlagen koennen						
					{
							statement=true;
							
							if(position.get(y)==spielfeldendeY)	// wenn Bauer an Spielfeldende ankommt, kann eine beliebige Figur zurueck geholt werden. Um zu zeigen dass eine Figur zurueckgeholt werden kann, 
															// gibt es die Variable "figurKannZurueckgeholtWerden".
							{
								eineFigurKannZurueckgeholtWerden=true;
							}
					}
				}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// (DAS HIER GEHÖRT ZUM BAUERN) 2 gerade nach Vorne bewegen, kann nur gemacht werden wenn y=1 (Y-Position des Bauern zu Beginn des Spiels)	
		
		if(((position.get(x))==(this.pos.get(x))) && ((position.get(y))==(this.pos.get(y)+2))) 
		{
				if(((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pos.get(y)!=position.get(y)))) // Abfragen ob generell keine Figur auf dem Feld steht 
				{
					if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht außerhalb des Feldes geht
					{
						if(this.get(y)==1)	//Bauer steht an Startposition (muss überarbeitet werden)
						{
							statement=true;
						}
					}
				}
		}
		
		return statement;
	}
}
