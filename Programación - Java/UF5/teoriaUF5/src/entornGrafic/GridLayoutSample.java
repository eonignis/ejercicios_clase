package entornGrafic;

import java.awt.*;

import javax.swing.*;

public class GridLayoutSample {
	JFrame frame;
	public GridLayoutSample() {
		frame=new JFrame();
		
		JButton boton1 = new JButton("Bot�n 1");
		JButton boton2 = new JButton("Bot�n 2");
		JButton boton3 = new JButton("Bot�n 3");
		JButton boton4 = new JButton("Bot�n 4");
		JButton boton5 = new JButton("Bot�n 5");
		JButton boton6 = new JButton("Bot�n 6");
		JButton boton7 = new JButton("Bot�n 7");
		JButton boton8 = new JButton("Bot�n 8");
		JButton boton9 = new JButton("Bot�n 9");
		
		frame.add(boton1);
		frame.add(boton2);
		frame.add(boton3);
		frame.add(boton4);
		frame.add(boton5);
		frame.add(boton6);
		frame.add(boton7);
		frame.add(boton8);
		frame.add(boton9);
		
		frame.setLayout(new GridLayout(2,5, 85, 85));
		
		
		JLabel label = new JLabel("Test");
		label.setForeground(Color.blue);
		label.setBackground(Color.lightGray);
		frame.add(label);
		
		//frame.pack();
		frame.setSize(300, 300);
		//frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new GridLayoutSample();
	}

}
