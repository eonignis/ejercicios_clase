package empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomina {
	Scanner lector = new Scanner(System.in);
	ArrayList<Empleado> v = new ArrayList<Empleado>();

	Nomina() {

	}

	// Añadir empleados
	public void insereixEmpelat(Empleado emp) {
		v.add(emp);
	}

	public void eliminaNeteja() {
		int i = 0;
		for (i = 0; i < v.size(); i++) {
			if (v.get(i) instanceof Caixer == true) {
				v.remove(i);
			}
		}
	}

	public int quantsCornella() {
		int cornellanincos = 0, i = 0;
		for (i = 0; i < v.size(); i++) {
			if (v.get(i).getCiutat() == "Barcelona") {
				cornellanincos++;
			}
		}
		return cornellanincos;
	}

	public double costNomina() {
		double suma = 0;
		for (Empleado p : v) {
			suma = suma + p.salariDiari();
		}
		return suma;
	}

	public int quantitatCaixers() {
		int p = 0, i = 0;
		for (p = 0; p < v.size(); p++) {
			if (v.get(p) instanceof Caixer == true) {
				i++;
			}
		}
		return i;
	}

	public double souPromig() {
		double promig = 0;
		promig = costNomina() / v.size();
		return promig;
	}
}