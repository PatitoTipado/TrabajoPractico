package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.*;

public class TestHerramienta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tornillo tornillo = new Tornillo('P', 0, 10);
		Destornillador plano = new Destornillador('A');
		Tarugo tarugo10 = new Tarugo(-10);
		plano.atornillar(tornillo);
		System.out.println(tornillo.getPosicionActual());
		plano.atornillador(tornillo, tarugo10);
		System.out.println(tornillo.getPosicionActual());
		plano.desatornillar(tornillo, tarugo10);
		System.out.println(tornillo.getPosicionActual());

	}

}
