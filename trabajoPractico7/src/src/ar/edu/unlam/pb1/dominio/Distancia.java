package src.ar.edu.unlam.pb1.dominio;

public class Distancia {
	public final int DECAMETRO = 100;
	public final int HECTOMETRO = 10;
	public final int KILOMETRO = 1;
	private double valor;
	private String nombreDistancia;

	public Distancia(double valor) {
		this.valor = valor;
		this.nombreDistancia = "KILOMETRO";
	}

	public void setValor(double valor) {
		this.valor = valor;
		this.nombreDistancia = "KILOMETRO";
	}

	public void setValor(double valor, byte unidad) {
		if (nombreDistancia.equalsIgnoreCase("KILOMETRO")) {
			switch (unidad) {
			case 1:
				this.valor = valor;
				nombreDistancia = "KILOMETRO";
				break;
			case 2:
				this.valor *= HECTOMETRO;
				nombreDistancia = "HECTOMETRO";
				break;
			case 3:
				this.valor *= DECAMETRO;
				nombreDistancia = "DECAMETRO";
				break;
			default:
				this.valor = 0;
				nombreDistancia = "";
				break;
			}
		}
		if (nombreDistancia.equalsIgnoreCase("HECTOMETRO")) {
			switch (unidad) {
			case 1:
				this.valor *=10 ;
				nombreDistancia = "KILOMETRO";
				break;
			case 2:
				this.valor = valor;
				nombreDistancia = "HECTOMETRO";
				break;
			case 3:
				this.valor *= 10;
				nombreDistancia = "DECAMETRO";
				break;
			default:
				this.valor = 0;
				nombreDistancia = "";
				break;
			}
		}
		if (nombreDistancia.equalsIgnoreCase("DECAMETRO")) {
			switch (unidad) {
			case 1:
				this.valor /= 100;
				nombreDistancia = "KILOMETRO";
				break;
			case 2:
				this.valor /= 10;
				nombreDistancia = "HECTOMETRO";
				break;
			case 3:
				this.valor = valor;
				nombreDistancia = "DECAMETRO";
				break;
			default:
				this.valor = 0;
				nombreDistancia = "";
				break;
			}
		}
	}

	public double convertir(byte unidad) {
		double aux = 0;
		if (nombreDistancia.equalsIgnoreCase("KILOMETRO")) {
			switch (unidad) {
			case 1:
				aux = valor;
				return aux;
			case 2:
				aux = valor * 10;
				return aux;
			case 3:
				aux = valor * 100;
				return aux;
			default:
				return this.valor;
			}
		}
		if (nombreDistancia.equalsIgnoreCase("HECTOMETRO")) {
			switch (unidad) {
			case 1:
				aux = valor / 10;
				return aux;
			case 2:
				aux = valor;
				return aux;
			case 3:
				aux = valor * 10;
				return aux;
			default:
				return this.valor;
			}
		}
		if (nombreDistancia.equalsIgnoreCase("DECAMETRO")) {
			switch (unidad) {
			case 1:
				aux = valor / 100;
				return aux;
			case 2:
				aux = valor / 10;
				return aux;
			case 3:
				aux = valor;
				return aux;
			default:
				return this.valor;
			}
		}
		return this.valor;
	}

	public String getValorYNombre() {
		return "La temperatura esta en " + nombreDistancia + " su valor es de: " + valor;
	}

	public double getValor() {
		return valor;
	}

	public String getNombreDistancia() {
		return nombreDistancia;
	}
}
