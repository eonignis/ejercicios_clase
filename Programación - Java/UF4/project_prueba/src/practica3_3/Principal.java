package practica3_3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String nom = "Laureau";
		String sexe = "M";
		int edat = 98;
		double pes = 72.56;
		double altura = 84;

		Persona p = new Persona(nom, edat, "M", pes, altura);
		System.out.println(p);
		Persona ppl = new Persona("Emilzy", 20, "M");
		System.out.println(ppl);
		Persona pers = new Persona();

		System.out.println("Introduce el nombre: ");
		nom = lector.nextLine();
		pers.setNom(nom);

		System.out.println("Introduce la edad: ");
		edat = lector.nextInt();
		pers.setEdat(edat);

		sexe = null;
		pers.setSexe(sexe);

		System.out.println("Introduce el peso: ");
		pes = lector.nextDouble();
		pers.setPes(pes);

		System.out.println("Introduce la altura: ");
		altura = lector.nextDouble();
		pers.setAltura(altura);

		System.out.println(pers);

	}

}
