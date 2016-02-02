package org.ultimate.chess.GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

import org.ultimate.chess.model.Position;

public class FigurenPanel extends JPanel 
{
	private Position pos;
	 private Image image;
	public FigurenPanel(int PosX,int PosY,Image image)
	{
		pos = new Position(PosX,PosY);
		setImage(image);
	}
	public Position getPos()
	{
		return pos;
	} 
	public void setImage(Image image) 
	{
	      this.image = image;
	      repaint();
	}
	public Dimension getPreferredSize()
	{
		return new Dimension(image.getWidth(this), image.getHeight(this));
	} 
	public void paint(Graphics g) 
	{
	      super.paint(g);
	      if(image != null) 
	      {
	         g.drawImage(image, 0, 0, this);
	      }
	}

}
