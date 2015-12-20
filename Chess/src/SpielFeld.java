import java.util.ArrayList;

public class SpielFeld {
	ArrayList<Figur> figuren;
	boolean werAmZug;
	public SpielFeld()
	{
		Position pos = new Position(1,0);
		figuren = new ArrayList<Figur>();
		for(int i = 0; i < 9;i++)
		{
			pos.setx(i);
			figuren.add(new Bauer(pos));
			pos.sety(6);
			figuren.add(new Bauer(pos));
			pos.sety(1);
		}
		restlicheFigurenLaden(pos);
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
		String[] res = spielzug.split(" ");
		Position posQuelle = schach2koordinate(res[0]);
		Position posZiel = schach2koordinate(res[1]);
		for(int i = 0; i < 24;i++)
		{
			if(figuren.get(i).pos == posQuelle)
			{
				figuren.get(i).spielZug(this, posQuelle, posZiel);
			}
		}
		
	}
	public Position schach2koordinate(String spielzug)
	{
		Position pos = new Position(0,0);
		spielzug = spielzug.toLowerCase();
		pos.setX(spielzug.charAt(0) - 97);
		pos.setX(spielzug.charAt(1));
		return pos;
	}
	private void restlicheFigurenLaden(Position pos)
	{
		pos.setX(2);
		pos.setY(0);
		figuren.add(new Springer(pos));
		pos.setX(2);
		pos.setY(7);
		figuren.add(new Springer(pos));
		pos.setX(3);
		pos.setY(0);
		figuren.add(new Laeufer(pos));
		pos.setX(3);
		pos.setY(7);
		figuren.add(new Laeufer(pos));
		pos.setX(0);
		pos.setY(0);
		figuren.add(new Turm(pos));
		pos.setX(0);
		pos.setY(7);
		figuren.add(new Turm(pos));
		pos.setX(4);
		pos.setY(0);
		figuren.add(new Dame(pos));
		pos.setX(4);
		pos.setY(7);
		figuren.add(new Dame(pos));
		pos.setX(5);
		pos.setY(0);
		figuren.add(new König(pos));
		pos.setX(5);
		pos.sety(7);
		figuren.add(new König(pos));
		pos.setX(0);
		pos.setY(0);
		figuren.add(new Springer(pos));
		pos.setX(6);
		pos.setY(0);
		figuren.add(new Springer(pos));
		pos.setX(6);
		pos.setY(7);
		figuren.add(new Laeufer(pos));
		pos.setX(5);
		pos.setY(0);
		figuren.add(new Laeufer(pos));
		pos.setX(5);
		pos.setY(7);
		figuren.add(new Turm(pos));
		pos.setX(7);
		pos.setY(0);
		figuren.add(new Turm(pos));
		pos.setX(7);
		pos.setY(7);
	}

}
