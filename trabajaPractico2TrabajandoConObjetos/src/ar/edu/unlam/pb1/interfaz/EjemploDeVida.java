package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Persona;

public class EjemploDeVida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona sofia = new Persona("Sofia", "mujer", 38432153, 2.8, 0.50);
		System.out.println(sofia);
		// al imprimir el objeto sofia, se muestra lo que haya en toString
		System.out.println(sofia.pesar());
		System.out.println(sofia.medir());
		sofia.alimentar(1.0);
		sofia.crecer(0.5);
		sofia.cumpliranios(); // me pide que cumpla años, pero no tiene como metodo imprimir
		System.out.println(sofia.pesar());
		System.out.println(sofia.medir());
		System.out.println(sofia);

	}

}
