package practicaSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercici1 extends JFrame implements ActionListener {
	// <=== CONVERSOR DE EUROS A DOLARES ===>
	// <--- Tiene opción a reiniciar o cerrar la ventana --->
	
	
	private JTextField field;
	private JLabel label;
	private JButton boton;
	private JMenu menu;
	private JMenuItem item1, item2;

	public Exercici1() {
		this.setLayout(new FlowLayout());
		JMenuBar menuBar = new JMenuBar();
		item1 = new JMenuItem("Reiniciar");
		item2 = new JMenuItem("Cerrar [X]");
		menu = new JMenu("Archivo");
		field = new JTextField(25);
		label = new JLabel("Introduce una cantidad de Euros a convertir en Dollar");
		boton = new JButton("CONVERT");

		item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setVisible(true);
				label.setText("Introduce una cantidad de Euros a convertir en Dollar");
				field.setText("");
				field.setEditable(true);
				boton.setVisible(true);
			}
		});

		item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		boton.addActionListener(this);

		add(label);
		add(field);
		add(boton);
		menu.add(item1);
		menu.add(item2);

		menuBar.add(menu);
		setJMenuBar(menuBar);
		setSize(360, 150);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String euros = field.getText();
		double douEuros = 0;
		try {
			douEuros = Double.parseDouble(euros);
			double dollar;
			dollar = (douEuros * 1.23087);

			field.setText("La cantidad de euros introducidos son: " + dollar + "$");
		} catch (NumberFormatException e) {
			label.setText("Invalid Entry.");
			field.setText("Ve a Archivo y reinicia el programa.");
		}

		
		field.setEditable(false);
		boton.setVisible(false);


	}

	public static void main(String[] args) {
		new Exercici1();
	}
}
