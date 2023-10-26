package src.ar.edu.unlam.pb1.interfaz;

import src.ar.edu.unlam.pb1.dominio.Jean;

public class TestJean {

	public static void main(String[] args) {
		Jean[] jeanes = new Jean[3];
		Jean jean = new Jean("fiat", "rosa", "4", 100);
		Jean jeanverde = new Jean("fiat", "verde", "m", 100);
		Jean jeanrosa = new Jean("fiat", "azul", "xxl", 100);

		// cargamos elementos en el array
		for (int i = 0; i < jeanes.length; i++) {
			jeanes[i] = jean;
			if (i == 1) {
				jeanes[i] = jeanverde;
			}
			if (i == 2) {
				jeanes[i] = jeanrosa;
			}

		}
		// mostramos sin aumento
		for (int i = 0; i < jeanes.length; i++) {
			if (jeanes[i] != null) {
				mostrarMensaje(jeanes[i].toString());
			}
		}

		// aumentamos precio (argentina papa)
		for (int i = 0; i < jeanes.length; i++) {
			jeanes[i].aumentoDePrecioPorcentaje(0.20);
		}
		// mostramos con aumento
		for (int i = 0; i < jeanes.length; i++) {
			if (jeanes[i] != null) {
				mostrarMensaje(jeanes[i].toString());
			}
		}
	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println("\n\n" + mensaje);
	}

}
