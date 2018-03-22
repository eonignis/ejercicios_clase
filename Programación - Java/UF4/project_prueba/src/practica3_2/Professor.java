package practica3_2;

public class Professor {
	String nom;
	int edat;
	int anysConsolidats;
	
	Professor(String nom, int edat, int anysConsolidats) {
		nom=this.nom;
		edat=this.edat;
		anysConsolidats=this.anysConsolidats;		
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

	public int getAnysConsolidats() {
		return anysConsolidats;
	}

	public void setAnysConsolidats(int anysConsolidats) {
		this.anysConsolidats = anysConsolidats;
	}

	@Override
	public String toString() {
		return "Professor [nom=" + nom + ", edat=" + edat + ", anysConsolidats=" + anysConsolidats + "]";
	}
	
	
}
