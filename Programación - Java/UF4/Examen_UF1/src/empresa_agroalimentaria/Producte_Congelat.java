package empresa_agroalimentaria;

public abstract class Producte_Congelat extends Producte {
	public int temperatura_manteniment;

	public Producte_Congelat(String data_caducitat, String data_envasament, String pais_origen, int numero_lot,
			int temperatura_manteniment) {
		super(data_caducitat, data_envasament, pais_origen, numero_lot);
		this.temperatura_manteniment = temperatura_manteniment;
	}

	// GETTERS Y SETTERS
	public int getTemperatura_manteniment() {
		return temperatura_manteniment;
	}

	public void setTemperatura_manteniment(int temperatura_manteniment) {
		this.temperatura_manteniment = temperatura_manteniment;
	}
}
