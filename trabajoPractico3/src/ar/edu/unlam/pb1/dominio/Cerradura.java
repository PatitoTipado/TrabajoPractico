package ar.edu.unlam.pb1.dominio;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallos;
	private boolean estaAbierta;
	private static final int CANTIDAD_MAXIMA_INTENTOS = 3;

	public Cerradura(int claveDeApertura, int cantidadDeFallos) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallos = cantidadDeFallos;
	}

	public boolean abrir(int clave) {
		if (claveDeApertura != clave && !fueBloqueada()) {
			cantidadDeFallos++;
			return estaAbierta;
		} else if (!fueBloqueada()) {
			estaAbierta = true;
			return estaAbierta;
		}
		return estaAbierta == false;
	}

	public void cerrar() {
		if (estaAbierta && !fueBloqueada()) {
			estaAbierta = false;
			cantidadDeFallos = 0;
		}
	}

	public boolean estaAbierta() {
		return estaAbierta;
	}

	public boolean fueBloqueada() {
		if (cantidadDeFallos == CANTIDAD_MAXIMA_INTENTOS) {
			return true;
		}
		return false;
	}
}
