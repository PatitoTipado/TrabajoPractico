package ar.edu.unlam.pb1.rewind;

import java.util.Scanner;

public class PruebaCerradura {
	private static Scanner teclado = new Scanner(System.in);
	private static Cerradura candado = new Cerradura(1234, 0);

	public static void main(String[] args) {
		int opcion = 0;
		do {
			menu();
			opcion = ingresarEnteroConMensaje("Ingresa la opcion a elegir");
			switch (opcion) {
			case 1:
				abrirCerradura();
				break;
			case 2:
				cerrarCerradura();
				break;
			case 3:
				verEstadoCerradura();
				break;
			case 4:
				verSiEstaBloqueadaCerradura();
				break;
			case 5:
				verCantidadDeIntentos();
				break;
			case 6:
				menuSalir();
				break;
			}
		} while (opcion != 6);
		teclado.close();
	}

	private static void verCantidadDeIntentos() {
		mostrarMensaje("Cuantos intentos quedan?: " + candado.getCantidadDeFallosRestantes());
	}

	private static void verSiEstaBloqueadaCerradura() {
		mostrarMensaje("esta bloqueada?: " + candado.fueBloqueada());
	}

	private static void verEstadoCerradura() {
		mostrarMensaje("esta abierto? " + candado.estadoCerradura());
	}

	private static void cerrarCerradura() {
		if (candado.estadoCerradura() && !candado.fueBloqueada()) {
			candado.cerrar();
		}
		mostrarMensaje("fue cerrada: " + candado.estadoCerradura());
	}

	private static void abrirCerradura() {
		if (!candado.estadoCerradura()) {
			System.out.println("ingrese la clave");
			int num = teclado.nextInt();
			candado.abrir(num);
		}
		mostrarMensaje("esta abierto? " + candado.estadoCerradura());
		mostrarMensaje("esta bloqueado? " + candado.fueBloqueada());
	}

	private static void menu() {
		mostrarMensaje("1. abrir cerradura");
		mostrarMensaje("2. cerrar cerradura");
		mostrarMensaje("3. verificar si esta abierta");
		mostrarMensaje("4. verificar si fue bloqueda");
		mostrarMensaje("5. ver cantidad de fallos");
		mostrarMensaje("6. Salir del menu");

	}

	private static void menuSalir() {
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
