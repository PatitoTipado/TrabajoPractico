package ar.edu.unlam.pb1.dominio;

public class Cubo {
	private float longitudLado;
	public Cubo(float lado) {
		this.longitudLado=lado;
	}
	public float getLongitudLado() {
		return this.longitudLado;
	}
	public void setLongitudLado(float longitudLado) {
		this.longitudLado=longitudLado;
	}
	public float setSuperficieCara() {
		return 0;
	}
	public float getVolumen() {
		return 0;
	}
}
