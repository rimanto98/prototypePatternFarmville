package interfacciaGrafica;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ortaggi.*;

public class Pannello extends JPanel implements MouseListener{
	
	PrototipoOrtaggio prototipo;
	JLabel picLabel;
	
	public Pannello() {
		picLabel = new JLabel();
		addMouseListener(this);
		
	}
	
	public void caricaPrototipo(PrototipoOrtaggio p){
		
		prototipo = p;
		disegna(prototipo);
		
	}
	
	public void disegna(PrototipoOrtaggio prototipo)
	{
		remove(picLabel);
		picLabel = new JLabel(new ImageIcon(prototipo.img));
		add(picLabel);
		revalidate();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		caricaPrototipo(Main.ortaggi.get(Main.index).clona());
		//System.out.println("stampa");
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	

}
