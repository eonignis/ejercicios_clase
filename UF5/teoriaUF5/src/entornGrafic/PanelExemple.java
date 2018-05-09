package entornGrafic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelExemple {
	public PanelExemple() {
		JFrame frame=new JFrame("Panel Exemple");
		JPanel panel=new JPanel();
		panel.setBounds(40, 80, 200, 200);
		panel.setBackground(Color.YELLOW);
		
		JButton boton1=new JButton("Boton 1");
		boton1.setBounds(50, 100, 80, 30);
		boton1.setBackground(Color.RED);
		
		JButton boton2=new JButton("Boton 2");
		boton2.setBounds(100, 100, 80, 30);
		boton2.setBackground(Color.BLUE);
		
		JButton boton3=new JButton("Upsis");
		boton3.setBounds(150, 100, 80, 30);
		boton3.setBackground(Color.GREEN);
		
		frame.add(panel);
		panel.add(boton1);
		panel.add(boton2);
		
		
		frame.setSize(480, 360);
		frame.setLayout(null);
		frame.setVisible(true);
		
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				frame.add(boton3);
				
				
			}
		});
	}
	
	
	public static void main(String[] args) {
		new PanelExemple();
	}

}
