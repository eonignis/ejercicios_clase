package empresa_agroalimentaria;

public class Producte_Fresc extends Producte {
	public Producte_Fresc(String data_caducitat, String data_envasament, String pais_origen, int numero_lot) {
		super(data_caducitat, data_envasament, pais_origen, numero_lot);
	}

	@Override
	public int compareTo(Object objeto) {
		Producte_Fresc temp = (Producte_Fresc) objeto;
		if (this.numero_lot < temp.numero_lot)
			return -1;
		else if (this.numero_lot > temp.numero_lot)
			return 1;
		return 0;
	}

	// To String
	@Override
	public String toString() {
		return "Producte_Fresc [numero de lot=" + numero_lot + ", data_caducitat=" + data_caducitat + ", data_envasament=" + data_envasament
				+ ", pais_origen=" + pais_origen + "]";
	}

}
