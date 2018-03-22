package figuras;

public abstract class Figura2D extends Figuras {
	public Figura2D(String nombre, int grosorBorde, int color) {
		super(nombre, grosorBorde, color);
	}

	public abstract int calcularArea();
	
	public abstract int calcularPerimetro();
}

