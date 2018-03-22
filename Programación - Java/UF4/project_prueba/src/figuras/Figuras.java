package figuras;

public abstract class Figuras {
	protected String nombre;
	protected int grosorBorde;
	protected int color;
	
	
	public Figuras(String nombre, int grosorBorde, int color) {
		this.nombre=nombre;
		this.grosorBorde=grosorBorde;
		this.color=color;
	}
	public abstract void dibujar();

}
