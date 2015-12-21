package org.ultimate.chess.model;
/**
 * 
 * @author Michael Krapf
 *
 */

public class Dame extends Figur
{
	public Dame()
	{
		super();
	}
	
	public boolean spielZug(SpielFeld sp, Position nach)
	{
		boolean statement = false;
		byte spielfeldendeX = 7;
		byte spielfeldendeY = 7;
		
		if(((nach.x) == (this.pos.x+1)) && ((nach.y) == (this.pos.y+1)))
		{
			for(int i = 0; i < sp.figuren.length; i++)
			{
				if(((sp.holeFigur().pos.x!=nach.x) && (sp.holeFigur().pos.y!=nach.y)))
				{
					if(((nach.x <= spielfeldendeX) || (nach.x >= 0)) || ((nach.y >= spielfeldendeY) || (nach.y >= 0)))
					{
						statement = true;
					}
				}
			}
		}
		return statement;
	}
	
	public boolean spielzugMoeglich(SpielFeld sp, Position nach)
	{
		
	}
}