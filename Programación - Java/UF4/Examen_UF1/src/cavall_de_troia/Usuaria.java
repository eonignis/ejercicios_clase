package cavall_de_troia;

public class Usuaria {
	public static void main(String[] args) {
		Grec Ulises= new Grec("Ulises", 18, 3);
		Troia Paris= new Troia("Paris", 17, 2);
		Cavall Sleipnir= new Cavall(Ulises);
		Sleipnir.muntar(Ulises);
	}
}
