package ar.edu.unlam.pb1.rewind;

public class PruebaCalculadora {

	public static void main(String[] args) {
		Calculadora casio = new Calculadora();

		System.out.println(casio.factorial(5));
		int facts = 6;
		int resultado = 1;
		for (int i = 1; i <= facts; i++) {
			resultado *= i;
			System.out.println(resultado);
		}
		// ej el value Of, lo que hace es convertir la sig cadena a caracteres
		// int numero = 42;
		// String cadena = String.valueOf(numero);
		// System.out.println(cadena.valueOf(numero));
	}

}
