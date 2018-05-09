package entornGrafic;

import java.awt.FlowLayout;

import javax.swing.*;

public class TabbedPaneExample {
	JFrame frame;
	
	public TabbedPaneExample() {
		frame = new JFrame("Tabbed Pane");
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new FlowLayout());
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		
		JButton boton1=new JButton("asd");
		JButton boton2=new JButton("asdfasdfasdf");
		JButton boton3=new JButton("qewrtgsrf");
		panel1.add(boton3);
		panel2.add(boton2);
		panel3.add(boton1);
		
		JTabbedPane tp = new JTabbedPane();
		tp.add("Main", panel1);
		tp.add("Visit", panel2);	
		tp.addTab("Help", panel3);
		tp.setBounds(50, 50, 200, 200);
		
		frame.add(tp);
		
		frame.setLayout(null);
		frame.setSize(720, 480);
		frame.setVisible(true);
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		new TabbedPaneExample();
	}

}
