/*
package prueba_array;

import java.util.ArrayList;
import java.util.Iterator;

import empleados.Empleado;
import empleados.Neteja;

public class ArrayLists {

	// Creamos la ArrayList
	ArrayList<Empleado> v=new ArrayList<Empleado>();
	// Creamos la variable emp que serán los empleados
	Empleado emp=new Neteja("Juanjo", "Barcelona", "Cornellà");
	// Añadimos al empleado
	v.add(emp);
	// Otras formas de añadir empleados 
	v.add(new Neteja("Pol", "Castellon", "Alicante"));
	emp=new Neteja("Carlos", "Tarragona", "Reus");
	v.add(emp);

	// Si queremos eliminar un elemento de la arraylist hay que hacerlo con un for
	int i=0;
	for (i=0; i<v.size(); i++) {
		// Aqui hacemos la criba y hacemos lo siguiente:
		// Obtenemos el elemento de la ArrayList -> Obtenemos su ciudad -> Comparamos con la String
		if (v.get(i).getCiutat()=="Barcelona") {
			// Eliminamos el elemento de la ArrayList
			v.remove(i);
		}
	}
	
	// Este sería un for in en Python, llamado aqui "For each". No se pueden eliminar elementos de una ArrayList
	for (Empleado p:v) {
		System.out.println(p);
	}
	
	// Usando la ArrayList de antes, creamos el iterador
	Iterator<Empleado> iterador=v.iterator();
	while(iterador.hasNext()) {
		System.out.println(iterador.next());
	}
	
	// Le decimos que mientras tenga algún elemento, haga alguna cosa
	while(iterador.hasNext()) {
		// Pasamos el elemento de la Array en la variable "a" y la imprimimos
		String a=iterador.next();
		System.out.println(a);
		
	}
	
	
	
	
	
	
	
	
}
*/