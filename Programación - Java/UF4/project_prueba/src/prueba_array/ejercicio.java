package prueba_array;

import java.util.Scanner;

public class ejercicio {
	private static final int NUM_VALORS = 10;

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escriu " + NUM_VALORS + " enters. Es pot fer en diferents línies.");
		// Es llegeixen exactament NUM_VALORS valors.
		int numValorsLlegits = 0;
		int[] vector = new int[10];
		while (numValorsLlegits < NUM_VALORS) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			if (lector.hasNextInt()) {
				// hasNextInt devuelve un bool (true o false)
				vector[numValorsLlegits] = lector.nextInt();
				System.out.println("Valor " + numValorsLlegits + " llegit:" + vector[numValorsLlegits]);
				numValorsLlegits++;
			} else {
				// Si el valor no és enter, es llegeix però s'ignora.
				// No s'avança tampoc el comptador.
				lector.next();
			}
		}
		// Els valors que sobrin a la darrera línia escrita es descarten.
		lector.nextLine();
		int j = 0;
		for (j = 0; j < vector.length; j++) {
			System.out.println("Valor de posicion " + j + "es " + vector[j]);
		}
		System.out.println("Ja s'han llegit " + NUM_VALORS + "valors.");
	}
}