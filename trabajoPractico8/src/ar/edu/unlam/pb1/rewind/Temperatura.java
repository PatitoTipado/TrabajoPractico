package ar.edu.unlam.pb1.rewind;

public class Temperatura {
	public final byte CELISUS = 1;
	public final byte FARENHEIT = 34;
	public final short KELVIN = 273;
	private double valor;

	public Temperatura(double valor) {
		this.valor = valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setValor(double valor, Temperaturas temperatura) {
		if (temperatura.equals(Temperaturas.CELISUS)) {
			temperaturaCelisus(valor, temperatura);
		} else if (temperatura.equals(Temperaturas.FARENHEIT)) {
			temperaturaFarenheit(valor, temperatura);
		} else if (temperatura.equals(Temperaturas.KELVIN)) {
			temperaturaKelvin(valor, temperatura);
		}
	}

	private void temperaturaCelisus(double valor, Temperaturas temperatura) {
		switch (temperatura) {
		case CELISUS:
			this.valor = valor;
			break;
		case FARENHEIT:
			this.valor = (valor * 1.8) + 32;
			break;
		case KELVIN:
			this.valor = valor + 273;
			break;
		default:
			this.valor = 0;
			break;
		}
	}

	private void temperaturaFarenheit(double valor, Temperaturas temperatura) {
		switch (temperatura) {
		case CELISUS:
			this.valor -= 17;
			break;
		case FARENHEIT:
			this.valor = valor;
			break;
		case KELVIN:
			this.valor += 256;
			break;
		default:
			this.valor = 0;
			break;
		}
	}

	private void temperaturaKelvin(double valor, Temperaturas temperatura) {
		switch (temperatura) {
		case CELISUS:
			this.valor -= 272;
			break;
		case FARENHEIT:
			this.valor -= 457.87;
			break;
		case KELVIN:
			this.valor = valor;
			break;
		default:
			this.valor = 0;
			break;
		}
	}

	public double getValor() {
		return valor;
	}

	public double convertirTemperaturaDeseada(Temperaturas temperaturaAConvertir) {
		if (temperaturaAConvertir.equals(Temperaturas.CELISUS)) {
			convertirCelisus(temperaturaAConvertir);
		} else if (temperaturaAConvertir.equals(Temperaturas.FARENHEIT)) {
			convertirFarenheit(temperaturaAConvertir);
		} else if (temperaturaAConvertir.equals(Temperaturas.KELVIN)) {
			convertirKelvin(temperaturaAConvertir);
		}
		return 0;
	}

	private double convertirCelisus(Temperaturas temperatura) {
		double valorAux = 0;
		switch (temperatura) {
		case CELISUS:
			return valorAux = valor;
		case FARENHEIT:
			return valorAux = (valor * 1.8) + 32;
		case KELVIN:
			return valorAux = valor + 273;
		default:
			return valorAux;

		}
	}

	private double convertirFarenheit(Temperaturas temperatura) {
		double valorAux = 0;
		switch (temperatura) {
		case CELISUS:
			return valorAux = valor - 17;
		case FARENHEIT:
			return valorAux = valor;
		case KELVIN:
			return valorAux = valor + 256;
		default:
			return valorAux;
		}
	}

	private double convertirKelvin(Temperaturas temperatura) {
		double valorAux = 0;
		switch (temperatura) {
		case CELISUS:
			valorAux = valor - 272;
		case FARENHEIT:
			valorAux = valor - 457.87;
		case KELVIN:
			valorAux = valor;
		default:
			return valorAux;
		}
	}

}
