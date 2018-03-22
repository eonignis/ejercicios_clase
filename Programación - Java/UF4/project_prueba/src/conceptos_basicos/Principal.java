package conceptos_basicos;

import java.util.Scanner;

public class Principal {
	// <--- Creamos el método Main (Ctrl+Espacio) --->
	public static void main(String[] args) {
		Persona sandra = new Persona("Sandra", 22, 112233);

		// Creamos un objeto (pepe) de la clase Persona
		Persona jose = new Persona();
		// Le damos al objeto Pepe un nombre y una edad
		jose.setNombre("Jose");
		jose.setEdad(23);
		// Obtenemos los datos de pepe
		String nombre = jose.getNombre();
		int edad = jose.getEdad();

		// Creamos una persona nueva desde cero pidiendo los datos al usuario
		Persona patri = new Persona();
		Scanner lector = new Scanner(System.in);
		System.out.print("Escribe tu nombre: ");
		String name = lector.nextLine();
		System.out.print("Escribe tu edad: ");
		int age = lector.nextInt();
		patri.setNombre(name);
		patri.setEdad(age);

		// Finalmente imprimimos los objetos a ver qué sale
		System.out.print(sandra.toString());
	}

}
