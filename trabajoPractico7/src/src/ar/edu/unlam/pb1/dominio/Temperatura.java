package src.ar.edu.unlam.pb1.dominio;

public class Temperatura {
	public final byte CELSIUS = 1;
	public final byte FARENHEIT = 34;
	public final short KELVIN = 273;
	private double valor;
	private String nombreTemp;

	public Temperatura(double valor) {
		nombreTemp="celsius";
		this.valor = valor;
	}

	public void setValor(double valor) {
		nombreTemp="celsius";
		this.valor = valor;
	}

	public void setValor(double valor, byte unidad) {
		switch (unidad) {
		case 1:
			this.valor = valor;
			nombreTemp = "CELSIUS";
			break;
		case 2:
			this.valor = (valor * 1.8) + 32;
			nombreTemp = "FARENHEIT";
			break;
		case 3:
			this.valor = valor + 273;
			nombreTemp = "KELVIN";
			break;
		default:
			this.valor = 0;
			nombreTemp = "";
			break;
		}

	}

	public String getValor() {
		return "La temperatura esta en " + nombreTemp+ " su valor es de: " + valor;
	}

	public double convertir(byte unidad) {
		double aux = 0;
		if (enQueTemperatura().equalsIgnoreCase("celsius")) {
			switch (unidad) {
			case 1:
				return this.valor;
			case 2:
				return aux = (valor * 1.8) + 32;
			case 3:
				return aux = valor + 273;
			default:
				return aux;
			}
		} else if (enQueTemperatura().equalsIgnoreCase("farenheit")) {
			switch (unidad) {
			case 1:
				return this.valor;
			case 2:
				return aux = (valor * 1.8) + 32;
			case 3:
				return aux = valor + 273;
			default:
				return aux;
			}
		} else if (enQueTemperatura().equalsIgnoreCase("kelvin")) {
			switch (unidad) {
			case 1:
				return this.valor;
			case 2:
				return aux = (valor * 1.8) + 32;
			case 3:
				return aux = valor + 273;
			default:
				return aux;
			}
		}
		return 0.0;
	}

	

	public String enQueTemperatura() {
		return nombreTemp;
	}

}
