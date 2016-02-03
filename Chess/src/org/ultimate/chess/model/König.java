package org.ultimate.chess.model;
/**
 * 
 * @author Tobias Möltner
 *
 */

public class König extends Figur
{
	private boolean kurzeRochadeMöglich;
	private boolean langeRochadeMöglich;
	
	public char name;
	
	public König(Position pos, boolean farbeweiß)
	{
		super(pos,farbeweiß);
		name='K';
	}
	
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Diagonal schlagen/fahren 	(links vor, rechts vor, links zurück, rechts zurück)	
		
		if((((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()+1))) || (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()+1))) || (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()-1))) || (((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()-1))))	
		{	
				if((spielfeld.holeFigur(position).getFarbe())!=this.getFarbe() || (((spielfeld.holeFigur(position).getPos().getX())==100) && ((spielfeld.holeFigur(position).getPos().getY())==100)))	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht außerhalb des Feldes geht
					{
						statement=true;
					}
				}
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// fragen ob kurze Rochade (Turmposition: x=7, y=0 & Königposition: x=4, y=0) möglich
		if(((this.getPos().getX()==4) && (this.getPos().getY()==0)) && (spielfeld.holeFigur(position).getPos().getX()==7) && ((spielfeld.holeFigur(position).getPos().getY()==0)) && (spielfeld.holeFigur(position).getFarbe()==this.getFarbe()))
		{
			kurzeRochadeMöglich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// fragen ob lange Rochade(Turmposition: x=0, y=0 & Königposition: x=4, y=0) möglich
		if(((this.getPos().getX()==4) && (this.getPos().getY()==0)) && (spielfeld.holeFigur(position).getPos().getX()==0) && ((spielfeld.holeFigur(position).getPos().getY()==0)) && (spielfeld.holeFigur(position).getFarbe()==this.getFarbe()))
		{
			langeRochadeMöglich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// kurze Rochade ausführen
		if(((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()))) 
		{
			if(kurzeRochadeMöglich)
			{
				statement=true;
			}
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// lange Rochade ausführen
		if(((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY()))) 
		{
			if(langeRochadeMöglich)
			{
				statement=true;
			}
		}
		
		return statement;
				
	}
	
	public boolean getLangeRochade()
	{
		return langeRochadeMöglich;
	}
	
	public boolean getKurzeRochade()
	{
		return kurzeRochadeMöglich;
	}
	public char getName()
	{
		return name;
	}
	
}
		
		
		