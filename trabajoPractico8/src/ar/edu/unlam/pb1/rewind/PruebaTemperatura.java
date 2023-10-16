package ar.edu.unlam.pb1.rewind;

public class PruebaTemperatura {

	public static void main(String[] args) {
		Temperatura termostato = new Temperatura(2);
		System.out.println(termostato.getValor());
		termostato.setValor(4, Temperaturas.CELISUS);
		System.out.println(termostato.getValor());
	}

}
