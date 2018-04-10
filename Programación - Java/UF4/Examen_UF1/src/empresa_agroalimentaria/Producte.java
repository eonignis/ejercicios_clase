package empresa_agroalimentaria;

public abstract class Producte implements Comparable {
	public String data_caducitat;
	public String data_envasament;
	public String pais_origen;
	public int numero_lot;

	// Constructor
	public Producte(String data_caducitat, String data_envasament, String pais_origen, int numero_lot) {
		super();
		this.data_caducitat = data_caducitat;
		this.data_envasament = data_envasament;
		this.pais_origen = pais_origen;
		this.numero_lot = numero_lot;
	}

	// GETTERS Y SETTERS
	public String getData_caducitat() {
		return data_caducitat;
	}

	public void setData_caducitat(String data_caducitat) {
		this.data_caducitat = data_caducitat;
	}

	public String getData_envasament() {
		return data_envasament;
	}

	public void setData_envasament(String data_envasament) {
		this.data_envasament = data_envasament;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}

	public int getNumero_lot() {
		return numero_lot;
	}

	public void setNumero_lot(int numero_lot) {
		this.numero_lot = numero_lot;
	}

}
