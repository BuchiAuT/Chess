package org.ultimate.chess.model;
/**
 * 
 * @author Tobias M�ltner
 *
 */

public class K�nig extends Figur
{
	private boolean kurzeRochadeM�glich;
	private boolean langeRochadeM�glich;
	
	public String name;
	
	public K�nig(Position pos, boolean farbewei�)
	{
		super(pos,farbewei�);
		name="K";
	}
	
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Diagonal schlagen/fahren 	(links vor, rechts vor, links zur�ck, rechts zur�ck)	
		
		if((((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()+1))) || (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()+1))) || (((position.getX())==(this.getPos().getX()-1)) && ((position.getY())==(this.getPos().getY()-1))) || (((position.getX())==(this.getPos().getX()+1)) && ((position.getY())==(this.getPos().getY()+1))))	
		{	
				if((((spielfeld.holeFigur(position).getPos().getX()==position.getX()) && (spielfeld.holeFigur(position).getPos().getY()==position.getY())) && (spielfeld.holeFigur(position).getFarbe()!=this.getFarbe())) || ((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY())))	// Abfragen ob eine gegnerische (andere Farbe) oder keine Figur auf dem Feld steht 
				{
					if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht au�erhalb des Feldes geht
					{
						statement=true;
					}
				}
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// fragen ob kurze Rochade (Turmposition: x=7, y=0 & K�nigposition: x=4, y=0) m�glich
		if(((this.getPos().getX()==4) && (this.getPos().getY()==0)) && (spielfeld.holeFigur(position).getPos().getX()==7) && ((spielfeld.holeFigur(position).getPos().getY()==0)) && (spielfeld.holeFigur(position).getFarbe()==this.getFarbe()))
		{
			kurzeRochadeM�glich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		

		// fragen ob lange Rochade(Turmposition: x=0, y=0 & K�nigposition: x=4, y=0) m�glich
		if(((this.getPos().getX()==4) && (this.getPos().getY()==0)) && (spielfeld.holeFigur(position).getPos().getX()==0) && ((spielfeld.holeFigur(position).getPos().getY()==0)) && (spielfeld.holeFigur(position).getFarbe()==this.getFarbe()))
		{
			langeRochadeM�glich=true;
		}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// kurze Rochade ausf�hren
		if(((position.getX())==(this.getPos().getX()+2)) && ((position.getY())==(this.getPos().getY()))) 
		{
			if(kurzeRochadeM�glich)
			{
				statement=true;
			}
		}

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// lange Rochade ausf�hren
		if(((position.getX())==(this.getPos().getX()-2)) && ((position.getY())==(this.getPos().getY()))) 
		{
			if(langeRochadeM�glich)
			{
				statement=true;
			}
		}
		
		return statement;
				
	}
	
	public boolean getLangeRochade()
	{
		return langeRochadeM�glich;
	}
	
	public boolean getKurzeRochade()
	{
		return kurzeRochadeM�glich;
	}
	
}
		
		
		