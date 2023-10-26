package src.ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

public class TestCheckCapicua {

	public static void main(String[] args) {
		// Solicitar un número por teclado
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = scanner.nextInt();

		// Verificar si es capicúa
		if (esCapicua(numero)) {
			System.out.println("El número es capicúa.");
		} else {
			System.out.println("El número no es capicúa.");
		}
		scanner.close();
	}

	// Método para comprobar si un número es capicúa
	private static boolean esCapicua(int numero) {
		boolean capicua = true;
		// Convertir el número a una cadena
		String numeroStr = String.valueOf(numero);

		// Obtener la longitud de la cadena
		int longitud = numeroStr.length();

		// Comprobar si es capicúa comparando caracteres desde los extremos hacia el
		// centro
		for (int i = 0; i < (longitud / 2); i++) {
			if (numeroStr.charAt(i) != numeroStr.charAt(longitud - 1 - i)) {
				capicua = false; // No es capicúa
			}
		}

		return capicua; // Es capicúa
	}
}
