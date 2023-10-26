package src.ar.edu.unlam.pb1.auxiliar;

public class Contrasenia {
	private static final int CANTIDAD_NUMEROS = 4;
	private static final int CANTIDAD_MINUSCULAS = 2;
	private static final int CANTIDAD_MAYUSCULAS = 1;
	private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMEROS = "1234567890";

	private Contrasenia() {
	}

	public static String generarPassword(int longuitudDeseada) {
		String generarContrasenia = "";
		for (int i = 0; i < longuitudDeseada; i++) {
			generarContrasenia += caracterRamdon();
		}
		return generarContrasenia;
	}

	private static Character caracterRamdon() {
		Character aleatorio = CARACTERES.charAt((int) (Math.random() * CARACTERES.length()));
		return aleatorio;
	}

	public static boolean esFuerte(String contrasenia) {
		boolean verificarMayus = verificarCaracteres(MAYUSCULAS, CANTIDAD_MAYUSCULAS, contrasenia);
		boolean verificarMinus = verificarCaracteres(MINUSCULAS, CANTIDAD_MINUSCULAS, contrasenia);
		boolean verificarNumero = verificarCaracteres(NUMEROS, CANTIDAD_NUMEROS, contrasenia);
		return verificarMayus && verificarMinus && verificarNumero;
	}

	private static boolean verificarCaracteres(String tipoDeLetra, int contador, String contrasenia) {
		int contadora = 0;
		Character buscador;
		for (int i = 0; i < contrasenia.length(); i++) {
			for (int j = 0; j < tipoDeLetra.length(); j++) {
				buscador = tipoDeLetra.charAt(j);
				if (buscador.equals(contrasenia.charAt(i))) {
					contadora++;
				}
			}
		}
		return contadora >= contador;
	}

}
