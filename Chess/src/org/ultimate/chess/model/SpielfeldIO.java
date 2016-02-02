package org.ultimate.chess.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SpielfeldIO
{
	/**
	 * @param f z.B. BW oder __
	 * @return ein Objekt vom Typ Feld, wenn es ein leeres Feld ist,
	 * eine konkrete Figur, wenn es eine Spielfigur ist
	 * Factory
	 */	
	static Figur leseFeld(String f)
	{
		char typ = f.charAt(0); //z.B Bauer
		char farbe = f.charAt(1); //z.B. W fÃ¼r Weiss
		boolean farbeW = (farbe == 'W');
		Position pos = new Position(0,0);
		int posx = f.charAt(2)-48;
		int posy = f.charAt(3)-48;
		pos.setX(posx);
		pos.setY(posy);
		Figur f1 = null;
		switch(typ)
		{
			case 'T' : f1 = new Turm(pos,farbeW); break;
			case 'S' : f1 = new Springer(pos,farbeW); break;
			case 'L' : f1 = new Laeufer(pos,farbeW);break;
			case 'K' : f1 = new König(pos,farbeW);break;
			case 'B' : f1 = new Bauer(pos,farbeW);break;
			case 'D' : f1 = new Dame(pos,farbeW);break;
		}
		return f1;
	}
	
	static public SpielFeld einlesen(String fName) throws FileNotFoundException
	{
		SpielFeld feld = new SpielFeld();
		Scanner s = new Scanner (new File(fName));
		int zeile = 0;
		while (s.hasNextLine())
		{
			String line = s.nextLine(); //z.B. TW|SW|LW|DW|KW|LW|SW|TW
			String[] figs = line.split("\\|");	//z.B. figs = {"TW", "SW" ,... }	
			for (int spalte = 0; spalte < figs.length;spalte++)
			{
				Figur f = leseFeld(figs[spalte]); 
				if(f != null)
				{
				feld.figuren.add(f);
				}
				 //setze die aktuelle Figur auf das Spielfeld
			}
			zeile++;
		}
		s.close();
		return feld;
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		SpielFeld sf = SpielfeldIO.einlesen("TestData/Schachfeld.txt");
		sf.starten();
	}

}
