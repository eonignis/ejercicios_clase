package empleados;

public class Mostrador extends Empleado {
	private float ventas;
	public static final float PRECIO_BASE = 50f;

	public Mostrador(String nom, String ciutat, String lloc, int ventas) {
		super(nom, ciutat, lloc);
		this.ventas = ventas;
	}

	@Override
	public float salariDiari() {
		return (float) (Mostrador.PRECIO_BASE + (ventas * 0.15));
	}

	// SETTERS Y GETTERS
	public float getVentas() {
		return ventas;
	}

	public void setVentas(float ventas) {
		this.ventas = ventas;
	}

}
