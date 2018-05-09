package entornGrafic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Finestra3 extends JFrame {
	// <=== CON EL EXTENDS INDICAMOS QUE ESTA CLASE SER� DIRECTAMENTE UNA VENTANA Y
	// LUEGO A�ADIMOS LOS ELEMENTOS DENTRO QUE QUERAMOS ===>
	JButton boton;
	JTextField texto;

	public Finestra3() {
		// Creamos el bot�n, indicamos d�nde estar�, cuanto ocupar� y lo a�adimos
		boton = new JButton("Seguent");
		boton.setBounds(305, 1, 100, 40);
		this.add(boton);

		// A�adimos al bot�n una acci�n
		boton.addActionListener(new ActionListener() {
			// Tenemos que sobreescribir la acci�n ya existente

			@Override
			public void actionPerformed(ActionEvent arg0) {
				texto.setText("Estoy escribiendo en el TextField");

			}

		});

		// Creamos el textfield
		texto = new JTextField();
		texto.setBounds(1, 1, 300, 40);
		this.add(texto);

		this.setSize(720, 480);
		this.setLayout(null);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Finestra3();
	}

}
