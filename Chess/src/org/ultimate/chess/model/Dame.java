/**
 * 
 * @author Michael Krapf
 * 
 */

package org.ultimate.chess.model;

public class Dame extends Figur
{	
	public char name;

	public Dame(Position pos, boolean farbeweiﬂ)
	{
		super(pos,farbeweiﬂ);
		name = 'D';
	}
	
	public boolean spielzugMoeglich(SpielFeld spielfeld, Position position)
	{
		boolean statement=false;
		byte spielfeldendeX=7;
		byte spielfeldendeY=7;
		
		// Figuren schlagen	(alle Kombinationen)
		
		boolean figurSchlagen = false; 
		
		for(int i = 1; i <= 7; i++)
		{
			if((((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()+i))) || (((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()+i)))	|| (((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()-i))) || (((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()-i)))
				|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+i)))	|| (((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-i)))	|| (((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY())))	|| (((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()))))
			{
				figurSchlagen = true;
			}
		}
		
		if(figurSchlagen && ergebnis)
		{
			if(spielfeld.holeFigur(position).getFarbe()!=this.getFarbe())	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{	
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach rechts und nach oben
		
		boolean rechtsOben = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if((((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()+i))))
			{
				rechtsOben = true;
			}
		}
		
		rechts_Oben(this.getPos(), position, spielfeld);
		
		if(rechtsOben && ergebnis)
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{		
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach rechts und nach unten
		
		boolean rechtsUnten = false; 
		
		for(int i = 1; i <= 7; i++)
		{
			if((((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY()-i))))
			{
				rechtsUnten = true;
			}
		}
		
		rechts_Unten(this.getPos(), position, spielfeld);
		
		if(rechtsUnten && ergebnis)
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links und nach oben
		
		boolean linksOben = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if((((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()+i))))
			{
				linksOben = true;
			}
		}
		
		links_Oben(this.getPos(), position, spielfeld);
		
		if(linksOben && ergebnis)
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach links und nach unten
		
		boolean linksUnten = false; 
		
		for(int i = 1; i <= 7; i++)
		{
			if((((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY()-i))))
			{
				linksUnten = true;
			}
		}
		
		links_Unten(this.getPos(), position, spielfeld);
		
		if(linksUnten && ergebnis)
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		// nach rechts
		
		boolean rechts = false; 
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX()+i)) && ((position.getY())==(this.getPos().getY())))
			{
				rechts = true;
			}
		}
		
		nachRechts(this.getPos(), position, spielfeld);
		
		if(rechts && ergebnis)
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach links
		
		boolean links = false; 
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX()-i)) && ((position.getY())==(this.getPos().getY())))
			{
				links = true;
			}
		}
		
		nachLinks(this.getPos(), position, spielfeld);
		
		if(links && ergebnis)
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach oben
		
		boolean oben = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()+i)))
			{
				oben = true;
			}
		}
		
		nachOben(this.getPos(), position, spielfeld);
		
		if(oben && ergebnis)
		{	
			if((((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY())!=position.getY()))) 	// Abfragen ob eine gegnerische Figur auf dem Feld steht (andere Farbe)
			{
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht
				{
					statement=true;
				}
			}
		}
		
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		// nach unten
		
		boolean unten = false;
		
		for(int i = 1; i <= 7; i++)
		{
			if(((position.getX())==(this.getPos().getX())) && ((position.getY())==(this.getPos().getY()-i)))
			{
				unten = true;
			}
		}
		
		nachUnten(this.getPos(), position, spielfeld);
		
		if(unten && ergebnis)
		{
			if(((spielfeld.holeFigur(position).getPos().getX()!=position.getX()) && (spielfeld.holeFigur(position).getPos().getY()!=position.getY()))) // Abfragen dass keine Figur auf dem Feld steht 
			{					
				if((position.getX()<=spielfeldendeX)&&(position.getX()>=0)&&(position.getY()<=spielfeldendeY)&&(position.getY()>=0)) // Abfragen ob Bewegung nicht auﬂerhalb des Feldes geht				
				{
					statement=true;
				}
			}
		}
		
		return statement;
	}
	
	public char getName()
	{
		return name;
	}

	@Override
	public boolean spielZug(SpielFeld sp, Position nach) {
		// TODO Auto-generated method stub
		return false;
	}
	
	boolean ergebnis = false;
	
	public boolean rechts_Oben(Position von, Position nach, SpielFeld sf)
	{
		Position pos = new Position(von.getX(), von.getY());
		int diff = von.getX() - nach.getX();
		for(int i = 1; i < diff; i++)
		{
			pos.setX(pos.getX() + i);
			pos.setY(pos.getY() + i);
			if(sf.holeFigur(pos).getPos().getX() == 100)
			{
				ergebnis = true;
			}
			else
			{
				return false;
			}
		}
		return ergebnis;
	}
	
	public boolean rechts_Unten(Position von, Position nach, SpielFeld sf)
	{
		Position pos = new Position(von.getX(), von.getY());
		int diff = von.getX() - nach.getX();
		for(int i = 1; i < diff; i++)
		{
			pos.setX(pos.getX() + i);
			pos.setY(pos.getY() - i);
			if(sf.holeFigur(pos).getPos().getX() == 100)
			{
				ergebnis = true;
			}
			else
			{
				return false;
			}
		}
		return ergebnis;
	}
	
	public boolean links_Oben(Position von, Position nach, SpielFeld sf)
	{
		Position pos = new Position(von.getX(), von.getY());
		int diff = von.getX() - nach.getX();
		for(int i = 1; i < diff; i++)
		{
			pos.setX(pos.getX() - i);
			pos.setY(pos.getY() + i);
			if(sf.holeFigur(pos).getPos().getX() == 100)
			{
				ergebnis = true;
			}
			else
			{
				return false;
			}
		}
		return ergebnis;
	}
	
	public boolean links_Unten(Position von, Position nach, SpielFeld sf)
	{
		Position pos = new Position(von.getX(), von.getY());
		int diff = von.getX() - nach.getX();
		for(int i = 1; i < diff; i++)
		{
			pos.setX(pos.getX() - i);
			pos.setY(pos.getY() - i);
			if(sf.holeFigur(pos).getPos().getX() == 100)
			{
				ergebnis = true;
			}
			else
			{
				return false;
			}
		}
		return ergebnis;
	}
	
	public boolean nachOben(Position von, Position nach, SpielFeld sf)
	{
		Position pos = new Position(von.getX(), von.getY());
		int diff = von.getX() - nach.getX();
		for(int i = 1; i < diff; i++)
		{
			pos.setX(pos.getX());
			pos.setY(pos.getY() + i);
			if(sf.holeFigur(pos).getPos().getX() == 100)
			{
				ergebnis = true;
			}
			else
			{
				return false;
			}
		}
		return ergebnis;
	}
	
	public boolean nachUnten(Position von, Position nach, SpielFeld sf)
	{
		Position pos = new Position(von.getX(), von.getY());
		int diff = von.getX() - nach.getX();
		for(int i = 1; i < diff; i++)
		{
			pos.setX(pos.getX());
			pos.setY(pos.getY() - i);
			if(sf.holeFigur(pos).getPos().getX() == 100)
			{
				ergebnis = true;
			}
			else
			{
				return false;
			}
		}
		return ergebnis;
	}
	
	public boolean nachRechts(Position von, Position nach, SpielFeld sf)
	{
		Position pos = new Position(von.getX(), von.getY());
		int diff = von.getX() - nach.getX();
		for(int i = 1; i < diff; i++)
		{
			pos.setX(pos.getX() + i);
			pos.setY(pos.getY());
			if(sf.holeFigur(pos).getPos().getX() == 100)
			{
				ergebnis = true;
			}
			else
			{
				return false;
			}
		}
		return ergebnis;
	}
	
	public boolean nachLinks(Position von, Position nach, SpielFeld sf)
	{
		Position pos = new Position(von.getX(), von.getY());
		int diff = von.getX() - nach.getX();
		for(int i = 1; i < diff; i++)
		{
			pos.setX(pos.getX() - i);
			pos.setY(pos.getY());
			if(sf.holeFigur(pos).getPos().getX() == 100)
			{
				ergebnis = true;
			}
			else
			{
				return false;
			}
		}
		return ergebnis;
	}
}