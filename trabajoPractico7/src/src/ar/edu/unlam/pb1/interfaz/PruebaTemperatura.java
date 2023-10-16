package src.ar.edu.unlam.pb1.interfaz;

import src.ar.edu.unlam.pb1.dominio.Temperatura;
import java.util.Scanner;

public class PruebaTemperatura {
	private static Scanner teclado = new Scanner(System.in);
	private static Temperatura termostato = new Temperatura(0);

	public static void main(String[] args) {
		int opcion = 0;
		do {
			menu();
			opcion = ingresarEnteroConMensaje(null);
			switch (opcion) {
			case 1:
				ingresarValorTemperatura();
				break;
			case 2:
				ingresarValorYPasarloAOtraTemperatura();
				break;
			case 3:
				convertirValorTemperatura();
				break;
			case 4:
				mostrarValorTemperatura();
				break;
			case 5:
				mostrarNombreTemperatura();
				break;
			case 6:
				mensajeSalir();
				break;
			}
		} while (opcion != 5);
		teclado.close();
	}

	private static void ingresarValorTemperatura() {
		int opcionTemperatura = 0;
		opcionTemperatura = ingresarEnteroConMensaje("Ingresa un valor de temperatura");
		termostato.setValor(opcionTemperatura);
	}

	private static void ingresarValorYPasarloAOtraTemperatura() {
		int opcionTemperatura = 0;
		int unidadElegida = 0;
		opcionTemperatura = ingresarEnteroConMensaje("Ingresa un valor de temperatura");
		unidadElegida = ingresarEnteroConMensaje("Ingresa un valor de temperatura");
		termostato.setValor(opcionTemperatura, (byte) unidadElegida);
	}

	private static void convertirValorTemperatura() {
		int conversion = 0;
		menuConversion();
		conversion = ingresarEnteroConMensaje("Ingresa el valor que quiere elegir");
		termostato.convertir((byte) conversion);
	}

	private static void mostrarValorTemperatura() {
		mostrarMensaje("" + termostato.getValor());
	}

	private static void mostrarNombreTemperatura() {
		mostrarMensaje("" + termostato.enQueTemperatura());
	}

	private static void menuConversion() {
		mostrarMensaje("Opciones de conversion");
		mostrarMensaje("1. Celsius");
		mostrarMensaje("2. Farenheit");
		mostrarMensaje("3. Kelvin");
	}

	private static void menu() {
		mostrarMensaje("Toda temperatura al iniciar esta en celsius");
		mostrarMensaje("1. Darle valor de la temperatura");
		mostrarMensaje("2. Darle el valor y pasalo a otra temperatura");
		mostrarMensaje("3. convertir el valor de la temperatura");
		mostrarMensaje("4. Mostrar el valor de la temperatura");
		mostrarMensaje("5. Mostrar nombre de la temperatura");
		mostrarMensaje("6. Salir del menu");
	}

	private static void mensajeSalir() {
		mostrarMensaje("Salio del menu");
	}

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
