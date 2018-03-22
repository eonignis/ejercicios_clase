package practicaInterface_ex1;

import java.util.ArrayList;
import java.util.Iterator;



public class Main {

	public static void main(String[] args) {
		ArrayList<Edifici> Arrayalista=new ArrayList<Edifici>();
		Poliesportiu poli1=new Poliesportiu("Random1", 2530);
		Arrayalista.add(poli1);
		Poliesportiu poli2=new Poliesportiu("Random2", 230);
		Arrayalista.add(poli2);
		Poliesportiu poli3=new Poliesportiu("Random3", 250);
		Arrayalista.add(poli3);
		Oficina ofi1=new Oficina(3);
		Arrayalista.add(ofi1);
		Oficina ofi2=new Oficina(6);
		Arrayalista.add(ofi2);
		
		Iterator<Edifici> iterador=Arrayalista.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getSuperficieEdifici());
		}
		
	}

}
