package tryCatch;

public class Exemple1 {
	public static void main(String[] args) {
		try {
			int s=4/0;
			System.out.println("El programa continua");
		} catch (ArithmeticException e) {
			System.out.println("Divisió entre zero");
		} catch (Exception e) {
			System.out.println("Error general loco");
			
		} finally {
			System.out.println("Final del main");
		}
	}

}
