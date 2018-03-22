package conceptos_basicos;

public class Persona {
	// <=== Declaramos los M�todos ===>
	// <--- Hay que declarar los atributos en private, public o protected (mayoria
	// de veces estar� en private) --->
	private String nombre;
	private int edad;
	private int idSoci;

	public Persona() {

	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.setEdad(edad);
	}

	public Persona(String nombre, int edad, int idSoci) {
		this.nombre = nombre;
		this.setEdad(edad);
		this.setIdSoci(idSoci);
	}

	// SETTERS: cambiar el valor
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		if (edad >= 1) {
			this.edad = edad;
		} else {
			System.out.println("Edad no v�lida");
		}
	}

	public void setIdSoci(int id) {
		idSoci = id;
	}

	// GETTERS: obtener el valor
	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public int getIdSoci() {
		return this.idSoci;
	}

	// M�todo para printar los datos de la persona que hemos creado
	public void imprimir() {
		System.out.println("Nom: " + nombre);
		System.out.println("Edad: " + edad);
	}

	/*
	 * El m�todo toString sirve para imprimr por pantalla todos los datos que se
	 * encuentran en la clase. Se crea yendo a "Source > Generate toString()..." y
	 * se crea autom�ticamente un toString que adem�s reemplaza al que te viene por
	 * defecto. Adem�s, utiliza el Override, que es para poder sobreescribir el
	 * m�todo que existia anteriormente (vamos, que es para reemplazarlo por uno
	 * nuevo).
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", idSoci=" + idSoci + "]";
	}

}
