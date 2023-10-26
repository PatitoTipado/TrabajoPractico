package ar.edu.unlam.pb1.dominio;

public class Dia {
	public String dias(DiasDeSemana dia) {
		switch (dia) {
		case DOMINGO:
			return "domingo";
		case LUNES:
			return "lunes";
		case MARTES:
			return "martes";
		case MIERCOLES:
			return "miercoles";
		case JUEVES:
			return "jueves";
		case VIERNES:
			return "viernes";
		case SABADO:
			return "sabado";
		default:
			return "No elegiste un dia disponible";
		}
	}
}
