package ar.edu.unlam.pb1.dominio;

public class Distancia {
	public final int DECAMETRO = 100000;
	public final int HECTOMETRO = 10000;
	public final int KILOMETRO = 1000;
	private double valor;

	public Distancia(double valor) {
		this.valor = valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setValor(double valor, byte unidad) {
		switch (unidad) {
		case 1:
			valor /= KILOMETRO;
			break;
		case 2:
			valor /= HECTOMETRO;
			break;
		case 3:
			valor /= DECAMETRO;
			break;
		default:
			this.valor = valor;
			break;
		}
	}
	public double getValor() {
		return valor;
	}
	public double convertir(byte unidad) {
		switch (unidad) {
		case 1:
			return valor/KILOMETRO;
		case 2:
			return valor/HECTOMETRO;
		case 3:
			return valor/DECAMETRO;
		default:
			return this.valor;
		}
	}

}
