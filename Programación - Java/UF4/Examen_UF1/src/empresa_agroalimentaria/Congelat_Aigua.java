package empresa_agroalimentaria;

public class Congelat_Aigua extends Producte_Congelat {
	public double salinitat;

	public Congelat_Aigua(String data_caducitat, String data_envasament, String pais_origen, int numero_lot,
			int temperatura_manteniment, double salinitat) {
		super(data_caducitat, data_envasament, pais_origen, numero_lot, temperatura_manteniment);
		this.salinitat = salinitat;
	}

	@Override
	public int compareTo(Object objeto) {
		Congelat_Aigua temp = (Congelat_Aigua) objeto;
		if (this.numero_lot < temp.numero_lot)
			return -1;
		else if (this.numero_lot > temp.numero_lot)
			return 1;
		return 0;
	}

	// GETTERS Y SETTERS
	public double getSalinitat() {
		return salinitat;
	}

	public void setSalinitat(double salinitat) {
		this.salinitat = salinitat;
	}

	// To String
	@Override
	public String toString() {
		return "Congelat_Aigua [numero de lot=" + numero_lot + ", salinitat=" + salinitat + "gr/l, temperatura_manteniment=" + temperatura_manteniment
				+ ", data_caducitat=" + data_caducitat + ", data_envasament=" + data_envasament + ", pais_origen="
				+ pais_origen + "]";
	}

}
