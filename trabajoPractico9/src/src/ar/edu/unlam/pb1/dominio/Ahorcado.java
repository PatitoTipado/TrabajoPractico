package src.ar.edu.unlam.pb1.dominio;

import src.ar.edu.unlam.pb1.auxiliar.Persona;

public class Ahorcado {
	// datos
	private static int vueltas;
	private String adivinarPalabra;
	private String letrasEquivocadasJugadorCero = "";
	private String letrasEquivocadasJugadorUno = "";
	private String palabraJugadorCero;
	private String palabraJugadorUno;
	// Arrays
	private static Persona jugadores[] = new Persona[2];
	private Character arrayPalabraJugadorCero[];
	private Character arrayPalabraJugadorUno[];

	public Ahorcado(String adivinarPalabraJugadorCero, String adivinarPalabraJugadorUno) {
		this.palabraJugadorCero = adivinarPalabraJugadorCero;
		this.palabraJugadorUno = adivinarPalabraJugadorUno;
		this.arrayPalabraJugadorCero = new Character[palabraJugadorCero.length()];
		this.arrayPalabraJugadorUno = new Character[palabraJugadorUno.length()];
		llenarArray();
	}

	public Persona jugadorGanadorPorVidas() {
		Persona aux = null;
		int auxVidasJugadorCero = jugadores[0].getVidas();
		int auxVidasJugadorUno = jugadores[1].getVidas();
		if (auxVidasJugadorCero > auxVidasJugadorUno) {
			aux = jugadores[0];
		} else {
			aux = jugadores[1];
		}
		return aux;
	}

	private void matar(int posicion) {
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i] == jugadores[posicion]) {
				for (int j = 0; j < jugadores[i].getVidas(); j++) {
					jugadores[i].pierdeUnaVida();
				}
			}
		}
	}

	public boolean arriesgar(String palabra, int juega) {
		if (palabra.equalsIgnoreCase(getPalabraJugador(juega))) {
			return true;
		}
		matar(juega);
		return false;
	}

	private void llenarArray() {
		for (int i = 0; i < arrayPalabraJugadorCero.length; i++) {
			arrayPalabraJugadorCero[i] = '*';
		}
		for (int j = 0; j < arrayPalabraJugadorUno.length; j++) {
			arrayPalabraJugadorUno[j] = '*';
		}
	}

	public boolean agregarJugador(Persona nuevaPersona) {
		boolean aux = false;
		int indice = 0;
		while (indice < jugadores.length && !aux) {
			if (jugadores[indice] == null) {
				jugadores[indice] = nuevaPersona;
				aux = true;
			}
			indice++;
		}
		return aux;
	}

	// Se muestra a modo de ayuda la dimensión de la palabra ingresada por el
	// adversario de la forma “_ _ _ _ _ _ _ _”.
	public String mostrarDimensionPalabra(int posicion) {
		String aux = "";
		aux = busquedaDePalabraADimensionar(posicion, aux);
		return aux;
	}

	public boolean sePuedeMostrarDimension() {
		if (vueltas >= 0 && vueltas < 2) {
			vueltas++;
			return true;
		}
		return false;
	}

	public void letraEquivocada(Character letraEquivocada, int posicion) {
		if (buscarJugadorPorPosicion(posicion) == jugadores[0]) {
			letrasEquivocadasJugadorCero += letraEquivocada + " - ";
			intentoPerdido(posicion);
		} else if (buscarJugadorPorPosicion(posicion) == jugadores[1]) {
			letrasEquivocadasJugadorUno += letraEquivocada + " - ";
			intentoPerdido(posicion);
		}
	}

	public String getLetrasEquivocadas(int posicion) {
		if (buscarJugadorPorPosicion(posicion) == jugadores[0]) {
			return letrasEquivocadasJugadorCero;
		} else {
			return letrasEquivocadasJugadorUno;
		}
	}

	private String busquedaDePalabraADimensionar(int posicion, String aux) {
		if (buscamosJugadorCero(posicion)) {
			for (int j = 0; j < arrayPalabraJugadorCero.length; j++) {
				aux += "_";
			}
		}
		if (buscamosJugadorUno(posicion)) {
			for (int j = 0; j < arrayPalabraJugadorUno.length; j++) {
				aux += "_";
			}
		}
		return aux;
	}

	public boolean buscamosJugadorCero(int posicion) {
		return buscarJugadorPorPosicion(posicion) == buscarJugadorPorReferencia(jugadores[0]);
	}

	public boolean buscamosJugadorUno(int posicion) {
		return buscarJugadorPorPosicion(posicion) == buscarJugadorPorReferencia(jugadores[1]);
	}

	public Persona buscarJugadorPorPosicion(int posicionArray) {
		Persona jugadorBuscado = null;
		for (int i = 0; i < jugadores.length; i++) {
			if (jugadores[i].equals(jugadores[posicionArray])) {
				jugadorBuscado = jugadores[i];
			}
		}
		return jugadorBuscado;
	}

	public String mostrarArrayDeJugadorCero() {
		String aux = "";
		for (int i = 0; i < arrayPalabraJugadorCero.length; i++) {
			aux += arrayPalabraJugadorCero[i];
		}
		return aux;
	}

	public String mostrarArrayDeJugadorUno() {
		String aux = "";
		for (int i = 0; i < arrayPalabraJugadorUno.length; i++) {
			aux += arrayPalabraJugadorUno[i];
		}
		return aux;
	}

	public boolean ingresarLetraDeJugadorCero(Character letra) {
		for (int i = 0; i < arrayPalabraJugadorCero.length; i++) {
			if (letra.equals(palabraJugadorCero.charAt(i))) {
				arrayPalabraJugadorCero[i] = letra;
				return true;
			}
		}
		return false;
	}

	public boolean ingresarLetraDeJugadorUno(Character letra) {
		for (int i = 0; i < arrayPalabraJugadorUno.length; i++) {
			if (letra.equals(palabraJugadorUno.charAt(i))) {
				arrayPalabraJugadorUno[i] = letra;
				return true;
			}
		}
		return false;
	}

	private Persona buscarJugadorPorReferencia(Persona jugador) {
		Persona jugadorAux = null;
		for (int i = 0; i < jugadores.length; i++) {
			if (jugador == jugadores[i]) {
				jugadorAux = jugadores[i];
			}
		}
		return jugadorAux;
	}

	private void intentoPerdido(int posicion) {
		buscarJugadorPorPosicion(posicion).pierdeUnaVida();
	}

	public static boolean puedoSeguirJugando() {
		return (jugadores[0].getVidas() > 0) && (jugadores[1].getVidas() > 0);
	}

	public String getAdivinarPalabra() {
		return adivinarPalabra;
	}

	public void setAdivinarPalabra(String adivinarPalabra) {
		this.adivinarPalabra = adivinarPalabra;
	}

	public String getPalabraJugador(int posicion) {
		if (buscamosJugadorCero(posicion)) {
			return palabraJugadorCero;
		} else {
			return palabraJugadorUno;
		}
	}

}
