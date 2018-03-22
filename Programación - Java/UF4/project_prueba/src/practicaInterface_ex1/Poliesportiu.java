package practicaInterface_ex1;

public class Poliesportiu extends Edifici implements InstalacioEsportiva {
	String nom;
	double superficie;

	public Poliesportiu() {
		super();

	}

	public Poliesportiu(String nom, int superficie) {
		this.nom=nom;
		this.superficie=superficie;
	}

	@Override
	public String toString() {
		return "Poliesportiu [nom=" + nom + ", superficie=" + superficie + "]";
	}

	@Override
	public int getTipusDeInstalacio() {
		System.out.println("Ya tenemos el tipo de instalacion!");
		return 0;
	}

	@Override
	public double getSuperficieEdifici() {
		System.out.println("A tomar esa superificie loco");
		return 0;
	}

}
