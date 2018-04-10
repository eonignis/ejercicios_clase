package empresa_agroalimentaria;

import java.util.ArrayList;

public class testHerencia {
	public static void main(String[] args) {
		ArrayList<Producte> ListaCompra=new ArrayList<Producte>();
		// Las fechas son en: Día-Mes-Año.
		// Creamos el producto.
		Producte fresco1=new Producte_Fresc("20-02-2018", "01-01-2018", "Alemania", 11);
		// Lo añadimos a la Array.
		ListaCompra.add(fresco1);
		
		// Y a repetir el proceso con el resto de productos.
		Producte fresco2=new Producte_Fresc("16-02-2018", "01-01-2018", "Alemania", 19);
		ListaCompra.add(fresco2);
		
		Producte refrigerat1=new Producte_Refrigerat("02-10-2018", "01-01-2018", "Portugal", 46, 8, -10);
		ListaCompra.add(refrigerat1);
		
		ListaCompra.add(new Congelat_Aire("06-03-2018", "01-01-2018", "Estonia", 97, -20, 47.6, 61.7, 13.1, 63.9));
		ListaCompra.add(new Congelat_Aigua("06-03-2018", "01-01-2018", "Estonia", 97, -6, 16.6));

		
		for (Producte p:ListaCompra) {
			System.out.println(p);
		}
		
		
	}

}
