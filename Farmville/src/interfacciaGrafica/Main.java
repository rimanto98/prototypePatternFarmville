package interfacciaGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ortaggi.*;

public class Main{
	
	public static ArrayList<PrototipoOrtaggio> ortaggi;
	
	public static int index;

	public static void main(String[] args) {
		
		JFrame framePrincipale = new JFrame ("Farm");
		
		JPanel contenuto = new JPanel();
	    contenuto.setLayout(new BorderLayout());
		
		JPanel pannelloDiGioco = new JPanel();
	    pannelloDiGioco.setLayout(new GridLayout(6, 6, 0, 0));
		
		for (int i = 0; i<6;i++)
			for (int j = 0;j<6;j++)
			{
				Pannello pannello = new Pannello();
				pannello.setBackground(new Color(120,80,50));
				pannelloDiGioco.add(pannello);
			}
		
		JPanel pannelloBottoni = new JPanel();
		pannelloBottoni.setLayout(new GridLayout(4,1));
		JButton pomodori = new JButton("Pomodori");
		JButton zucchine = new JButton("Zucchine");
		JButton patate = new JButton("Patate");
		JButton cipolle = new JButton("Cipolle");
		
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == pomodori)
					index = 0;
				
				else if(e.getSource() == zucchine)
					index = 1;
					
				else if(e.getSource() == patate)
					index = 2;
				
				else if(e.getSource() == cipolle)
					index = 3;
				
			}
		};
		
		pomodori.addActionListener(action);
		zucchine.addActionListener(action);
		patate.addActionListener(action);
		cipolle.addActionListener(action);
		
		pannelloBottoni.add(pomodori);
		pannelloBottoni.add(zucchine);
		pannelloBottoni.add(patate);
		pannelloBottoni.add(cipolle);
		
		contenuto.add(pannelloDiGioco, BorderLayout.CENTER);
		contenuto.add(pannelloBottoni, BorderLayout.LINE_START);
		
		framePrincipale.setContentPane(contenuto);

		framePrincipale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipale.setSize(720, 720);
		framePrincipale.setLocation(200, 200);
		
		PrototipoPomodoro pom = new PrototipoPomodoro();
		PrototipoZucchina zuc = new PrototipoZucchina();
		PrototipoCipolla cip = new PrototipoCipolla();
		PrototipoPatata pat = new PrototipoPatata();
		
		ortaggi = new ArrayList<PrototipoOrtaggio>();
		
		ortaggi.add(pom);
		ortaggi.add(zuc);
		ortaggi.add(pat);
		ortaggi.add(cip);
		
		framePrincipale.setVisible(true);
		
		
	}
	
}
