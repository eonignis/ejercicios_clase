package empleados;

public class Neteja extends Empleado {

	public static final float SALARI_FIXE = 35;

	public Neteja(String nom, String ciutat, String lloc) {
		super(nom, ciutat, lloc);
	}

	@Override
	public float salariDiari() {
		return Neteja.SALARI_FIXE;
	}

}
