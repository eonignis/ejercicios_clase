package pruebasHerencias;

public class PersonalServicio extends Empleado{
	private String seccion;
	
	public PersonalServicio() {
		super();
	}

	public PersonalServicio(String nom, String cognom, String dni, String estado_civil, int yearIncorporacion, String seccion) {
		super();
		this.seccion = seccion;
	}

	// <=== SETTERS & GETTERS ===>
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nSección=" + seccion;
	}
	
	
}
