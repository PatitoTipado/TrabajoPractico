package ar.edu.unlam.pb1.test;

public class Contrasenia {
	private static final int CANTIDAD_NUMEROS = 4;
	private static final int CANTIDAD_MINUSCULAS = 2;
	private static final int CANTIDAD_MAYUSCULAS = 1;
	private int longuitud;
	private String contrasenia;
	private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMEROS = "1234567890";

	public Contrasenia() {
	}

	public Contrasenia(int longuitud) {
		this.longuitud = longuitud;
		contrasenia = "";
		for (int i = 0; i < longuitud; i++) {
			contrasenia += caracterRamdon();
		}
	}

	public void generarPassword() {
		this.contrasenia = "";
		for (int i = 0; i < longuitud; i++) {
			contrasenia += caracterRamdon();
		}
	}

	private Character caracterRamdon() {
//		 int aleatorio=0; 
//		 aleatorio = (int) (Math.random() * CARACTERES.length());
//		 Character caracter; 
//		 for (int i = 0; i < CARACTERES.length(); i++) { 
//		 caracter= CARACTERES.charAt(i); if (caracter.equals(CARACTERES.charAt(aleatorio))) {
//		 return CARACTERES.charAt(i); } } return CARACTERES.charAt((int) Math.random()CARACTERES.length());
		Character aleatorio = CARACTERES.charAt((int) (Math.random() * CARACTERES.length()));
		return aleatorio;
	}

	public boolean esFuerte() {
		boolean verificarMayus = verificarCaracteres(MAYUSCULAS, CANTIDAD_MAYUSCULAS);
		boolean verificarMinus = verificarCaracteres(MINUSCULAS, CANTIDAD_MINUSCULAS);
		boolean verificarNumero = verificarCaracteres(NUMEROS, CANTIDAD_NUMEROS);
		return verificarMayus && verificarMinus && verificarNumero;
	}

	private boolean verificarCaracteres(String tipoDeLetra, int contador) {
		int contadora = 0;
		Character buscador;
		for (int i = 0; i < this.contrasenia.length(); i++) {
			for (int j = 0; j < tipoDeLetra.length(); j++) {
				buscador = tipoDeLetra.charAt(j);
				if (buscador.equals(contrasenia.charAt(i))) {
					contadora++;
				}
			}
		}
		return contadora >= contador;
	}

	public int getLonguitud() {
		return longuitud;
	}

	public String getContraseña() {
		return contrasenia;
	}

	public void setLonguitud(int longuitud) {
		this.longuitud = longuitud;
	}

}
