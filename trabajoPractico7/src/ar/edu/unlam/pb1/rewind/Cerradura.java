package ar.edu.unlam.pb1.rewind;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallos;
	private boolean estaAbierta;
	private static final int CANTIDAD_MAXIMA_INTENTOS = 3;

	public Cerradura(int claveDeApertura, int cantidadDeFallos) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallos = cantidadDeFallos;
		estaAbierta=false;
	}

	public int getCantidadDeFallosRestantes() {
		return CANTIDAD_MAXIMA_INTENTOS - cantidadDeFallos;
	}

	public boolean sePuedeSeguirIntentandoAbrir(int clave) {
		return claveDeApertura != clave && !fueBloqueada();
	}

	public void setClaveDeApertura(int claveDeApertura) {
		if (estadoCerradura()) {
			this.claveDeApertura = claveDeApertura;
		}
	}

	public boolean abrir(int clave) {
			if (claveDeApertura != clave && !fueBloqueada()) {
				cantidadDeFallos++;
				return estaAbierta;
			} else if (!fueBloqueada() && claveDeApertura == clave) {
				estaAbierta = true;
				return estaAbierta;
			}
		
		return estaAbierta == false;
	}

	public void cerrar() {
			estaAbierta = false;
			cantidadDeFallos = 0;
		
	}

	public boolean estadoCerradura() {
		return estaAbierta;
	}

	public boolean fueBloqueada() {
		if (cantidadDeFallos == CANTIDAD_MAXIMA_INTENTOS) {
			return true;
		}
		return false;
	}
}
