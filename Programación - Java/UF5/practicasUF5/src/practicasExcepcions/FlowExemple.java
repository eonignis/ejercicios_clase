package practicasExcepcions;

import java.awt.FlowLayout;

import javax.swing.*;

public class FlowExemple {
	JFrame frame;
	JLabel label=new JLabel();
	
	public FlowExemple() {
		frame=new JFrame();
		JButton boton1 = new JButton("Bot�n 1");
		JButton boton2 = new JButton("Bot�n 2");
		JButton boton3 = new JButton("Bot�n 3");
		JButton boton4 = new JButton("Bot�n 4");
		JButton boton5 = new JButton("Bot�n 5");
		frame.add(boton1);
		frame.add(boton2);
		frame.add(boton3);
		frame.add(boton4);
		frame.add(boton5);
		
		frame.setSize(480, 360);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowExemple();
	}
}
