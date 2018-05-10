package pract_grup;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Inici_sessio extends JFrame implements ActionListener{
	
	JPanel p;
	JLabel l1,l2;
	JTextField tf1;
	JPasswordField pswd;
	JButton b1;
	
	String user = "Pop";
	String password = "pass";
	
	public Inici_sessio() {
		
		super ("Iniciar sessió");
		
		p = new JPanel();
		add(p);
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraints = new GridBagConstraints();
		p.setLayout(gridbag);
		
		l1 = new JLabel("Usuari");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.insets = new Insets(10,10,10,10);
		p.add(l1, constraints);
		
		tf1 = new JTextField(15);
		constraints.gridx = 1;
		constraints.gridy = 0;
		p.add(tf1, constraints);
		
		l2 = new JLabel("Contrassenya");
		constraints.gridx = 0;
		constraints.gridy = 1;
		p.add(l2, constraints);
		
		pswd = new JPasswordField(15);
		constraints.gridx = 1;
		constraints.gridy = 1;
		p.add(pswd, constraints);
		
		b1 = new JButton("Entrar");
		constraints.gridx = 1;
		constraints.gridy = 2;
		p.add(b1, constraints);
		
		b1.addActionListener(this);
		
		setVisible(true);
		setSize(600,250);
		
	}
	
	

	public static void main(String[] args) {
		new Inici_sessio();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String text1 = tf1.getText();
		String text2 = pswd.getText();
		if(text1 == user) {
			System.out.println("Entra");
		}
		else {
			System.out.println("No entra");
			System.out.println(text1);
			System.out.println(user);
			System.out.println(text2);
		}
		
		
	}

}
