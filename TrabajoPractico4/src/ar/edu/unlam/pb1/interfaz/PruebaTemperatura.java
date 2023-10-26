package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Temperatura;

public class PruebaTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperatura termostato = new Temperatura(2);
		termostato.setValor(4, (byte) 2);
		System.out.println(termostato.getValor());
	}

}
