package entornGrafic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuExample {
	JMenu menu, subMenu;
	JMenuItem item1, item2, item3, item4, item5;
	public MenuExample() {
		JFrame frame=new JFrame("Menu item menu example");
		JMenuBar menuBar=new JMenuBar();
		menu=new JMenu("Archivo");
		subMenu=new JMenu ("Sub Menu");
		item1=new JMenuItem("Nuevo");
		item2=new JMenuItem("Abrir");
		item3=new JMenuItem("Guardar");
		item4=new JMenuItem("Cerrar [X]");
		item5=new JMenuItem("Tonto el que lo lea");
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(subMenu);
		menu.add(item4);
		subMenu.add(item5);
		
		menuBar.add(menu);
		
		
		frame.setJMenuBar(menuBar);
		frame.setSize(480, 360);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new MenuExample();
	}

}
