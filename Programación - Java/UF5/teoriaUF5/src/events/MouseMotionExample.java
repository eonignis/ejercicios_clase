package events;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseMotionExample  extends JFrame implements MouseMotionListener {
	public MouseMotionExample() {
		addMouseMotionListener(this);
		setSize(720, 480);
		setLayout(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MouseMotionExample();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		Graphics pintador=getGraphics();
		pintador.setColor(Color.red);
		pintador.fillOval(arg0.getX(), arg0.getY(), 10, 10);
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		Graphics pintador=getGraphics();
		pintador.setColor(Color.blue);
		pintador.fillOval(arg0.getX(), arg0.getY(), 10, 10);
		
	}

}
