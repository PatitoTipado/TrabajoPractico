package src.ar.edu.unlam.pb1.interfaz;

import src.ar.edu.unlam.pb1.dominio.Ahorcado;
import java.util.Scanner;
import src.ar.edu.unlam.pb1.auxiliar.Persona;

public class TestAhorcado {
	private static Scanner teclado = new Scanner(System.in);
	private static Scanner teclado1 = new Scanner(System.in);
	private static boolean salir = false;
	private static Ahorcado ahorcado;

	// control + shift + 7
	public static void main(String[] args) {
		Persona jugadorCero = new Persona(ingresarStringConMensaje("Ingrese el nombre del jugador cero"));
		Persona jugadorUno = new Persona(ingresarStringConMensaje("Ingrese el nombre del jugador uno"));
		ahorcado = instanciarObjeto();
		agregarJugadores(jugadorCero, jugadorUno);
		int juega = elegirQuienInicia();
		do {
			menu(juega);
			switch (ingresarEnteroConMensaje("Eliga una de las opciones")) {
			case 1:
				ingresarUnaLetra(juega);
				break;
			case 2:
				mostrarArrayDePalabra(juega);
				break;
			case 3:
				mostrarLetrasEquivocadas(juega);
				break;
			case 4:
				arriesgar(juega);
				break;
			case 5:
				salir = deseaSalir();
				break;
			}
			mostrarMensaje(
					"Las vidas de jugador " + juega + " son: " + ahorcado.buscarJugadorPorPosicion(juega).getVidas());
			juega = leTocaAlOtroJugador(juega);
		} while ((Ahorcado.puedoSeguirJugando()) && (!salir));
		mensajeSalir();
	}

	private static void arriesgar(int juega) {
		String palabra = ingresarStringConMensaje("Ingrese la palabra que cree que es: ");
		String palabraOtroJugador;
		if (palabra.equalsIgnoreCase(ahorcado.getPalabraJugador(juega))) {
			mostrarMensaje("el jugador: " + juega + " atino");
			juega = leTocaAlOtroJugador(juega);
			palabraOtroJugador = ingresarStringConMensaje("Ingrese la palabra que cree que es: ");
			boolean ultimoIntento = ahorcado.arriesgar(palabraOtroJugador, juega);
			mostrarMensaje("el jugador: " + juega + " atino");
			if (!ultimoIntento) {
				juega = leTocaAlOtroJugador(juega);
				mostrarMensaje("El ganador es: " + ahorcado.buscarJugadorPorPosicion(juega).getNombre());
			} else if (ultimoIntento) {
				mostrarMensaje("Se resolvio con un empate");
				salir = true;
			}
		} else {
			ahorcado.arriesgar(palabra, juega);
			mostrarMensaje("El ganador es: " + ahorcado.jugadorGanadorPorVidas().getNombre());
			salir = true;
		}

	}

	private static void mostrarLetrasEquivocadas(int juega) {
		mostrarMensaje(ahorcado.getLetrasEquivocadas(juega));
	}

	private static int leTocaAlOtroJugador(int juega) {
		if (juega == 0) {
			juega = 1;
		} else {
			juega = 0;
		}
		return juega;
	}

	private static void ingresarUnaLetra(int juega) {
		mostrarMensaje("Ingrese una letra");
		Character ingresarLetra = teclado1.next().toUpperCase().charAt(0);
		if (ahorcado.buscamosJugadorCero(juega)) {
			if (ahorcado.ingresarLetraDeJugadorCero(ingresarLetra)) {
				mostrarMensaje("la letra es correcta");
			} else {
				ahorcado.letraEquivocada(ingresarLetra, juega);
				mostrarMensaje("la letra es incorrecta");
			}
		} else if (ahorcado.buscamosJugadorUno(juega)) {
			if (ahorcado.ingresarLetraDeJugadorUno(ingresarLetra)) {
				mostrarMensaje("la letra es correcta");
			} else {
				ahorcado.letraEquivocada(ingresarLetra, juega);
				mostrarMensaje("la letra es incorrecta");
			}
		}
	}

	private static void mostrarArrayDePalabra(int juega) {
		if (ahorcado.buscamosJugadorCero(juega)) {
			mostrarMensaje(ahorcado.mostrarArrayDeJugadorCero());
		} else if (ahorcado.buscamosJugadorUno(juega)) {
			mostrarMensaje(ahorcado.mostrarArrayDeJugadorUno());
		}
	}

	private static Ahorcado instanciarObjeto() {
		String palabraJugadorCero = ingresarStringConMensaje("ingrese la palabra para el juegador Cero");
		String palabraJugadorUno = ingresarStringConMensaje("ingrese la palabra para el juegador Uno");
		return ahorcado = new Ahorcado(palabraJugadorCero, palabraJugadorUno);
	}

	private static void agregarJugadores(Persona jugadorCero, Persona jugadorUno) {
		ahorcado.agregarJugador(jugadorCero);
		ahorcado.agregarJugador(jugadorUno);

	}

	private static int elegirQuienInicia() {
		int numero = random();
		if (numero == 0) {
			mostrarMensaje("Inicia el jugador cero");
			return numero;
		} else if (numero == 1) {
			mostrarMensaje("Inicia el jugador uno");
			return numero;
		}
		return numero;
	}

	private static int random() {
		return (int) (Math.random() * 2);
	}

	private static boolean deseaSalir() {
		int numero = ingresarEnteroConMensaje(
				"Si desea salir ingrese 0 \nSi desea seguir ingrese cualquier otro numero");
		return numero == 0;
	}

	private static void menu(int juega) {
		mostrarMensaje("1. Ingresar letra");
		mostrarMensaje("2. mostrar array de palabras");
		mostrarMensaje("3. mostrar letras incorrectas");
		mostrarMensaje("4. Arriesgar");
		mostrarMensaje("5. Salir");
		mostrarMensaje("Le toca jugar al jugador" + juega);
		if (ahorcado.sePuedeMostrarDimension()) {
			mostrarMensaje("La dimension es:" + ahorcado.mostrarDimensionPalabra(juega));
		}
	}

	private static void mensajeSalir() {
		mostrarMensaje("Salio del menu");
	}

	private static String ingresarStringConMensaje(String mensaje) {
		mostrarMensaje(mensaje);
		return teclado1.next().toUpperCase();
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

	/*
	 * private static double ingresarDoubleConMensaje(String mensaje) {
	 * mostrarMensaje(mensaje); while (!teclado.hasNextDouble()) {
	 * mostrarMensaje(mensaje); mostrarMensajeError("Ingrese un numero entero");
	 * teclado.nextLine(); } return teclado.nextDouble(); }
	 */
}
