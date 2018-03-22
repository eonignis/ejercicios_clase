package empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		Empleado[] listado = new Empleado[100];
		String nom, ciutat, origen;
		int horas = 0, ventas = 0;
		int opcio = 0, cont = 0;
		int i = 0;

		System.out.println("1. Añadir un cajero");
		System.out.println("2. Añadir un netejador");
		System.out.println("3. Añadir un mostrador");
		System.out.println("4. Algo");
		System.out.println("5. Salir");
		System.out.println("Introduce una opción: ");
		opcio = lector.nextInt();

		do {
			switch (opcio) {
			case 1:
				System.out.println("Nom: ");
				nom = lector.next();
				System.out.println("Ciutat: ");
				ciutat = lector.next();
				System.out.println("Origen: ");
				origen = lector.next();
				System.out.println("Hores treballades: ");
				horas = lector.nextInt();
				listado[cont] = new Caixer(nom, ciutat, origen, horas);
				cont++;
				break;
			case 2:
				System.out.println("Nom: ");
				nom = lector.next();
				System.out.println("Ciutat: ");
				ciutat = lector.next();
				System.out.println("Origen: ");
				origen = lector.next();
				listado[cont] = new Neteja(nom, ciutat, origen);
				cont++;
				break;
			case 3:
				System.out.println("Nom: ");
				nom = lector.next();
				System.out.println("Ciutat: ");
				ciutat = lector.next();
				System.out.println("Origen: ");
				origen = lector.next();
				System.out.println("Numero de ventas: ");
				ventas = lector.nextInt();
				listado[cont] = new Mostrador(nom, ciutat, origen, ventas);
				cont++;
				break;
			case 4:
				for (i = 0; i < listado.length; i++) {
					if (listado[i] instanceof Caixer) {
						System.out.println(listado[i]);
						System.out.println("El sueldo es " + listado[i].salariDiari());
					}
				}
				break;
			}
		} while (opcio >= 5);

	}
}
