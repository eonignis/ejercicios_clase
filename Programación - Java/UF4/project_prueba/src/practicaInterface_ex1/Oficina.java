package practicaInterface_ex1;

public class Oficina extends Edifici {
	public int nombreOficines;

	public Oficina(int nombreOficines) {
		super();
		this.nombreOficines=nombreOficines;
	}

	@Override
	public double getSuperficieEdifici() {
		return 0;
	}

	@Override
	public String toString() {
		return "Oficina [nombreOficines=" + nombreOficines + "]";
	}
	
	

}
