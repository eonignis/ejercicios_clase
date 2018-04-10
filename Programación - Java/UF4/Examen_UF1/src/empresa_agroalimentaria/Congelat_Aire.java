package empresa_agroalimentaria;

public class Congelat_Aire extends Producte_Congelat {
	public double nitrogen, oxigen, dioxidCarbono, vaporAigua;

	public Congelat_Aire(String data_caducitat, String data_envasament, String pais_origen, int numero_lot,
			int temperatura_manteniment, double nitrogen, double oxigen, double dioxidCarbono, double vaporAigua) {
		super(data_caducitat, data_envasament, pais_origen, numero_lot, temperatura_manteniment);
		this.nitrogen = nitrogen;
		this.oxigen = oxigen;
		this.dioxidCarbono = dioxidCarbono;
		this.vaporAigua = vaporAigua;
	}

	@Override
	public int compareTo(Object objeto) {
		Congelat_Aire temp = (Congelat_Aire) objeto;
		if (this.numero_lot < temp.numero_lot)
			return -1;
		else if (this.numero_lot > temp.numero_lot)
			return 1;
		return 0;
	}

	// GETTERS Y SETTERS
	public double getNitrogen() {
		return nitrogen;
	}

	public void setNitrogen(double nitrogen) {
		this.nitrogen = nitrogen;
	}

	public double getOxigen() {
		return oxigen;
	}

	public void setOxigen(double oxigen) {
		this.oxigen = oxigen;
	}

	public double getDioxidCarbono() {
		return dioxidCarbono;
	}

	public void setDioxidCarbono(double dioxidCarbono) {
		this.dioxidCarbono = dioxidCarbono;
	}

	public double getVaporAigua() {
		return vaporAigua;
	}

	public void setVaporAigua(double vaporAigua) {
		this.vaporAigua = vaporAigua;
	}

	// To String
	@Override
	public String toString() {
		return "Congelat_Aire [numero de lot=" + numero_lot + ", nitrogen=" + nitrogen + "%, oxigen=" + oxigen + "%, dioxidCarbono=" + dioxidCarbono
				+ "%, vaporAigua=" + vaporAigua + "%, temperatura_manteniment=" + temperatura_manteniment
				+ ", data_caducitat=" + data_caducitat + ", data_envasament=" + data_envasament + ", pais_origen="
				+ pais_origen + "]";
	}

}
