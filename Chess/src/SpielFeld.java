import java.util.ArrayList;

public class SpielFeld {
	ArrayList<Figur> figuren;
	boolean werAmZug;
	public SpielFeld()
	{
		figuren = new ArrayList<Figur>();
		werAmZug = true;
	}
	public void ausgabe()
	{
		
	}
	public boolean Schach()
	{
		return true;
	}
	public boolean schachMatt()
	{
		return true;
	}
	public void spielzug(String spielzug)
	{
		schach2koordinate(spielzug);
	}
	public Position schach2koordinate(String spielzug)
	{
		return null;
		
	}

}
