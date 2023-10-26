package ar.edu.unlam.pb1.dominio;

public class DiscoRigido {
	private double tamanio;
	private static final double DVD = 4.5;
	private static final double BLUE_RAY = 15.0;

	public DiscoRigido(int tamanio) {
		this.tamanio = tamanio;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public double cuantosDvd() {
		double resultado = tamanio / DVD;
		double aux = tamanio % DVD;
		if (aux > 0) {
			resultado = (int) resultado + 1;
		}
		return resultado;
	}

	public double cuantosBlueRay() {
		double resultado = tamanio / BLUE_RAY;
		double aux = tamanio % BLUE_RAY;
		if (aux > 0) {
			resultado = (int) resultado + 1;
		}
		return resultado;
	}

}
