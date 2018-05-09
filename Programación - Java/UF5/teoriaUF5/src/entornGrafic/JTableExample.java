package entornGrafic;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;

public class JTableExample extends JFrame {
	private boolean DEBUG = true;
	
	public JTableExample() {
		
		
		String[] columnNames = {"First Name", "Last Name", "Sport", "# of Years", "Vegetarian"};
		Object[][] data = {
				{"Katy", "Smith", "Snowboarding", new Integer(5), new Boolean(false)},
				{"YAMETE", "MASAKA", "NANI", new Integer(8), new Boolean(true)},
				{"Johan", "Laundry", "Sing", new Integer(4), new Boolean(false)},
				{"Jaden", "Story", "Dance", new Integer(13), new Boolean(true)},
				{"Boris", "Malakov", "Ski", new Integer(49), new Boolean(true)}
		};
		
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollingPane = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(480, 240));
		table.setFillsViewportHeight(true);
		setLayout(new FlowLayout());
		add(scrollingPane);
		
		if (DEBUG) {
			table.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					printDebugData(table);
				}
			});
		}
		
		pack();
		setVisible(true);
	}
	
	private void printDebugData(JTable tabla) {
		int filas = tabla.getRowCount();
		int cols = tabla.getColumnCount();
		TableModel model = tabla.getModel();
		
		for(int i=0; i<filas; i++) {
			System.out.println(" fila "+(i+1)+":");
			for(int j=0; j<cols; j++) {
				System.out.println(" "+model.getValueAt(i, j));
			}
			System.out.println();
		}
		System.out.println("-----------");
	}
	
	
	public static void main(String[] args) {
		new JTableExample();
	}

}
