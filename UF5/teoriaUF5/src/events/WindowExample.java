package events;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class WindowExample extends JFrame implements WindowListener {
	public WindowExample() {
		
		addWindowListener(this);
		
		setSize(480, 360);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowExample();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("Has abierto la ventana");
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("Has cerrado la ventana");
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("Vas a cerrar la ventana");
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("Has minimizado la ventana");
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("Has desiconificado la ventana");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("Has iconificado la ventana");
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("Se ha abierto la ventana");
		
	}

}
