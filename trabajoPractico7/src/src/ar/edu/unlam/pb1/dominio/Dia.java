package src.ar.edu.unlam.pb1.dominio;

public class Dia {
	public String dias(int num) {
		switch (num) {
		case 1:
			return "domingo";
		case 2:
			return "lunes";
		case 3:
			return "martes";
		case 4:
			return "miercoles";
		case 5:
			return "jueves";
		case 6:
			return "viernes";
		case 7:
			return "sabado";
		default:
			return "No elegiste un dia disponible";
		}
	}
}

