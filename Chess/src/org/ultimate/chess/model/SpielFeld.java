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
	@Override
	public String toString() {
	String ergebnis = "";
	Position pos = new Position(100,100);
		for(int i = 0;i<8;i++)
		{
			ergebnis = ergebnis +"\n";
			pos.setY(i);
			for(int u = 0; u<8 ;u++)
			{
				pos.setX(u);
				if(this.holeFigur(pos).getPos().getX() == 100)
				{
					ergebnis = ergebnis +"|_____|";
				}
				else
				{
				ergebnis = ergebnis + this.holeFigur(pos).getName()+"x:"+this.holeFigur(pos).getPos().getX()+"y:"+this.holeFigur(pos).getPos().getY();
				}
				
			}
		}
		return ergebnis;
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
	
	public boolean schach()
	{
		boolean schach = false;
		for(int i = 0; i<figuren.size();i++)
		{
			Position nach = null;
			//get König weiß
			for(int u = 0; u<figuren.size();u++)
			{
				if(figuren.get(u).getName() == 'K' && figuren.get(u).getFarbe() == true)
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
				if(figuren.get(u).getName() == 'K' && figuren.get(u).getFarbe() == false)
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
			if(figuren.get(i).getName() == 'K' && figuren.get(i).getFarbe() == false)
			{
				schachmatt = true;
			}
			if(figuren.get(i).getName() == 'K' && figuren.get(i).getFarbe() == true)
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
