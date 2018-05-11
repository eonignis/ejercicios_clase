package exercici2_GridBagExercice;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridBagExercice extends JFrame {
	JLabel texto;
	JButton boton1, boton2, boton3, boton4;
	JTextField field;
	
	public GridBagExercice() {
		
		GridBagLayout grindbag = new GridBagLayout();
		GridBagConstraints constraints=new GridBagConstraints();
		setLayout(grindbag);
		
		texto = new JLabel("Area de texto");
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.weightx=1;
		constraints.weighty=1;
		add(texto, constraints);
		
		boton1 = new JButton("Boton 1");
		constraints.gridx=2;
		constraints.gridy=0;
		add(boton1, constraints);
		
		boton2 = new JButton("Boton 2");
		constraints.gridx=2;
		constraints.gridy=1;
		add(boton2, constraints);
		
		boton3 = new JButton("Boton 3");
		constraints.gridx=0;
		constraints.gridy=2;
		add(boton3, constraints);
		
		boton4 = new JButton("Boton 4");
		constraints.gridx=2;
		constraints.gridy=2;
		add(boton4, constraints);
		
		field = new JTextField("Campo de Texto");
		constraints.gridx=1;
		constraints.gridy=2;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		add(field, constraints);
		
		
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridBagExercice();
	}
}
