package ar.edu.unlam.pb1.dominio;

public class Tambor {
	private final int POSICION_MAXIMA = 9;
	private final int POSICION_MINIMA = 0;
	private int posicion;

	public int getposicion() {
		return posicion;
	}

	public void girarPositivo() {
		if (sePuedeGirar()) {
			posicion++;
		}
	}

	public void girarNegativo() {
		if (sePuedeGirar()) {
			posicion--;
		}
	}

	private boolean sePuedeGirar() {
		return POSICION_MINIMA <= posicion && POSICION_MAXIMA > posicion;
	}

	public void girarNumero(int numero, boolean girarPositivo) {
		if (girarPositivo) {
			for (int i = 0; i < numero; i++) {
				girarPositivo();
			}
		}
		if (girarPositivo) {
			for (int i = 0; i < numero; i++) {
				girarNegativo();
			}
		}
	}
}
