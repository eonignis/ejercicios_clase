package empresa_agroalimentaria;

public class Producte_Refrigerat extends Producte{
	public int codi_organisme;
	public int temperatura_recomenada;

	// Constructor
	public Producte_Refrigerat(String data_caducitat, String data_envasament, String pais_origen, int numero_lot, int codi_organisme, int temperatura_recomenada) {
		super(data_caducitat, data_envasament, pais_origen, numero_lot);
		this.codi_organisme = codi_organisme;
		this.temperatura_recomenada = temperatura_recomenada;
	}

	@Override
	public int compareTo(Object objeto) {
		Producte_Refrigerat temp = (Producte_Refrigerat) objeto;
		if (this.numero_lot < temp.numero_lot)
			return -1;
		else if (this.numero_lot > temp.numero_lot)
			return 1;
		return 0;
	}
	

	// GETTERS Y SETTERS
	public int getCodi_organisme() {
		return codi_organisme;
	}

	public void setCodi_organisme(int codi_organisme) {
		this.codi_organisme = codi_organisme;
	}

	public int getTemperatura_recomenada() {
		return temperatura_recomenada;
	}

	public void setTemperatura_recomenada(int temperatura_recomenada) {
		this.temperatura_recomenada = temperatura_recomenada;
	}
	
	// To String
	@Override
	public String toString() {
		return "Producte_Refrigerat [numero de lot=" + numero_lot + ", codi_organisme=" + codi_organisme + ", temperatura_recomenada="
				+ temperatura_recomenada + ", data_caducitat=" + data_caducitat + ", data_envasament=" + data_envasament
				+ ", pais_origen=" + pais_origen + "]";
	}

}
