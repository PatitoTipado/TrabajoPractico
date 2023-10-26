package ar.edu.unlam.pb1.dominio;
import ar.edu.unlam.pb1.rewind.Persona;
public class PruebaEstadisticasDePersonas {
	private double peso;
	private int edad;
	
	public double getPeso() {
		return peso;
	}
	public int getEdad() {
		return edad;
	}
	public boolean bajoPeso(Persona persona) {
		if(persona.pesar()<50) {
			return true;
		}else {
			return false;
		}
	}
	public boolean sobrePeso(Persona persona) {
		if(persona.pesar()>150) {
			return true;
		}else {
			return false;
		}
	}
	public boolean normalPeso(Persona persona) {
		if(persona.pesar()>50 && persona.pesar()<150) {
			return true;
		} else {
			return false;
		}
	}
}	
