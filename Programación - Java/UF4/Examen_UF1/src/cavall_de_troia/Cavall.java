package cavall_de_troia;

public class Cavall implements PotMuntar {
	public static int capacitat = 2;
	public int ocupacio;
	public Guerrer ocupant;
	
	
	public Cavall(Guerrer warrior) {
		if (warrior instanceof Grec && ocupacio < capacitat) {
			ocupacio++;
			ocupant = warrior;
		}
		ocupacio = 0;
	}


	@Override
	public int muntar(Guerrer g) {
		System.out.println("S'ha muntat un guerrer.");
		if (g instanceof Troia) {
			return -2;
		}
		if (ocupacio == capacitat) {
			return -1;
		}
		return ocupacio;
	}


	@Override
	public void desmuntar() {
		System.out.println("S'han desmuntat tots els guerrers.");
		ocupacio = 0;
	}
	
}
