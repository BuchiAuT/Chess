package org.ultimate.chess.GUI;

import javax.swing.JPanel;

import org.ultimate.chess.model.Position;

public class FigurenPanel extends JPanel 
{
	private Position pos;
	public FigurenPanel(int PosX,int PosY)
	{
		pos = new Position(PosX,PosY);
	}
	public Position getPos()
	{
		return pos;
	}

}
