package practicasExcepcions;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.UnknownHostException;

import javax.swing.*;

public class CheckBoxExample {
	public CheckBoxExample() {
		JFrame frame=new JFrame ("CheckBoxes");
		JLabel label=new JLabel();
		label.setBounds(150, 50, 200, 50);

		JCheckBox cb1= new JCheckBox ("C++");
		JCheckBox cb2= new JCheckBox ("Java");
		cb1.setBounds(150, 100, 50, 50);
		cb2.setBounds(150, 150, 50, 50);
		frame.add(label); frame.add(cb2); frame.add(cb1);
		cb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("C++ Checkbox" + (e.getStateChange()==1?"Check":"unchecked"));
				
			}
		});
		
		cb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("Java Checkbox" + (e.getStateChange()==1?"Check":"unchecked"));
				
			}
		});
		

		frame.setSize(720, 480);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxExample();
	}
	 
}
