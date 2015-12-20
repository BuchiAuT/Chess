package src;

public class K�nig extends Figur
{
	private boolean kurzeRochadeM�glich;
	private boolean langeRochadeM�glich;
	
	public K�nig()
	{
		super(Position.pos);
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
		
		// Diagonal schlagen/fahren 	(links vor, rechts vor, links zur�ck, rechts zur�ck)	
		
		
		if((((position.get(x))==(this.pos.get(x)+1)) && ((position.get(y))==(this.pos.get(y)+1))) || (((position.get(x))==(this.pos.get(x)-1)) && ((position.get(y))==(this.pos.get(y)+1))) || (((position.get(x))==(this.pos.get(x)-1)) && ((position.get(y))==(this.pos.get(y)-1))) || (((position.get(x))==(this.pos.get(x)+1)) && ((position.get(y))==(this.pos.get(y)+1))))	
		{	
				if((((spielfeld.holeFigur().pos.get(x)==position.get(x)) && (spielfeld.holeFigur().pox.get(y)==position.get(y))) && (spielfeld.holeFigur().get(farbe)!=this.get(farbe)) || ((spielfeld.holeFigur().pos.get(x)!=position.get(x)) && (spielfeld.holeFigur().pox.get(y)!=position.get(y))))) 	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
				{
					if((position.get(x)<=spielfeldendeX)&&(position.get(x)>=0)&&(position.get(y)<=spielfeldendeY)&&(position.get(y)>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
					{
						statement=true;
					}
				}
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// fragen ob kurze Rochade (Turmposition: x=7, y=0 & K�nigposition: x=4, y=0) m�glich
		if(((this.pos.get(x)==4) && (this.pos.get(y)==0)) && (spielfeld.holeFigur().pos.get(x)==7) && ((spielfeld.holeFigur().pox.get(y)==0)) && (spielfeld.holeFigur().get(farbe)==this.get(farbe)))
		{
			kurzeRochadeM�glich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// fragen ob lange Rochade(Turmposition: x=0, y=0 & K�nigposition: x=4, y=0) m�glich
		if(((this.pos.get(x)==4) && (this.pos.get(y)==0)) && (spielfeld.holeFigur().pos.get(x)==0) && ((spielfeld.holeFigur().pox.get(y)==0)) && (spielfeld.holeFigur().get(farbe)==this.get(farbe)))
		{
			langeRochadeM�glich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// kurze Rochade ausf�hren
		if(((position.get(x))==(this.pos.get(x)+2)) && ((position.get(y))==(this.pos.get(y)))) 
		{
			if(kurzeRochadeM�glich)
			{
				statement=true;
			}
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// lange Rochade ausf�hren
		if(((position.get(x))==(this.pos.get(x)-2)) && ((position.get(y))==(this.pos.get(y)))) 
		{
			if(langeRochadeM�glich)
			{
				statement=true;
			}
		}
		
		return statement;
		
	}
	
}
		
		
		