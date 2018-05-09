package practicaV1;

import javax.swing.*;

public class Exercici1 {
	String respuesta = "0";
	double number = 0;
	double answer = 0;
	int contador = 0;

	public Exercici1() {
		try {
			
			while (respuesta != null) {
				respuesta = JOptionPane.showInputDialog(null, "Introduce un número");
				if (respuesta != null) {
					answer = Double.parseDouble(respuesta);
					number = number + answer;
					contador++;
				}
			}
			
			if (contador!=0) {
				answer = number / contador;
				JOptionPane.showMessageDialog(null, "El promedio es: " + answer);
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Datos introducidos erroneos");
		}		
	}

	public static void main(String[] args) {
		new Exercici1();
	}
}
