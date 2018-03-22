package pruebasHerencias;

public class Profesor extends Empleado{
	private String despacho;

	public Profesor() {
		super();
	}
	
	public Profesor(String nom, String cognom, String dni, String estado_civil, int yearIncorporacion, int numDespacho, String despacho) {
		super();
		this.despacho = despacho;
	}
	
	// <=== SETTERS & GETTERS ===>
	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nDespacho=" + despacho;
	}
	
}
