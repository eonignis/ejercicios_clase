package empleados;

public class Caixer extends Empleado {
	private float horesTreballades;
	public static final float PRECIO_HORAS = 15.0f;

	public Caixer(String nom, String ciutat, String lloc, float horesTreballades) {
		super(nom, ciutat, lloc);
		this.horesTreballades = horesTreballades;
	}

	@Override
	public float salariDiari() {
		return Caixer.PRECIO_HORAS * getHoresTreballades();
	}

	@Override
	public String toString() {
		String informacion = super.toString();
		return "Caixer [horesTreballades=" + horesTreballades + "]";
	}

	// SETTERS Y GETTERS
	public float getHoresTreballades() {
		return horesTreballades;
	}

	public void setHoresTreballades(float horesTreballades) {
		this.horesTreballades = horesTreballades;
	}

}
