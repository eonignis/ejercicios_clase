package inmobiliaria;

public class Inmueble {
	private String adress;
	private int m2;
	private boolean nou;
	private float precioBase;
	
	public Inmueble() {
		this.nou= true;
		this.precioBase= 1000f;
	}
	
	public Inmueble(String adress, int m2, boolean nou, int precioBase) {
			this.adress = adress;
			this.m2 = m2;
			this.nou = nou;
			this.precioBase = precioBase;
		}


// <=== SETTERS Y GETTERS ===>
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public boolean isNou() {
		return nou;
	}
	public void setNou(boolean nou) {
		this.nou = nou;
	}
	public float getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	
	
}
