
abstract class Figur 
{
	Position pos;
	public Figur(Position pos)
	{
		this.pos = pos;
	}
	public abstract boolean spielZug(Spielfeld sp,Position nach);

	public abstract boolean spielZug(Spielfeld sp, Position von, Position nach);
}
