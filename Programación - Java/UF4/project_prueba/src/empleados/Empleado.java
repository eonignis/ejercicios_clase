package empleados;

public abstract class Empleado {
	protected String nom;
	protected String ciutat;
	protected String lloc;

	public Empleado(String nom, String ciutat, String lloc) {
		this.nom = nom;
		this.ciutat = ciutat;
		this.lloc = lloc;
	}

	public void lloc(String lloc) {
		System.out.println("El lloc és: " + getLloc());
	}

	public void ciutat(String ciutat) {
		System.out.println("La ciutat és: " + getCiutat());
	}

	public abstract float salariDiari();

	@Override
	public String toString() {
		return "Empleado [nom=" + nom + ", ciutat=" + ciutat + ", lloc=" + lloc + "]";
	}

	// GETTERS Y SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCiutat() {
		return ciutat;
	}

	public void setCiutat(String ciutat) {
		this.ciutat = ciutat;
	}

	public String getLloc() {
		return lloc;
	}

	public void setLloc(String lloc) {
		this.lloc = lloc;
	}

}
