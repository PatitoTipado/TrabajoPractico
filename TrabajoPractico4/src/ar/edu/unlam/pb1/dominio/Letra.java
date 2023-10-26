package ar.edu.unlam.pb1.dominio;

public class Letra {

	public boolean esVocal(char letra) {
		switch (letra) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		default:
			return false;
		}
	}
}
