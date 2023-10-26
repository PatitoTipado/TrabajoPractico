package src.ar.edu.unlam.pb1.auxiliar;

public class Correo {

	private Correo() {
	}

	public static boolean verificarCorreo(String correo) {
		boolean esValido = false;
		correo.trim().toLowerCase();
		boolean existeArroba = buscadorChar(correo, '@');
		boolean existePunto = buscadorChar(correo, '.');
		boolean existePalabraClave = buscadorPalabra(correo, "unlam");
		if (existeArroba && existePunto && existePalabraClave) {
			esValido = true;
		}
		return esValido;
	}

	private static boolean buscadorChar(String correo, Character BuscarChar) {
		Character indice;
		for (int i = 0; i < correo.length(); i++) {
			indice = correo.charAt(i);
			if (indice.equals(BuscarChar)) {
				return true;
			}
		}
		return false;
	}

	private static boolean buscadorPalabra(String correo, String palabraBuscar) {
		int indice = 0;
		boolean existePalabra = false;
		while (indice < correo.length() && !existePalabra) {
			if (correo.toLowerCase().contains(palabraBuscar.toLowerCase())) {
				existePalabra = true;
			}
			indice++;
		}
		return existePalabra;
	}
}
