package org.ultimate.chess.model;
import java.util.ArrayList;

public class SpielFeld {
	ArrayList<Figur> figuren;
	boolean werAmZug; //weiss = true
	boolean schachFarbe;
	private König königSchwarz;
	private König königWeiss;
	boolean istSchach;
	public SpielFeld()
	{
		istSchach = false;
		Position pos = new Position(1,0);
		figuren = new ArrayList<Figur>();
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
		Position posa = new Position(0,0);
		boolean gefunden = false;
		for(int i = 0;i<8;i++)
		{
			posa.setY(i);
			for(int j = 0; i<8;i++)
			{
				gefunden = false;
				posa.setX(j);
				for(int u = 0; u < 24;u++)
				{
					if(figuren.get(u).pos.getX()== posa.getX()&& figuren.get(u).pos.getY()== posa.getY())
					{
						gefunden = true;
						System.out.print("|"+figuren.get(u).toString()+"|");
					}
				}
				if(!gefunden)
				{
					System.out.println("|x|");
					gefunden = true;
				}
			}
			System.out.println();
		}
		
	}
	public boolean Schach()
	{
		istSchach = false;
		for(int i = 0; i < 24;i++)
		{
			if(figuren.get(i).spielzugMoeglich(this, königSchwarz.pos))
			{
				schachFarbe =false;
				istSchach = true;
				return true;
			}
			if(figuren.get(i).spielzugMoeglich(this, königWeiss.pos))
			{
				schachFarbe =true;
				istSchach = true;
				return false;
			}		
		}
		return true;
	}
	public boolean schachMatt()
	{
		if(istSchach)
		{
		if(!figuren.contains(königSchwarz))
		{
			return true;
		}
		if(!figuren.contains(königWeiss))
		{
			return true;
		}
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
				figuren.get(i).spielZug(this, posZiel);
			}
		}
		if(Schach())
		{
			System.out.println("Schach");
			if(schachMatt())
			{
				System.out.println("SchachMatt");
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
}
