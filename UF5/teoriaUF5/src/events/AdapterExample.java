package events;

import java.awt.event.WindowAdapter;

import javax.swing.*;

public class AdapterExample {
	JFrame frame;
	public AdapterExample() {
		frame = new JFrame("Adapter Window");
		frame.addWindowListener(new WindowAdapter() {
			public void windowDeactivated(java.awt.event.WindowEvent e) {
				System.out.println("Has cerrado la ventana");
				frame.dispose();
			}
		});
		
		
		frame.setSize(480, 360);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new AdapterExample();
	}

}
