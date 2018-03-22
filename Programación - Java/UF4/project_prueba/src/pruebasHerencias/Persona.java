package pruebasHerencias;

import java.util.Scanner;

public class Persona {
	private String nom, cognom, dni, estado_civil;
	
	Persona() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Nombre: ");
		this.nom= lector.nextLine();
		System.out.println("Apellido: ");
		this.cognom= lector.nextLine();
		System.out.println("Estado civil: ");
		this.estado_civil= lector.nextLine();
		System.out.println("DNI: ");
		this.dni= lector.nextLine();		
	}
	Persona(String nom, String cognom, String dni, String estado_civil) {
		this.nom=nom;
		this.cognom=cognom;
		this.estado_civil=estado_civil;
		this.dni=dni;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	@Override
	public String toString() {
		return "Nom=" + nom + "\nCognom=" + cognom + "\nEstado_civil=" + estado_civil + "\nDNI=" + dni;
	}
	
	
	
}
