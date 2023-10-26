package ar.edu.unlam.pb1.dominio;

public class Alarma {

	private boolean sensorDeMovimiento;
	private boolean sensorDeContacto;
	private boolean sensorDeSonido;
	private boolean encendida;
	private int codigoDeSeguridad;

	public boolean isSensorDeMovimiento() {
		return sensorDeMovimiento;
	}

	public boolean isSensorDeContacto() {
		return sensorDeContacto;
	}

	public boolean isSensorDeSonido() {
		return sensorDeSonido;
	}

	public boolean isEncendida() {
		return encendida;
	}

	public int getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public Alarma(int codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public void encender() {
		encendida = true;
	}

	public void apagar() {
		encendida = false;
	}

	public boolean activada() {
		sensorDeContacto = true;
		sensorDeMovimiento = true;
		sensorDeSonido = true;
		return true;
	}

	public boolean estaEncendida() {
		return encendida;
	}
}
