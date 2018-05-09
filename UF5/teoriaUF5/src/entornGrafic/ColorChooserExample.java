package entornGrafic;

import java.awt.event.*;
import java.io.File;
import java.awt.*;

import javax.swing.*;

public class ColorChooserExample extends JFrame implements ActionListener{
	JButton boton1, boton2;
	Container c;
	JLabel label;
	
	public ColorChooserExample() {
		c = getContentPane();
		c.setLayout(new FlowLayout());
		boton1 = new JButton(new ImageIcon("twitter.png"));
		boton1.setSize(100, 100);
		boton1.addActionListener(this);
		
		label = new JLabel(new ImageIcon("twitter.png"));
		
		boton2 = new JButton("Abrir");
		boton2.addActionListener(this);
		
		c.add(boton1);
		c.add(boton2);
		c.add(label);
	
	}
	
	public static void main(String[] args) {
		ColorChooserExample ch = new ColorChooserExample();
		ch.setSize(720, 480);
		ch.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			Color initcolor=Color.RED;
			Color color=JColorChooser.showDialog(this, "Select Color", initcolor);
			c.setBackground(color);
		} else {
			JFileChooser fc = new JFileChooser();
			fc.showOpenDialog(this);
			File file = fc.getSelectedFile();
			// Hacer las cosas que toquen con el fichero nuevo que se ha abierto
		}
		
	}

}
