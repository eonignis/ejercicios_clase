package entornGrafic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Combo {
	JFrame frame;
	public Combo() {
		frame = new JFrame("Ejemplo ComboBox");
		JLabel label=new JLabel ();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		
		
		JButton boton=new JButton("Mostrar");
		boton.setBounds(200, 100, 120, 20);
		
		
		String [] llenguatges= {"C", "C++", "C#", "Java", "Python"};
		JComboBox comboBox=new JComboBox(llenguatges);
		comboBox.setBounds(50, 100, 90, 20);
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text="Has escollit el llenguatge: "+comboBox.getItemAt(comboBox.getSelectedIndex());
				label.setText(text);
			}
		});
		
		frame.add(label);
		frame.add(boton);
		frame.add(comboBox);
		
		frame.setSize(480, 360);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Combo();
	}

}
