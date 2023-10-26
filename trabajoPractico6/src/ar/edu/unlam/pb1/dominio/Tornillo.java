package ar.edu.unlam.pb1.dominio;

public class Tornillo {
	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;

	public Tornillo(char tipoDeCabeza, int longitud, int cantidadDeRoscas) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRoscas;
	}

	public char getTIPO_DE_CABEZA() {
		return TIPO_DE_CABEZA;
	}

	public int getLONGITUD() {
		return LONGITUD;
	}

	public int getCANTIDAD_DE_ROSCA() {
		return CANTIDAD_DE_ROSCA;
	}

	public int getPosicionActual() {
		return posicionActual;
	}

	public boolean girar(char sentido) {
		if (posicionActual <= CANTIDAD_DE_ROSCA) {
			switch (sentido) {
			case 'h':
				posicionActual++;
				return true;
			case 'a':
				if (posicionActual == 0) {
					return false;
				}
				posicionActual--;
				return true;
			default:
				return false;
			}
		}
		return false;
	}
}
