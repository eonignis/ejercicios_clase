package exercici1_RadioButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class EntornGrafic extends JFrame {
	JRadioButton bird, cat, dog, rabbit, pig;
	JPanel botones, imagen;
	JLabel image;
	ButtonGroup grupo;
	
	public EntornGrafic() {
		botones = new JPanel();
		imagen = new JPanel();
		
		BoxLayout vertical = new BoxLayout(botones,BoxLayout.Y_AXIS);
		botones.setLayout(vertical);
		
		
		grupo =new ButtonGroup();

		image = new JLabel(new ImageIcon("Bird.gif"));
		imagen.add(image, BorderLayout.CENTER);

		
		bird=new JRadioButton("Bird");
		cat=new JRadioButton("Cat");
		dog=new JRadioButton("Dog");
		rabbit=new JRadioButton("Rabbit");
		pig=new JRadioButton("Pig");
		
		
		grupo.add(bird);
		grupo.add(cat);
		grupo.add(dog);
		grupo.add(rabbit);
		grupo.add(pig);
		
		
		botones.add(bird);
		botones.add(cat);
		botones.add(dog);
		botones.add(rabbit);
		botones.add(pig);
		
		add(botones);
		add(imagen);
		
		
		bird.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (bird.isSelected()) {
					image.setIcon(new ImageIcon("Bird.gif"));
				}
			}
		});
		
		cat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cat.isSelected()) {
					image.setIcon(new ImageIcon("Cat.gif"));
				}
			}
		});
		
		dog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (dog.isSelected()) {
					image.setIcon(new ImageIcon("Dog.gif"));
				}
			}
		});
		
		rabbit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (rabbit.isSelected()) {
					image.setIcon(new ImageIcon("Rabbit.gif"));
				}
			}
		});
		
		pig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pig.isSelected()) {
					image.setIcon(new ImageIcon("Pig.gif"));
				}
			}
		});
		
		setLayout(new FlowLayout());
		pack();
		setVisible(true);
	}
}
