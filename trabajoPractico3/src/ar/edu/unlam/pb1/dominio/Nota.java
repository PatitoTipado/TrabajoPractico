package ar.edu.unlam.pb1.dominio;

public class Nota {
	private float nota;

	public Nota(float valorInicial) {
		this.nota = valorInicial;
	}

	public float getNota() {
		return nota;
	}

	public boolean aprobado() {
		if (nota >= 7 && nota <= 10) {
			return true;
		} else {
			return false;
		}
	}

	public void recuperar(float nuevoValor) {
		this.nota = nuevoValor;
	}
}
