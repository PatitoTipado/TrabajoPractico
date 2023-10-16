package src.ar.edu.unlam.pb1.interfaz;

import src.ar.edu.unlam.pb1.dominio.Letra;
import java.util.Scanner;

public class PruebaLetra {
	private static Scanner teclado = new Scanner(System.in);
	private static Letra vocal = new Letra();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		do {
			menu();
			opcion = ingresarEnteroConMensaje("");
			switch (opcion) {
			case 1:
				verificarSiEsVocal();
				break;
			case 2:
				menuSalir();
				break;
			default:
				break;
			}
		} while (opcion != 2);
	}

	private static void verificarSiEsVocal() {
		char letra = 0;
		mostrarMensaje("ingrese una vocal");
		letra = teclado.next().charAt(0);
		mostrarMensaje("es vocal?: " + vocal.esVocal(letra));
	}

	private static void menu() {
		mostrarMensaje("1. Elegir una letra para verificar si es vocal?");
		mostrarMensaje("2. Salir del menu");
	}
	private static void menuSalir() {
		mostrarMensaje("Salio del menu");
	}
	/*private static String mensaje() {
		return teclado.next();
	}*/

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	private static void mostrarMensajeError(String mensaje) {
		System.err.println(mensaje);
	}

	private static int ingresarEnteroConMensaje(String mensaje) {
		mostrarMensaje(mensaje);
		while (!teclado.hasNextInt()) {
			mostrarMensaje(mensaje);
			mostrarMensajeError("Ingrese un numero entero");
			teclado.nextLine();
		}
		return teclado.nextInt();
	}
}
