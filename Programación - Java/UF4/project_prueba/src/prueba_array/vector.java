package prueba_array;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[5];
		float[] vector2 = { 3.3f, 4.7f, 6.7f };
		double[] vector3 = { 3.3, 4.8, 6.9 };

		vector[0] = 7;
		vector[1] = 12;
		vector[2] = 15;
		vector[3] = 9;
		vector[4] = 5123;

		for (int i = 0; i < 5; i++) {
			// System.out.println("L'index de i es:"+ i+". El valor de la posició és: "+
			// vector[i]+" ");
		}

		// System.out.println("La longitud del vector es: "+vector2.length);
		for (int i = 0; i < vector2.length; i++) {
			// System.out.println("L'index de i es: "+i+". El valor de la posició és:
			// "+vector2[i]+" ");
		}

		int j = 0;
		while (j < vector3.length) {
			// System.out.println("L'index de j es: "+j+". El valor de la posició és:
			// "+vector3[j]+" ");
			j++;
		}

		double suma;
		suma = vector3[0] + vector[2];
		System.out.println("Suma de posicions 0 y 2 es: " + suma);

	}

}
