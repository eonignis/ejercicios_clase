package figuras;

public class Circulo extends Figura2D {
	private double radio;
	
	public Circulo(String nombre, int grosorBorde, int color, double radio) {
		super(nombre, grosorBorde, color);
		this.radio=radio;
	}
	
	public double cambiarTamanyo(double radio) {
		return Math.PI * radio * radio;
	}

	@Override
	public void dibujar() {
		
	}

	@Override
	public int calcularArea() {
		return 0;
	}

	@Override
	public int calcularPerimetro() {
		return 0;
	}



}