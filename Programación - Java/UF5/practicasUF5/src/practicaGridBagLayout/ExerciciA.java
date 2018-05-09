package practicaGridBagLayout;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExerciciA extends JFrame implements ActionListener{
	public ExerciciA() {
		//	<--- CANCELAR cierra el programa --->
		
		//	Creamos el gridbag y lo añadiremos como layout
		this.getContentPane().setBackground(Color.PINK);
		GridBagLayout grindbag = new GridBagLayout();
		GridBagConstraints constraints=new GridBagConstraints();
		
		//	Creamos el panel, que es donde trabajaremos. Le damos forma
		JPanel panel=new JPanel();
		panel.setBackground(Color.PINK);
		panel.setLayout(grindbag);
		Border border = new TitledBorder(new LineBorder(Color.BLUE), "Example GridBagLayout");
		panel.setBorder(border);
		
		
		//	Empezamos con los elementos dentro de la ventana
		JLabel title = new JLabel("PROVA GridBagLayout");
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.gridwidth=2;
		constraints.ipadx=0;
		constraints.ipady=10;
		constraints.insets=new Insets(5,0,5,0);
		panel.add(title, constraints);
		
		JTextField fieldName = new JTextField("Nom:", 15);
		constraints.gridx=0;
		constraints.gridy=1;
		constraints.gridwidth=1;
		constraints.ipadx=0;
		constraints.ipady=0;
		panel.add(fieldName, constraints);
		
		JTextField fieldDirect = new JTextField("Direcció:", 15);
		constraints.gridx=1;
		constraints.gridy=1;
		
		panel.add(fieldDirect, constraints);
		
		JTextArea fieldComent = new JTextArea("Comentaris: ",3,20);
		constraints.gridx=0;
		constraints.gridy=2;
		constraints.gridwidth=2;
		constraints.gridheight=2;
		//constraints.fill=GridBagConstraints.VERTICAL;
		constraints.fill=GridBagConstraints.BOTH;
		constraints.weighty=1;	
		panel.add(fieldComent, constraints);
		
		JButton aceptar = new JButton("ACEPTAR");
		constraints.weighty=0;
		constraints.gridx=1;
		constraints.gridy=5;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.insets=new Insets(0,15,25,15);
		constraints.gridwidth=1;
		constraints.gridheight=1;
		constraints.fill=GridBagConstraints.NONE;
		panel.add(aceptar, constraints);
		
		JButton cancelar = new JButton("CANCELAR");
		constraints.gridx=0;
		constraints.gridy=5;
		constraints.gridwidth=1;
		constraints.gridheight=1;
		cancelar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//	Este botón cerrará la ventana
				dispose();
			}
		});
		panel.add(cancelar, constraints);
		
		add(panel);
		
		pack();
		//setSize(480,360);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ExerciciA();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}