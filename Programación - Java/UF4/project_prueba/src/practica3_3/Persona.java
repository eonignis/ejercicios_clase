package practica3_3;

import java.util.Scanner;

import java.lang.Math;

public class Persona {
	private String nom = getNom();
	private int edat = 0;
	private String DNI;
	private String sexe;
	private double pes = 0, altura = 0;

	public Persona() {
		this.DNI=generarDNI();
		calcularIMC();
	}

	public Persona(String nom, int edat, String sexe) {
		this.nom=nom;
		this.edat=edat;
		this.sexe=setSexe(sexe);
		this.DNI=generarDNI();
		calcularIMC();
	}

	public Persona(String nom, int edat, String sexe, double pes, double altura) {
		this.nom=nom;
		this.edat=edat;
		this.sexe=setSexe(sexe);
		this.pes=pes;
		this.altura=altura;
		this.DNI=generarDNI();
		calcularIMC();
	}

	public double calcularIMC() {
		int calculador;
		double pesIdeal = (pes / Math.pow(pes, 2));
		if (pesIdeal < 20) {
			calculador = -1;
			System.out.println("La persona està per sota del IMC");
			return calculador;
		} else if (pesIdeal > 20 && pesIdeal < 25) {
			calculador = 0;
			System.out.println("La persona està en el seu pes ideal");
			return calculador;
		} else {
			calculador = 1;
			System.out.println("La persona està per sobre del IMC.");
			return calculador;
		}

	}

	public boolean esMajorEdat() {
		if (edat > 18) {
			System.out.println("La persona és major d'edat");
			return true;
		} else {
			System.out.println("La persona NO és major d'edat");
			return false;
		}
	}

	// GETTERS Y SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getDNI() {
		return DNI;
	}

	private String generarDNI() {
		double primal = Math.random();
		primal = primal * 99999999;
		int posterior = (int) primal;
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = juegoCaracteres.charAt(posterior % 23);
		String dienai = String.format("%08d", posterior) + letra;
		this.DNI = dienai;
		return DNI;
		

	}

	public String getSexe() {
		return sexe;
	}

	public String setSexe(String sexe) {
		System.out.println("Introduce el sexo (H para hombre, M para mujer): ");
		Scanner lector = new Scanner(System.in);
		String sexe1 = lector.nextLine();
		if (sexe1.equalsIgnoreCase("H") || sexe1.equalsIgnoreCase("M")) {
			return this.sexe = sexe1;
		}
		else {
			return this.sexe="H";
		}

	}

	public double getPes() {
		return pes;
	}

	public void setPes(double pes) {
		this.pes = pes;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", edat=" + edat + ", DNI=" + DNI + ", sexe=" + sexe + ", pes=" + pes
				+ ", altura=" + altura + "]";
	}

}
