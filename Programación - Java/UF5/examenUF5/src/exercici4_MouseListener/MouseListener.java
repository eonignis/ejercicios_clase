package exercici4_MouseListener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class MouseListener extends JFrame implements MouseMotionListener {
	JButton boton1;
	JLabel area;
	
	public MouseListener() {
		area = new JLabel("LABEL POCO GRANDE");
		boton1 = new JButton("Botón 1");
		boton1.setSize(20, 40);
		
		add(boton1);
		add(area);		
		
		addMouseMotionListener(this);
		
		setSize(300, 140);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseListener();
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		/*Graphics pintador=getGraphics();
		pintador.setColor(Color.red);
		pintador.fillOval(arg0.getX(), arg0.getY(), 10, 10);*/
		
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {
		
		/*Graphics pintador=getGraphics();
		pintador.setColor(Color.blue);
		pintador.fillOval(arg0.getX(), arg0.getY(), 10, 10);*/
		
	}
}
