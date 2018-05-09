package tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExempleThrow {
	static void Imprimeix(BufferedReader bf) throws IOException {
		String n = bf.readLine();
	}
	
	public static void main(String[] args) {
		System.out.println("HOLA");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		try {
			Imprimeix(b);
		} catch (IOException e) {
			System.out.println("Error de lectura");
		}
	}

}
