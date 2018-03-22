package pruebasHerencias;

import java.util.Scanner;

public class Estudiante extends Persona {
	private String curso;
	
	public Estudiante() {
		super();
		Scanner lector = new Scanner(System.in);
		System.out.println("Curso: ");
		this.curso= lector.nextLine();
	}
	
	public Estudiante(String nom, String cognom, String dni, String ec, String curso) {
		super(nom, cognom, dni, ec);
		this.curso=curso;
		
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCurso=" + curso;
	}
	
}
