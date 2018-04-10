package cavall_de_troia;

public class Troia extends Guerrer{
	public Troia() {
		super();
	}

	public Troia(String nom, int edat, int fuerza) {
		super(nom, edat, fuerza);
	}

	@Override
	boolean retirarse() {
		System.out.println("No se puede retirar.");
		return false;
	}

}
