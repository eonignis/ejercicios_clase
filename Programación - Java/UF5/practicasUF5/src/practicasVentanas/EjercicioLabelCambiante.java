package practicasVentanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.UnknownHostException;

import javax.swing.*;

public class EjercicioLabelCambiante {
	public EjercicioLabelCambiante() {
		JFrame frame=new JFrame ("CheckBoxes");
		
		JPanel panelLabel=new JPanel();
		JPanel panelCB=new JPanel();
		panelCB.setLayout(new BoxLayout(panelCB, BoxLayout.Y_AXIS));
		frame.add(panelLabel, BorderLayout.WEST);
		frame.add(panelCB, BorderLayout.EAST);
		
		
		
		JLabel label=new JLabel();
		label.setText("TEXTO DE PRUEBA");
		panelLabel.add(label, BorderLayout.CENTER);
		

		JCheckBox cb1= new JCheckBox ("Color");
		JCheckBox cb2= new JCheckBox ("Negreta");
		JCheckBox cb3= new JCheckBox ("Inclinada");
		JCheckBox cb4= new JCheckBox ("Gran");

		panelCB.add(cb1);
		panelCB.add(cb2);
		panelCB.add(cb3);
		panelCB.add(cb4);
		
		
		
		
		cb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setBackground(e.getStateChange()==1?Color.BLUE:UIManager.getColor("Panel background"));
				
			}
		});
		
		/*cb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange())
				label.setText("Java Checkbox" + (e.getStateChange()==1?"Check":"unchecked"));
				
			}
		});
		*/

		frame.setSize(400, 200);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new EjercicioLabelCambiante();
	}
	 
}
