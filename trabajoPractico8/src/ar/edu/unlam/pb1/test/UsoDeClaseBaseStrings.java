package ar.edu.unlam.pb1.test;

import java.util.Scanner;

public class UsoDeClaseBaseStrings {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		boolean veridico = false;
		do {
			System.out.println("ingrese un correo veridico");
			String correoElectronico = teclado.next();
			veridico = Correo.verificarCorreo(correoElectronico);
			System.out.println("es veridico :" + veridico);
		} while (!veridico);
	}
}
