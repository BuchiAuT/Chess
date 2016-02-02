package org.ultimate.chess.model;
import java.util.ArrayList;

import org.ultimate.chess.GUI.SchachGUI;

public class SpielFeld {
	public ArrayList<Figur> figuren;
	boolean werAmZug; //weiss = true
	public SpielFeld()
	{
		figuren = new ArrayList<Figur>();
		werAmZug = true;
	}
	public Figur holeFigur(Position pos)
	{
		for(int i = 0; i < figuren.size() ;i++)
		{
			if(figuren.get(i).pos.equals(pos))
			{
				return figuren.get(i);
			}
		}
		return new Figur(new Position(100,100),true);
	}
	/*public void ausgabe()
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
	*/
	public boolean schach()
	{
		boolean schach = false;
		for(int i = 0; i<figuren.size();i++)
		{
			Position nach = null;
			//get König weiß
			for(int u = 0; u<figuren.size();u++)
			{
				if(figuren.get(u).getName() == "K" && figuren.get(u).getFarbe() == true)
				{
				nach = figuren.get(u).getPos();	
				}
			}
			if(figuren.get(i).spielzugMoeglich(this, nach))
			{
				schach = true;
			}
			//get König schwarz
			for(int u = 0; u<figuren.size();u++)
			{
				if(figuren.get(u).getName() == "K" && figuren.get(u).getFarbe() == false)
				{
				nach = figuren.get(u).getPos();	
				}
			}
			if(figuren.get(i).spielzugMoeglich(this, nach))
			{
				schach = true;
			}
		}
		return schach;
	}
	public boolean schachMatt()
	{
		boolean schachmatt = false;
		for(int i = 0; i<figuren.size();i++)
		{
			if(figuren.get(i).getName() == "K" && figuren.get(i).getFarbe() == false)
			{
				schachmatt = true;
			}
			if(figuren.get(i).getName() == "K" && figuren.get(i).getFarbe() == true)
			{
				schachmatt = true;
			}
			if(schachmatt)
			{
				return schachmatt;
			}
		}
		return schachmatt;
	}
	public void spielzug(String spielzug)
	{
		//ausgabe();
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
		if(schach())
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
		pos.setX(spielzug.charAt(0)-'0');
		pos.setY(spielzug.charAt(1)-'0');
		return pos;
	}
	public void starten()
	{
		SchachGUI gui = new SchachGUI(this);
	}
}
