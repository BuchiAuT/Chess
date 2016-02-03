package org.ultimate.chess.GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import org.ultimate.chess.model.Bauer;
import org.ultimate.chess.model.Dame;
import org.ultimate.chess.model.K�nig;
import org.ultimate.chess.model.Laeufer;
import org.ultimate.chess.model.Position;
import org.ultimate.chess.model.SpielFeld;
import org.ultimate.chess.model.Springer;
import org.ultimate.chess.model.Turm;

public class SchachGUI 
{	boolean weristdran = true; //wei�
	Position nach;
	Position von;
	boolean spielzug_gestartet;
	private SpielFeld sf;
	private Haupt_Frame main_frame;
	public SchachGUI(SpielFeld sf)
	{
		boolean panelfarbe = true;
		spielzug_gestartet = false;
		this.sf = sf;
		main_frame = new Haupt_Frame();
		main_frame.setLayout(new GridLayout(8,8,1,1));
		main_frame.setSize(500, 500);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0;i<8;i++)
		{
			panelfarbe = !panelfarbe;
			for(int u = 0; u<8;u++)
			{
				Image image = null;
				FigurenPanel fp = new FigurenPanel(u,i,image);
				fp.setOpaque(true);
				if(panelfarbe)
				{
					panelfarbe = !panelfarbe;
					fp.setBackground(Color.BLACK);
				}
				else
				{
					panelfarbe = !panelfarbe;
					fp.setBackground(Color.WHITE);
				}
				fp.addMouseListener(new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent arg0) 
					{
					FigurenPanel vonPanel = (FigurenPanel)arg0.getSource();
					von =vonPanel.getPos();
					Position posm�glich = new Position(100,100);
					for(int i = 0; i < 8;i++)
					{
						posm�glich.setY(i);
						for(int u = 0; u<8 ; u++)
						{
							posm�glich.setX(u);
							main_frame.getFPanel(posm�glich).setBorder(null);
							System.out.println(posm�glich);
							if(sf.holeFigur(von).spielzugMoeglich(sf, posm�glich))
							{
								Border border = new CompoundBorder(new EtchedBorder(),
								        new LineBorder(Color.RED));
								main_frame.getFPanel(posm�glich).setBorder(border);
							}
						}
					}
					if(sf.holeFigur(vonPanel.getPos()).getFarbe()==weristdran)
					{
					if(!spielzug_gestartet)
					{
						spielzug_gestartet = true;
					}
					else
					{
						spielzug_gestartet = false;
						FigurenPanel nachPanel = (FigurenPanel)arg0.getSource();
						nach = nachPanel.getPos();
						sf.holeFigur(von).spielZug(sf, nach);
						zeichnen();
						weristdran = !weristdran;
					}
					}				
					}

					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				
				});
				//fp.setBackground(Color.GRAY);
				main_frame.addPanel(fp);
			}
		}
		main_frame.repaint();
		main_frame.revalidate();
		main_frame.setVisible(true);
		zeichnen();
	}
	public void zeichnen()
	{	
		Position pos = new Position(100,100);
		for(int i = 0; i <8 ;i++)
		{
			pos.setY(i);
			for(int u = 0; i<8 ;u++)
			{
				pos.setX(u);
				if(pos.getX()>7)
				{
					break;
				}
				boolean gefunden = false;
				for(int k= 0; k < sf.figuren.size();k++)
				{
					if(sf.figuren.get(k).getPos().equals(pos))
					{
						gefunden = true;
						char name = sf.figuren.get(k).getName();
						String farbe;
						if(sf.figuren.get(k).getFarbe())
						{
							farbe = "W";
						}
						else
						{
							farbe = "B";
						}
						switch(name)
						{
							case 'T' : main_frame.getFPanel(pos).setImage(bildHolen("Turm",farbe)); break;
							case 'S' : main_frame.getFPanel(pos).setImage(bildHolen("Springer",farbe)); break;
							case 'L' : main_frame.getFPanel(pos).setImage(bildHolen("L�ufer",farbe)); break;
							case 'K' : main_frame.getFPanel(pos).setImage(bildHolen("K�nig",farbe)); break;
							case 'D' : main_frame.getFPanel(pos).setImage(bildHolen("Dame",farbe)); break;
							case 'B' : main_frame.getFPanel(pos).setImage(bildHolen("Bauer",farbe));
						}
						main_frame.repaint();
						main_frame.revalidate();
					}
				}
				if(!gefunden)
				{
					main_frame.getFPanel(pos).setImage(null);
				}
			}		
		}
	}
	public Image bildHolen(String name,String farbe)
	{
		Image image = null;
		try {
			image = ImageIO.read(new File("Images/"+name+farbe+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}
}
