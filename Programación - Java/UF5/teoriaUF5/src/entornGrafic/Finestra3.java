package entornGrafic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Finestra3 extends JFrame {
	// <=== CON EL EXTENDS INDICAMOS QUE ESTA CLASE SERÁ DIRECTAMENTE UNA VENTANA Y
	// LUEGO AÑADIMOS LOS ELEMENTOS DENTRO QUE QUERAMOS ===>
	JButton boton;
	JTextField texto;

	public Finestra3() {
		// Creamos el botón, indicamos dónde estará, cuanto ocupará y lo añadimos
		boton = new JButton("Seguent");
		boton.setBounds(305, 1, 100, 40);
		this.add(boton);

		// Añadimos al botón una acción
		boton.addActionListener(new ActionListener() {
			// Tenemos que sobreescribir la acción ya existente

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
