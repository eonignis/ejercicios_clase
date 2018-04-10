package cavall_de_troia;

public abstract class Guerrer {
	private String nom;
	private int edat, fuerza;
	private boolean ferit;
	private boolean mort;

	
	// Comprueba edad. Si no entra en el rango indicado, devuelve false. Si lo hace, devuelve true
	boolean comprobarEdat (int i) {
		if (i >= 15 && i <= 60) {
			return true;
		}
		return false;
	}
	
	// Comprueba fuerza. Si no entra en el rango indicado, devuelve false. Si lo hace, devuelve true
	boolean comprobarFuerza (int f) {
		if (f >= 1 && f <= 10) {
			return true;
		}
		return false;
	}
		
	// Constructor que pasas nombre, edad y fuerza. Crea los atributos ferit y mort por defecto.
	public Guerrer(String nom, int edat, int fuerza) {
		this.nom = nom;
		this.edat = edat;
		this.fuerza = fuerza;
		ferit = false;
		mort = false;
	}
	
	// Constructor al que no le pasas nada y pone nombre, edad y fuerza por defecto.
	public Guerrer() {
		nom = "guerrerX";
		edat = 15;
		fuerza = 1;
	}
	
	// Constructor copycat
	public Guerrer(Guerrer warrior, String nom) {
		this.nom = nom;
	}
	
	// Método abstracto que las clases hijas pondrán código
	abstract boolean retirarse();
	
	
	// GETTERS Y SETTERS
	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public boolean isFerit() {
		return ferit;
	}

	public void setFerit(boolean ferit) {
		this.ferit = ferit;
	}

	public boolean isMort() {
		return mort;
	}

	public void setMort(boolean mort) {
		this.mort = mort;
	}

}
