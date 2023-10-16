package ar.edu.unlam.pb1.rewind;

import java.util.Scanner;

public class PruebaEstadisticasDePersonas {
	private static Persona persona = null;
	private static Scanner teclado = new Scanner(System.in);
	// private static Scanner teclado1 = new Scanner(System.in);

	public static void main(String[] args) {

		int cantidadEncuestas = ingresarEnteroConMensaje("¿Cuantas encuestas quiere realizar?");
		encuestasRealizar(cantidadEncuestas);
	}

	private static void encuestasRealizar(int vueltas) {
		for (int i = 0; i < vueltas; i++) {
			encuestas();
		}
	}

	private static void encuestas() {
		boolean salir = false;
		// contadores
		int contadorPesoPromedio = 0;
		int contadorSobrePeso = 0;
		int contadorBajoPeso = 0;
		int contadorPesoNormal = 0;
		int cantidadDePersonas = 0;
		double contadorEdadPromedio = 0;
		// promedios
		double edadPromedioEncuesta = 0;
		double pesoPromedioEncuesta = 0;
		double promedioEdadDePersonasBajoPeso = 0;
		double promedioEdadDePersonasSobrePeso = 0;
		double promedioEdadDePersonasPesoNormal = 0;
		do {
			persona = cargarDatos();
			contadorPesoPromedio += persona.pesar();
			contadorEdadPromedio += persona.getEdad();
			cantidadDePersonas++;
			if (persona.bajoPeso(persona)) {
				contadorBajoPeso++;
				promedioEdadDePersonasBajoPeso += persona.getEdad();
				contadorBajoPeso++;
			} else if (persona.normalPeso(persona)) {
				promedioEdadDePersonasPesoNormal += persona.getEdad();
				contadorPesoNormal++;
				contadorPesoNormal++;
			} else if (persona.sobrePeso(persona)) {
				promedioEdadDePersonasSobrePeso += persona.getEdad();
				contadorSobrePeso++;
				contadorSobrePeso++;
			}
			if (deseaSalir()) {
				salir = true;
			}
		} while (!salir);
		edadPromedioEncuesta = calcularEdadPromedio(contadorEdadPromedio, cantidadDePersonas);
		resultadosEncuestaPeso(pesoPromedioEncuesta, contadorBajoPeso, contadorSobrePeso, contadorPesoNormal,
				cantidadDePersonas, contadorPesoPromedio);
		promedioEdadDePersonasSobrePeso /= contadorSobrePeso;
		promedioEdadDePersonasPesoNormal /= contadorPesoNormal;
		promedioEdadDePersonasBajoPeso /= contadorBajoPeso;
		resultadosEncuestaEdad(edadPromedioEncuesta, promedioEdadDePersonasBajoPeso, promedioEdadDePersonasSobrePeso,
				promedioEdadDePersonasPesoNormal);
	}

	private static double calcularEdadPromedio(double contadorEdadPromedio, double cantidadDePersonas) {
		return contadorEdadPromedio / cantidadDePersonas;
	}

	private static Persona cargarDatos() {
		boolean datosValidos = false;
		// datos a ingresar
		int ingresarPeso = 0;
		int ingresarEdad = 0;
		do {
			menuAdvertencia();
			ingresarPeso = ingresarEnteroConMensaje("Ingrese el peso de la persona");
			ingresarEdad = ingresarEnteroConMensaje("ingrese la edad de la persona");
			datosValidos = Persona.pesoValido(ingresarPeso) && Persona.edadValida(ingresarEdad);
		} while (!datosValidos);
		return persona = new Persona(ingresarPeso, ingresarEdad);
	}

	private static void resultadosEncuestaPeso(double pesoPromedioEncuesta, double contadorBajoPeso,
			double contadorSobrePeso, double contadorPesoNormal, int cantidadPersonas, double contadorPesoPromedio) {
		pesoPromedioEncuesta = contadorPesoPromedio / cantidadPersonas;
		mostrarMensaje("el peso promedio de la encuesta es de: " + pesoPromedioEncuesta);
		mostrarMensaje("La cantidad de personas con bajo peso es de: " + contadorBajoPeso);
		mostrarMensaje("La cantidad de personas con Sobre peso es de: " + contadorSobrePeso);
		mostrarMensaje("La cantidad de personas con peso normal es de: " + contadorPesoNormal);
		mostrarMensaje("---------------------------------------------------------------------");
	}

	private static void resultadosEncuestaEdad(double EdadPromedioEncuesta, double promedioEdadDePersonasBajoPeso,
			double promedioEdadDePersonasSobrePeso, double promedioEdadDePersonasPesoNormal) {
		mostrarMensaje("el peso promedio de la encuesta es de: " + EdadPromedioEncuesta);
		mostrarMensaje("La cantidad de personas con bajo peso es de: " + promedioEdadDePersonasBajoPeso);
		mostrarMensaje("La cantidad de personas con Sobre peso es de: " + promedioEdadDePersonasSobrePeso);
		mostrarMensaje("La cantidad de personas con peso normal es de: " + promedioEdadDePersonasPesoNormal);
		mostrarMensaje("---------------------------------------------------------------------");
	}

	private static boolean deseaSalir() {
		int numero = ingresarEnteroConMensaje(
				"Si desea salir ingrese 0 \nSidesea seguir ingrese cualquier otro numero");
		return numero == 0;
	}

	private static void menuAdvertencia() {
		mostrarMensaje("1. Los valores maximo para peso son de 200kg");
		mostrarMensaje("2. Los valores maximo para edad son de 120 años de edad");
	}

//	private static void mensajeSalir() {
//		mostrarMensaje("Salio del menu");
//	}

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
