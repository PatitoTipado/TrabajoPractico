package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.auxiliar.Persona;

public class Ascensor {
	private final int PISO_MAXIMO = 9; // final en mayuscula
	private final int PISO_MINIMO = 0;
	private final double PESO_MAXIMO;
	private final double CAPACIDAD_MAXIMA;
	private boolean puertaAbierta;
	private boolean sobreCarga;
	private static long pisoActual;
	private double pesoActual;
	private int capacidadActual;

	// private Persona cantidadPersonas[]=null;
	public Ascensor(int capacidadMaxima, double pesoMaximo) {
		// this.cantidadPersonas=new Persona[capacidadMaxima];
		PESO_MAXIMO = pesoMaximo;
		CAPACIDAD_MAXIMA = capacidadMaxima;
		puertaAbierta = false;
		// los constructores, deben tener todos los atributos?
	}

	public void ingresar(Persona elQueSube) {
		if (puertaAbierta) {
			ingresar(elQueSube.pesar());
			capacidadActual++;
		}
	}

	public void ingresar(double peso) {
		pesoActual += peso;
	}

	public void salir(Persona elQueBaja) {
		if (puertaAbierta) {
			salir(elQueBaja.pesar());
		}
	}

	public void salir(double peso) {
		pesoActual -= peso;
	}

	public boolean abrirPuerta() {
		return puertaAbierta = true;
	}

	public boolean cerrarPuerta() {
		return puertaAbierta = false;
	}

	public void subir() {
		if (sePuedeSubir()) {
			pisoActual++;
		}
	}

	private boolean sePuedeSubir() {
		if (capacidadActual > CAPACIDAD_MAXIMA || (sobreCargado())) {
			// 160 > 150 (true) true true
			return false;
		}
		return true;
	}

	private boolean sobreCargado() {
		return pesoActual > PESO_MAXIMO;
	}

	public void bajar() {
		pisoActual--;
	}

	public int getPisoActual() {
		return (int) pisoActual;
	}

	public void irAlPiso(boolean pisoDeseado) {

	}
	// faltan metodos? faltan condiciones?
	// lo tuviera que encarar de otra forma?

	public int getPISO_MAXIMO() {
		return PISO_MAXIMO;
	}

	public int getPISO_MINIMO() {
		return PISO_MINIMO;
	}

	public double getPESO_MAXIMO() {
		return PESO_MAXIMO;
	}

	public double getCAPACIDAD_MAXIMA() {
		return CAPACIDAD_MAXIMA;
	}

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public boolean isSobreCarga() {
		return sobreCarga;
	}

	public double getPesoActual() {
		return pesoActual;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

}
