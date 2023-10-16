package src.ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

import src.ar.edu.unlam.pb1.dominio.Distancia;

public class TestDistancia {
	private static Scanner teclado = new Scanner(System.in);
	private static Distancia distancia = new Distancia(0);

	public static void main(String[] args) {
		int opcion = 0;
		do {
			menu();
			opcion = ingresarEnteroConMensaje("");
			switch (opcion) {
			case 1:
				ingresarValorDistancia();
				break;
			case 2:
				ingresarValorYPasarloAOtraDistancia();
				break;
			case 3:
				convertirValorDistancia();
				break;
			case 4:
				mostrarValorDistancia();
				break;
			case 5:
				mostrarNombreDistancia();
				break;
			case 6:
				mensajeSalir();
				break;
			}
		} while (opcion != 5);
		teclado.close();
	}

	private static void ingresarValorDistancia() {
		int opcionTemperatura = 0;
		opcionTemperatura = ingresarEnteroConMensaje("Ingresa un valor de distancia");
		distancia.setValor(opcionTemperatura);
	}

	private static void ingresarValorYPasarloAOtraDistancia() {
		int opcionTemperatura = 0;
		int unidadElegida = 0;
		opcionTemperatura = ingresarEnteroConMensaje("Ingresa un valor de distancia");
		unidadElegida = ingresarEnteroConMensaje("Ingresa un valor de distancia");
		distancia.setValor(opcionTemperatura, (byte) unidadElegida);
	}

	private static void convertirValorDistancia() {
		int conversion = 0;
		menuConversion();
		conversion = ingresarEnteroConMensaje("Ingresa el valor que quiere elegir");
		distancia.convertir((byte) conversion);
	}

	private static void mostrarValorDistancia() {
		mostrarMensaje("el valor de distancia es de: " + distancia.getValor());
	}

	private static void mostrarNombreDistancia() {
		mostrarMensaje("El nombre de la distancia es de: " + distancia.getNombreDistancia());
	}

	private static void menuConversion() {
		mostrarMensaje("Opciones de conversion");
		mostrarMensaje("1. Kilometro");
		mostrarMensaje("2. Hectometro");
		mostrarMensaje("3. Decametro");
	}

	private static void menu() {
		mostrarMensaje("Toda distancia al iniciar esta en Kilometros");
		mostrarMensaje("1. Darle valor a la distancia");
		mostrarMensaje("2. Darle el valor y pasalo a otra distancia");
		mostrarMensaje("3. convertir el valor de la distancia");
		mostrarMensaje("4. Mostrar el valor de la distancia");
		mostrarMensaje("5. Mostrar nombre de la distancia");
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
