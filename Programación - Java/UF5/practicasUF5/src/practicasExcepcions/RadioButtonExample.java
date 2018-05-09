package practicasExcepcions;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.*;

public class RadioButtonExample extends JFrame {
	JRadioButton rb1, rb2;
	JButton boton;

	public RadioButtonExample() {
		rb1=new JRadioButton("Si");
		rb2=new JRadioButton("No");
		rb1.setBounds(100, 50, 100, 30);
		rb2.setBounds(100, 100, 100, 30);
		
		boton= new JButton("Click");
		boton.setBounds(100, 150, 100, 30);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rb1.isSelected()) {
					JOptionPane.showMessageDialog(getContentPane(), "Has seleccionado el SI");
				}
				
				if (rb2.isSelected()) {
					JOptionPane.showMessageDialog(getContentPane(), "Has seleccionado el NO");
				}
				
				if (!rb1.isSelected() && !rb2.isSelected()) {
					JOptionPane.showMessageDialog(getContentPane(), "No has seleccionado NIGUNO, ESCORIA");
				}
				
			}
		});
		
		add(boton);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rb1);
		grupo.add(rb2);
		
		add(rb1); add(rb2);
		
		setSize(720, 480);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonExample();
	}

}
