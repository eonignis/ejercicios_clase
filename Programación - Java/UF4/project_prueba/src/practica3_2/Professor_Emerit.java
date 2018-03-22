package practica3_2;

public class Professor_Emerit extends Professor {
	private int anysEmerit;
	
	Professor_Emerit(String nom, int edat, int anysConsolidats, int anysEmerit) {
		super(nom, edat, anysConsolidats);
		anysEmerit=this.anysEmerit;
	}
	
	public double obtenirSalariBase() {
		double salariBase = 925 + (anysConsolidats*33.25) + (47.80*anysEmerit);
		return salariBase;
	}
	
	
}
