package ar.edu.unlam.pb1.test;

import java.util.Scanner;

public class UsoDeClaseBaseMaths {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("agrega la longuitud");
		int longuitud = teclado.nextInt();
		Contrasenia test = new Contrasenia(longuitud);
		System.out.println(test.getContraseña());
		System.out.println("es fuerte: " + test.esFuerte());
		test.generarPassword();
		System.out.println(test.getContraseña());
		System.out.println("es fuerte: " + test.esFuerte());
	}
}
