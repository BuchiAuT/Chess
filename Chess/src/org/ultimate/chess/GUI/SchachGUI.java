package org.ultimate.chess.GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import org.ultimate.chess.model.Position;
import org.ultimate.chess.model.SpielFeld;

public class SchachGUI {
	private SpielFeld sf;
	private Haupt_Frame main_frame;

	public SchachGUI(SpielFeld sf) {
		boolean panelfarbe = true;
		this.sf = sf;
		main_frame = new Haupt_Frame();
		main_frame.setLayout(new GridLayout(8, 8, 1, 1));
		main_frame.setSize(500, 500);
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < 8; i++) {
			panelfarbe = !panelfarbe;
			for (int u = 0; u < 8; u++) {
				Image image = null;
				FigurenPanel fp = new FigurenPanel(u, i, image);
				fp.setOpaque(true);
				if (panelfarbe) {
					panelfarbe = !panelfarbe;
					fp.setBackground(Color.GRAY);
				} else {
					panelfarbe = !panelfarbe;
					fp.setBackground(Color.WHITE);
				}
				fp.addMouseListener(new PanelListener(this,sf,main_frame));
				main_frame.addPanel(fp);
			}
		}
		main_frame.repaint();
		main_frame.revalidate();
		main_frame.setVisible(true);
		zeichnen();
	}

	public void zeichnen() {
		System.out.println(sf);
		Position pos = new Position(100, 100);
		for (int i = 0; i < 8; i++) {
			pos.setY(i);
			for (int u = 0; i < 8; u++) {
				pos.setX(u);
				if (pos.getX() > 7) {
					break;
				}
				boolean gefunden = false;
				for (int k = 0; k < sf.figuren.size(); k++) {
					if (sf.figuren.get(k).getPos().equals(pos)) {
						gefunden = true;
						char name = sf.figuren.get(k).getName();
						String farbe;
						if (sf.figuren.get(k).getFarbe()) {
							farbe = "W";
						} else {
							farbe = "B";
						}
						switch (name) {
						case 'T':
							main_frame.getFPanel(pos).setImage(bildHolen("Turm", farbe));
							break;
						case 'S':
							main_frame.getFPanel(pos).setImage(bildHolen("Springer", farbe));
							break;
						case 'L':
							main_frame.getFPanel(pos).setImage(bildHolen("Läufer", farbe));
							break;
						case 'K':
							main_frame.getFPanel(pos).setImage(bildHolen("König", farbe));
							break;
						case 'D':
							main_frame.getFPanel(pos).setImage(bildHolen("Dame", farbe));
							break;
						case 'B':
							main_frame.getFPanel(pos).setImage(bildHolen("Bauer", farbe));
						}
						main_frame.repaint();
						main_frame.revalidate();
					}
				}
				if (!gefunden) {
					main_frame.getFPanel(pos).setImage(null);
				}
			}
		}
	}

	public Image bildHolen(String name, String farbe) {
		Image image = null;
		try {
			image = ImageIO.read(new File("Images/" + name + farbe + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}
}
