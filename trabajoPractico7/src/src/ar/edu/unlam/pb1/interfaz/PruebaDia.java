package src.ar.edu.unlam.pb1.interfaz;

import src.ar.edu.unlam.pb1.dominio.Dia;
import java.util.Scanner;

public class PruebaDia {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Dia dia = new Dia();
		int opcion = 0;
		int opcionDeDia = 0;
		do {
			menu();
			opcion = ingresarEnteroConMensaje("");
			switch (opcion) {
			case 1:
				opcionDeDia = ingresarEnteroConMensaje("ingrese un numero de dia");
				mostrarMensaje("dia de la semana: " + dia.dias(opcionDeDia));
				break;
			case 2:
				mensajeSalir();
				break;
			}
		} while (opcion != 2);
		teclado.close();
	}

	private static void menu() {
		mostrarMensaje("1. Elegir un numero para verificar si es un dia?");
		mostrarMensaje("2. Salir del menu");
	}

	private static void mensajeSalir() {
		mostrarMensaje("Salio del menu");
	}

	/*
	 * private static String mensaje() { return teclado.next(); }
	 */

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
