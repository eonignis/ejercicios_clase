package entornGrafic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CardLayoutExample extends JFrame implements ActionListener{
	
	CardLayout card;
	Container contenedor;
	JButton boton1, boton2, boton3;
	
	public CardLayoutExample() {
		contenedor=getContentPane();
		card=new CardLayout(40, 30);
		contenedor.setLayout(card);
		
		boton1 = new JButton("Manzana");
		boton2 = new JButton("Pera");
		boton3 = new JButton("Naranja");
		
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		
		
		
		contenedor.add("A", boton1);
		contenedor.add("B", boton2);
		contenedor.add("C", boton3);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		card.next(contenedor);
	}
	
	
	public static void main(String[] args) {
		CardLayoutExample card1 = new CardLayoutExample();
		card1.setSize(480, 360);
		card1.setVisible(true);
	}

}
