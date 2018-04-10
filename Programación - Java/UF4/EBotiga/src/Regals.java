import com.ies.botigatools.*;

public class Regals {
	public static void main(String[] args) {
		Aparador magatzem=new Aparador();
		magatzem.addArticle("1", "SABATES", "99.99", "350");
		magatzem.addArticle("2", "BOSSA ESPORTIVA", " 51.03", "123");
		magatzem.addArticle("3", "DESSUADORA", "120.36", "500");
		magatzem.addArticle("4", "CAMISETA", "36.25", "40");
		magatzem.sort();
		
		for (int i=0; i<magatzem.getSize();i++) {
			Articles mostrar = (Articles) magatzem.getArticle(i);
			System.out.println("\nArticles ID: " + mostrar.getId() + " \nNom: " + mostrar.getNom() + " \nPreu Detall: "
					+ mostrar.getDetall() + " €" + "\nPreu: " + mostrar.getPreu() + " €" + " \nQuantitat: "
					+ mostrar.getQuantitat());
		}
	}

}
