package org.ultimate.chess.GUI;

import java.util.ArrayList;

import javax.swing.JFrame;

import org.ultimate.chess.model.Figur;
import org.ultimate.chess.model.Position;

public class Haupt_Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<FigurenPanel> panels;
	public Haupt_Frame()
	{
		panels = new ArrayList<FigurenPanel>();
	}
	
	public void addPanel(org.ultimate.chess.GUI.FigurenPanel fp) 
	{
		panels.add(fp);
		this.add(fp);
	}
	public FigurenPanel getFPanel(Position pos)
	{
		FigurenPanel ergebniss = null;
		for(int i = 0; i< panels.size(); i++)
		{
			if(panels.get(i).getPos().equals(pos))
			{
				ergebniss = panels.get(i);
			}
		}
		return ergebniss;
		
	}

}
