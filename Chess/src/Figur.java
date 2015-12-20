
abstract class Figur 
{
	Position pos;
	boolean farbeWeiss;
	public Figur(Position pos)
	{	
		if(pos.gety()== 0 || pos.gety()== 1)
		{
			farbeWeiss = true;
		}
		else
		{
			farbeWeiss = false;
		}
		this.pos = pos;
	}
	public abstract boolean spielZug(SpielFeld sp,Position nach);

	public abstract boolean spielZug(SpielFeld sp, Position von, Position nach);
}
