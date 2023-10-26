package ar.edu.unlam.pb1.dominio;

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

	public void setValor(double valor, byte unidad) {
		switch (unidad) {
		case 1:
			this.valor = valor;
			break;
		case 2:
			this.valor = (valor * 1.8) + 32;
			break;
		case 3:
			this.valor = valor + 273;
			break;
		default:
			this.valor = 0;
			break;
		}

	}

	public double getValor() {
		return valor;
	}

	public double convertir(byte unidad) {
		switch (unidad) {
		case 1:
			return this.valor;
		case 2:
			return valor = (valor * 1.8) + 32;
		case 3:
			return valor = valor + 273;
		default:
			return this.valor;
		}
	}
}
