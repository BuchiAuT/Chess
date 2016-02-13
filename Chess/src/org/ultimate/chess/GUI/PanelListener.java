package org.ultimate.chess.GUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import org.ultimate.chess.model.Position;
import org.ultimate.chess.model.SpielFeld;

public class PanelListener implements MouseListener {
boolean spielzug_gestartet;
FigurenPanel vonPanel;
Position nach;
Position von;
boolean weristdran;
SchachGUI gui;
SpielFeld sf;
Haupt_Frame main_frame;
	public PanelListener(SchachGUI sg, SpielFeld sf,Haupt_Frame main_frame)
	{
		this.main_frame = main_frame;
		this.sf = sf;
		gui = sg;
		weristdran = true; // weiß
	}

@Override
public void mouseClicked(MouseEvent arg0) {
	if(!spielzug_gestartet)
	{
	vonPanel = (FigurenPanel) arg0.getSource();
	}
	Position von1 = vonPanel.getPos();
	if (!spielzug_gestartet) {
		von = vonPanel.getPos();
	}
	Position posmöglich = new Position(100, 100);
	for (int i = 0; i < 8; i++) {
		posmöglich.setY(i);
		for (int u = 0; u < 8; u++) {
			posmöglich.setX(u);
			main_frame.getFPanel(posmöglich).setBorder(null);
			if (sf.holeFigur(von1).spielzugMoeglich(sf, posmöglich)) {
				Border border = new CompoundBorder(new EtchedBorder(), new LineBorder(Color.RED));
				main_frame.getFPanel(posmöglich).setBorder(border);
			}
		}
	}
	if (sf.holeFigur(vonPanel.getPos()).getFarbe() == weristdran) {
		if (!spielzug_gestartet) {
			spielzug_gestartet = true;
		} else {
			spielzug_gestartet = false;
			FigurenPanel nachPanel = (FigurenPanel) arg0.getSource();
			nach = nachPanel.getPos();
			sf.holeFigur(von).spielZug(sf, nach);
			gui.zeichnen();
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
}