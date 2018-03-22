package pruebasHerencias;

public class Empleado extends Persona {
	private int yearIncorporacion, numDespacho;
	
	public Empleado() {
		super();
	}

	public Empleado(int yearIncorporacion, int numDespacho) {
		super();
		this.yearIncorporacion = yearIncorporacion;
		this.numDespacho = numDespacho;
	}

	// <=== SETTERS & GETTERS ===>
	public int getYearIncorporacion() {
		return yearIncorporacion;
	}

	public void setYearIncorporacion(int yearIncorporacion) {
		this.yearIncorporacion = yearIncorporacion;
	}

	public int getNumDespacho() {
		return numDespacho;
	}

	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nAño de Incorporación=" + yearIncorporacion + "\nNúmero de Despacho=" + numDespacho;
	}
	

}
