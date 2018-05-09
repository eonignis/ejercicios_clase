package events;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyListenerExample extends JFrame implements KeyListener {
	// No funciona bien
	JLabel label1, label2, label3;
	JTextArea area;
	
	public KeyListenerExample() {
		label1=new JLabel();
		label2=new JLabel();
		label3=new JLabel();
		setLayout(null);
		JPanel panel=new JPanel();
		BoxLayout vertical=new BoxLayout(panel,BoxLayout.X_AXIS);
		
		area =new JTextArea();
		panel.setLayout(vertical);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		label1.setOpaque(true);
		label1.setBackground(Color.PINK);
		add(panel);
		//panel.setBounds(0, 0,50, 50);
		area=new JTextArea();
		//area.setBounds(20, 80, 300, 300);
		add(area);
		area.addKeyListener(this);
		
		setSize(720, 480);
		setLayout(new FlowLayout());
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new KeyListenerExample();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		label1.setText("ASDFASDFASDFASDFADSFAFSDFASDFA");
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		label2.setText("Liberado");
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		label3.setText("Presionado");
		
	}

}
