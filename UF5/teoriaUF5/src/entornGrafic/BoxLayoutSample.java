package entornGrafic;

import java.awt.FlowLayout;

import javax.swing.*;

public class BoxLayoutSample {
	
	
	public static void main(String[] args) {
		JFrame frame=new JFrame("BoxLayout Example");
		BoxLayout boxlayout=new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		frame.setLayout(boxlayout);
		
		
		JButton boton1 = new JButton("Botón 1");
		JButton boton2 = new JButton("Botón 2");
		JButton boton3 = new JButton("Botón 3");
		//boton1.setBackground(blue);
		
		frame.add(boton1);
		frame.add(boton2);
		frame.add(boton3);
		
		
		//frame.setSize(480, 360);
		frame.pack();
		//frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
}
