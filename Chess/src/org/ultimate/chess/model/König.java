package org.ultimate.chess.model;

public class König extends Figur
{
	private boolean kurzeRochadeMöglich;
	private boolean langeRochadeMöglich;
	
	public König(Position pos, String name)
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
		
		// Diagonal schlagen/fahren 	(links vor, rechts vor, links zurück, rechts zurück)	
		
		
		if((((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()+1))) || (((position.getX())==(this.pos.getX()-1)) && ((position.getY())==(this.pos.getY()-1))) || (((position.getX())==(this.pos.getX()+1)) && ((position.getY())==(this.pos.getY()+1))))	
		{	
				if((((spielfeld.holeFigur(pos).pos.getX()==position.getX()) && (spielfeld.holeFigur(pos).pos.getY()==position.getY())) && (spielfeld.holeFigur(pos).getFarbe()!=this.getFarbe())) || ((spielfeld.holeFigur(pos).pos.getX()!=position.getX()) && (spielfeld.holeFigur(pos).pos.getY()!=position.getY())))	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht außerhalb des Feldes geht
					{
						spielfeld.figuren.remove(spielfeld.holeFigur(pos));		// Figur vom Spielfeld entfernen
						
						statement=true;
					}
				}
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// fragen ob kurze Rochade (Turmposition: x=7, y=0 & Königposition: x=4, y=0) möglich
		if(((this.pos.getX()==4) && (this.pos.getY()==0)) && (spielfeld.holeFigur(pos).pos.getX()==7) && ((spielfeld.holeFigur(pos).pos.getY()==0)) && (spielfeld.holeFigur(pos).getFarbe()==this.getFarbe()))
		{
			kurzeRochadeMöglich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// fragen ob lange Rochade(Turmposition: x=0, y=0 & Königposition: x=4, y=0) möglich
		if(((this.pos.getX()==4) && (this.pos.getY()==0)) && (spielfeld.holeFigur(pos).pos.getX()==0) && ((spielfeld.holeFigur(pos).pos.getY()==0)) && (spielfeld.holeFigur(pos).getFarbe()==this.getFarbe()))
		{
			langeRochadeMöglich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// kurze Rochade ausführen
		if(((position.getX())==(this.pos.getX()+2)) && ((position.getY())==(this.pos.getY()))) 
		{
			if(kurzeRochadeMöglich)
			{
				statement=true;
			}
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// lange Rochade ausführen
		if(((position.getX())==(this.pos.getX()-2)) && ((position.getY())==(this.pos.getY()))) 
		{
			if(langeRochadeMöglich)
			{
				statement=true;
			}
		}
		
		return statement;
		
	}
	
}
		
		
		