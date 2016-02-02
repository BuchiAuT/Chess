package org.ultimate.chess.GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

import org.ultimate.chess.model.Bauer;
import org.ultimate.chess.model.Dame;
import org.ultimate.chess.model.König;
import org.ultimate.chess.model.Laeufer;
import org.ultimate.chess.model.Position;
import org.ultimate.chess.model.SpielFeld;
import org.ultimate.chess.model.Springer;
import org.ultimate.chess.model.Turm;

public class SchachGUI 
{	
	Position nach;
	Position von;
	boolean spielzug_gestartet;
	private SpielFeld sf;
	private JFrame main_frame;
	public SchachGUI(SpielFeld sf)
	{
		spielzug_gestartet = false;
		this.sf = sf;
		main_frame = new JFrame();
		main_frame.setLayout(new GridLayout(8,8,1,1));
		main_frame.setSize(500, 500);
		for(int i = 0;i<8;i++)
		{
			for(int u = 0; u<8;u++)
			{
				Image image = null;
				try {
					image = ImageIO.read(new File("Images/Bauer.JPG"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				FigurenPanel fp = new FigurenPanel(i,u,image);
				fp.addMouseListener(new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent arg0) {
					if(!spielzug_gestartet)
					{
						spielzug_gestartet = true;
						FigurenPanel vonPanel = (FigurenPanel)arg0.getSource();
						von =vonPanel.getPos();
					}
					else
					{
						spielzug_gestartet = false;
						FigurenPanel nachPanel = (FigurenPanel)arg0.getSource();
						nach = nachPanel.getPos();
						sf.holeFigur(von).spielZug(sf, nach);
						zeichnen();
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
				fp.setBackground(Color.LIGHT_GRAY);
				main_frame.add(fp);
			}
		}
		main_frame.repaint();
		main_frame.revalidate();
		main_frame.setVisible(true);
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
				for(int k= 0; k < sf.figuren.size();k++)
				{
					if(sf.figuren.get(k).getPos().equals(pos))
					{
						switch(sf.figuren.get(k).getName().charAt(0))
						{
							case 'T' : ((FigurenPanel) main_frame.getComponentAt(pos.getX(), pos.getY())).setImage(bildHolen("Turm")); break;
							case 'S' : ((FigurenPanel) main_frame.getComponentAt(pos.getX(), pos.getY())).setImage(bildHolen("Springer")); break;
							case 'L' : ((FigurenPanel) main_frame.getComponentAt(pos.getX(), pos.getY())).setImage(bildHolen("Läufer")); break;
							case 'K' : ((FigurenPanel) main_frame.getComponentAt(pos.getX(), pos.getY())).setImage(bildHolen("König")); break;
							case 'D' : ((FigurenPanel) main_frame.getComponentAt(pos.getX(), pos.getY())).setImage(bildHolen("Dame")); break;
							case 'B' : ((FigurenPanel) main_frame.getComponentAt(pos.getX(), pos.getY())).setImage(bildHolen("Bauer"));
						}
					}
				}
			}
		}
	}
	public Image bildHolen(String name)
	{
		Image image = null;
		try {
			image = ImageIO.read(new File("Images/"+name+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}
}
