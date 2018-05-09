package entornGrafic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.*;

public class TextAreaExemple implements ActionListener {
	JLabel l1, l2;
	JTextArea area;
	JFrame frame;
	JButton boton;

	public TextAreaExemple() {
		frame = new JFrame();
		
		l1 = new JLabel();
		l1.setBounds(50, 25, 100, 30);
		l2 = new JLabel();
		l2.setBounds(16, 10, 100, 30);
		
		area = new JTextArea();
		area.setBounds(20, 75, 250, 200);
		
		boton = new JButton("Contar palabras");
		boton.setBounds(100, 300, 120, 30);
		boton.addActionListener(this);

		frame.add(l1);
		frame.add(l2);
		frame.add(area);
		frame.add(boton);

		frame.setSize(720, 480);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new TextAreaExemple();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String text = area.getText();
		String [] paraules = text.split("\\s");
		l1.setText("Paraules: "+paraules.length);
		l2.setText("Caracters: "+text.length());
		
	}
}
