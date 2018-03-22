package practica3;

import java.util.Scanner;

public class Compte {
	String titular;
	double quantitat;

	Compte(String titular, double quantitat) {
		this.titular = titular;
		this.quantitat = quantitat;
	}

	Compte(String titular) {
		this.titular = titular;
	}

	public double ingressar(double quantitat) {
		double cantidad = 0;
		System.out.println("Escribe una cantidad a ingresar: ");
		Scanner lector = new Scanner(System.in);
		cantidad = lector.nextDouble();
		if (cantidad > 0) {
			quantitat = quantitat + cantidad;
			System.out.println("La operación tuvo éxito");
			return quantitat;
		}

		System.out.println("La cantidad no se puede ingresar");
		return quantitat;
	}

	public double retirar(double quantitat) {
		double cantidad = 0;
		System.out.println("Escribe una cantidad a retirar: ");
		Scanner lector = new Scanner(System.in);
		cantidad = lector.nextDouble();
		if ((quantitat - cantidad) > 0 == true) {
			quantitat = quantitat - cantidad;
			System.out.println("La operación tuvo éxito");
			return quantitat;
		}
		System.out.println("La cantidad no se puede retirar");
		return quantitat;
	}

	// GETTERS Y SETTERS
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getQuantitat() {
		return quantitat;
	}

	public void setQuantitat(double quantitat) {
		this.quantitat = quantitat;
	}

	@Override
	public String toString() {
		return "Compte [titular=" + titular + ", quantitat=" + quantitat + "]";
	}
}
