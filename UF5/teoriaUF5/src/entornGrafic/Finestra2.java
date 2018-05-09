package entornGrafic;

import java.awt.BorderLayout;
import javax.swing.*;

public class Finestra2 {
	// <=== CREAMOS UNA VENTANA EN UNA CLASE Y LUEGO EN EL MAIN LA LLAMAMOS ===>
	
	
	JFrame finestra;
	JButton boton;
	public Finestra2() {
		finestra=new JFrame();
		boton=new JButton("CLICK");
		
		finestra.add(boton);
		boton.setBounds(100, 100, 100, 40);
		
		finestra.setSize(480, 360);
		finestra.setLayout(null);
		finestra.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Finestra2();
	}
	

}
