package entornGrafic;

import java.awt.BorderLayout;
import javax.swing.*;

public class Finestra {
	// <=== CREAMOS UNA VENTANA A SACO, EN EL PROPIO MAIN ===>
	public static void main(String[] args) {
		// Crear una ventana
		JFrame finestra = new JFrame();
		// Crear botones
		JButton boton1 = new JButton("Botón 1");

		// Añadimos el botón al JFrame principal para que sea visible
		finestra.add(boton1);

		// Ahora indicamos dónde queremos el botón y cuanto ocupará
		boton1.setBounds(100, 100, 100, 40);

		// Crear la ventana: se le pone tamaño, layout y se indica si queremos que se
		// vea o no
		finestra.setSize(480, 360);
		finestra.setLayout(null);
		finestra.setVisible(true);

		
		
		/*
		 * JButton boton1 = new JButton("Botón 1"); JButton boton2 = new
		 * JButton("Botón 2"); JButton boton3 = new JButton("Botón 3"); JButton boton4 =
		 * new JButton("Botón 4"); JButton boton5 = new JButton("Botón 5");
		 * 
		 * finestra.add(boton1, BorderLayout.NORTH); finestra.add(boton2,
		 * BorderLayout.SOUTH); finestra.add(boton3, BorderLayout.CENTER);
		 * finestra.add(boton4, BorderLayout.EAST); finestra.add(boton5,
		 * BorderLayout.WEST);
		 */
	}

}
