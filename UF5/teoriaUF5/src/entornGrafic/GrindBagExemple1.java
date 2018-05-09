package entornGrafic;
import java.awt.*;
import javax.swing.*;

public class GrindBagExemple1 extends JFrame{
	
	public GrindBagExemple1() {
		GridBagLayout grindbag = new GridBagLayout();
		GridBagConstraints constraints=new GridBagConstraints();
		setLayout(grindbag);
		//constraints.grid=GridBagConstraints.RELATIVE
		
		JButton b1=new JButton("Bo1");
		constraints.gridx=0;
		constraints.gridy=0;
		constraints.ipadx=30;
		constraints.ipady=30;
		constraints.insets=new Insets(25,15,25,15);
		constraints.gridwidth=2;
		constraints.gridheight=2;
		constraints.fill=GridBagConstraints.VERTICAL;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		//constraints.fill=MAXIMIZED_VERT;
		//constraints.fill=MAXIMIZED_HORIZ;
		constraints.weightx=1;
		constraints.weighty=1;
		add(b1,constraints);
		
		JButton b2=new JButton("Bo3");

		constraints.insets=new Insets(0,0,0,0);
		constraints.gridx=1;
		constraints.gridy=2;
		constraints.gridheight=1;
		constraints.gridwidth=1;
		add(b2,constraints);
		
		JButton b3=new JButton("Bo2");
		constraints.gridx=0;
		constraints.gridy=2;
		add(b3,constraints);
		
		JButton b4=new JButton("Bo4");
		constraints.gridx=1;
		constraints.gridy=3;
		add(b4,constraints);
		
		JButton b5=new JButton("Bo5");
		constraints.gridx=0;	
		constraints.gridy=4;
		add(b5,constraints);
		
		JButton b6=new JButton("Bo6");
		constraints.gridx=1;
		constraints.gridy=5;
		add(b6,constraints);
		
		JButton b7=new JButton("Bo7");
		constraints.gridx=GridBagConstraints.RELATIVE;
		constraints.gridy=6;
		add(b7,constraints);
		
		JButton b8=new JButton("Bo8");
		constraints.gridx=GridBagConstraints.RELATIVE;
		constraints.gridy=6;
		add(b8,constraints);
		
		JButton b9=new JButton("Bo9");
		constraints.gridx=0;
		constraints.gridy=8;
		constraints.gridwidth=2;
		//constraints.anchor=GridBagConstraints.EAST;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		add(b9,constraints);
		
		pack();
		setVisible(true);
		
	}
public static void main(String[] args) {
	new GrindBagExemple1();
	
}
}
