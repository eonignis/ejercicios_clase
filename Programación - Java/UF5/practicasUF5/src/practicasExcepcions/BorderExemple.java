package practicasExcepcions;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderExemple extends JFrame {
	JLabel label=new JLabel();
	
	public BorderExemple() {
		label=new JLabel("Cambiante");
		add(label, BorderLayout.CENTER);
		
		JPanel panel=new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		setBackground(Color.BLUE);
		
		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");
		JButton boton3 = new JButton("Botón 3");
		JButton boton4 = new JButton("Botón 4");
		JButton boton5 = new JButton("Botón 5");
		panel.add(boton1, BorderLayout.EAST);
		//getContentPane().setBackground(Color.YELLOW);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		panel.add(boton5);
		
		add(panel);
		
		
		
		setSize(480, 360);
		setLayout(new FlowLayout());
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderExemple();
	}
}
