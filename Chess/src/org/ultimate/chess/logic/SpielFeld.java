package org.ultimate.chess.logic;
import java.util.ArrayList;
import org.ultimate.chess.model.*;

public class SpielFeld {
	ArrayList<Figur> figuren;
	boolean werAmZug; //weiss = true
	boolean schachFarbe;
	private K�nig k�nigSchwarz;
	private K�nig k�nigWeiss;
	public SpielFeld()
	{
		Position pos = new Position(1,0);
		figuren = new ArrayList<Figur>();
		for(int i = 0; i < 9;i++)
		{
			pos.setX(i);
			figuren.add(new Bauer(pos));
			pos.setY(6);
			figuren.add(new Bauer(pos));
			pos.setX(1);
		}
		restlicheFigurenLaden(pos);
		werAmZug = true;
	}
	public Figur holeFigur(Position pos)
	{
		for(int i = 0; i < 24;i++)
		{
			if(figuren.get(i).pos == pos)
			{
				return figuren.get(i);
			}
		}
		return null;
	}
	public void ausgabe()
	{
		
	}
	public boolean Schach()
	{
		for(int i = 0; i < 24;i++)
		{
			if(figuren.get(i).spielZug(this, k�nigSchwarz.pos))
			{
				schachFarbe =false;
				return true;
			}
			if(figuren.get(i).spielZug(this, k�nigWeiss.pos))
			{
				schachFarbe =true;
				return false;
			}		
		}
		return true;
	}
	public boolean schachMatt()
	{
		if(!figuren.contains(k�nigSchwarz))
		{
			return true;
		}
		if(!figuren.contains(k�nigWeiss))
		{
			return true;
		}
		return false;
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
		if(Schach())
		{
			System.out.println("Schach");
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
		k�nigWeiss = new K�nig(pos);
		figuren.add(k�nigWeiss);
		pos.setX(5);
		pos.setY(0);
		figuren.add(new K�nig(pos));
		pos.setX(5);
		pos.setY(7);
		k�nigSchwarz = new K�nig(pos);
		figuren.add(k�nigSchwarz);
		pos.setX(0);
		pos.setY(0);
		figuren.add(new Springer(pos));
		pos.setX(6);
		pos.setY(0);
		figuren.add(new Springer(pos));
		pos.setX(6);
		pos.setY(7);
		figuren.add(new K�nig(pos));
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
