package org.ultimate.chess.model;

/**
 * 
 * @author Michael Krapf
 *
 */

public class Laeufer extends Figur
{
	public Laeufer()
	{
		super();
	}
	
	public boolean spielZug(SpielFeld sp, Position nach)
	{
		boolean statement = false;
		byte spielfeldendeX = 7;
		byte spielfeldendeY = 7;
		
		if(((nach.x) == (this.pos.x+1)) && ((nach.y) == (this.pos.y+1))) // nach rechts und nach oben
		{
			if(((sp.holeFigur().pos.x!=nach.x) && (sp.figuren[i].pos.y!=nach.y)))
			{
				if(((nach.x <= spielfeldendeX) || (nach.x >= 0)) || ((nach.y >= spielfeldendeY) || (nach.y >= 0)))
				{
						statement = true;
				}
			}
		}
		
		// -----------------------------------------------------------------------------------------------
		
		if(((nach.x) == (this.pos.x-1)) && ((nach.y) == (this.pos.y+1))) // nach links und nach oben
		{
			if(((sp.holeFigur().pos.x!=nach.x) && (sp.holeFigur().pos.y!=nach.y)))
			{
				if(((nach.x <= spielfeldendeX) || (nach.x >= 0)) || ((nach.y >= spielfeldendeY) || (nach.y >= 0)))
				{
					statement = true;
				}
			}
		}
		
		// -----------------------------------------------------------------------------------------------
		
		if(((nach.x) == (this.pos.x-1)) && ((nach.y) == (this.pos.y-1))) // nach links und nach unten
		{
			if(((sp.holeFigur().pos.x!=nach.x) && (sp.holeFigur().pos.y!=nach.y)))
			{
				if(((nach.x <= spielfeldendeX) || (nach.x >= 0)) || ((nach.y >= spielfeldendeY) || (nach.y >= 0)))
				{
					statement = true;
				}
			}
		}
		
		// -----------------------------------------------------------------------------------------------
		
		if(((nach.x) == (this.pos.x+1)) && ((nach.y) == (this.pos.y-1))) // nach rechts und nach unten
		{
			if(((sp.holeFigur().pos.x!=nach.x) && (sp.holeFigur().pos.y!=nach.y)))
			{
				if(((nach.x <= spielfeldendeX) || (nach.x >= 0)) || ((nach.y >= spielfeldendeY) || (nach.y >= 0)))
				{
					statement = true;
				}
			}
		}
		
		return statement;
	}
	
	public boolean spielzugMoeglich(SpielFeld sp, Position nach)
	{
		return spielZug(sp, nach);
	}
}