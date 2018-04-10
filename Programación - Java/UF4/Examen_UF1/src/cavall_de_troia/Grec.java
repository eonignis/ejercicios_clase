package cavall_de_troia;

public class Grec extends Guerrer{
	public Grec() {
		super();
	}

	public Grec(String nom, int edat, int fuerza) {
		super(nom, edat, fuerza);
	}

	@Override
	boolean retirarse() {
		/*if (Grec.isFerit() == true) {
			return true;
		}*/
		return false;
	}
	
}
