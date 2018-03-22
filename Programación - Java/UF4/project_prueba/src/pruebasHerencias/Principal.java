package pruebasHerencias;

public class Principal {

	public static void main(String[] args) {
		Persona[] gentes= new Persona[4];
		Estudiante e= new Estudiante();
		Estudiante e1= new Estudiante("Pol", "Pedron", "333W", "Viudo", "AWS");
		Profesor profe1= new Profesor("Ignacio", "Ramirez", "666W", "Guarro", 1990, 21, "El puto amo xd");
		PersonalServicio limpiador1= new PersonalServicio("Antoñina", "Garamedia", "9999131S", "Casta y pura", 1697, "Hay cuatro jugando");
		
		
		
				
		gentes[0]=e;
		gentes[1]=e1;
		gentes[2]=profe1;
		gentes[3]=limpiador1;
		
		
		
		/*
		for () {
			if [i] instanceof Estudiante {
				System.out.println("Es estudiante");
			}
		}
		*/

		System.out.println(e);
		System.out.println(e1);
		System.out.println(profe1);
		System.out.println(limpiador1);

		

	}

}