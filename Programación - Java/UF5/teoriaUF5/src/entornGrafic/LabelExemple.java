package entornGrafic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.*;

public class LabelExemple extends JFrame implements ActionListener {
	JTextField texto;
	JLabel label;
	JButton boton;

	public LabelExemple() {
		// Boton
		boton = new JButton("Obtener IP");
		boton.setBounds(305, 15, 100, 40);
		boton.addActionListener(this);
		this.add(boton);

		// TextField
		texto = new JTextField();
		texto.setBounds(1, 15, 300, 40);
		this.add(texto);

		// Label
		label = new JLabel();
		label.setBounds(1, 1, 500, 15);
		label.setText("Introduce una dirección web");
		this.add(label);

		this.setSize(720, 480);
		this.setLayout(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Le indicamos que recoja el texto
		String direccion = texto.getText();
		try {
			// Creamos la variable IP que será donde devolvamos la IP
			String ip = java.net.InetAddress.getByName(direccion).getHostAddress();
			// Mostramos en el Label cual es la ip, almacenada anteriormente en la variable
			// "dirección"
			label.setText("IP de " + direccion + " es: " + ip);
		} catch (UnknownHostException e1) {
			// Si el usuario no introduce una dirección correcta, saltará una ventana
			// emergente que le indique qué debe hacer
			JOptionPane.showMessageDialog(null, "Introduce una dirección web correcta.");

			// System.out.println("Introduce una dirección web correcta.");
		}

	}

	public static void main(String[] args) {
		new LabelExemple();

	}
}
