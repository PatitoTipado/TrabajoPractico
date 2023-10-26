package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Punto;

public class PruebaPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto = new Punto(0, 3);
		System.out.println("Esta sobre el origen?: " + punto.estaSobreElOrigenDeCoordenadas());
		System.out.println("Esta sobre el eje x?: " + punto.estaSobreEjeX());
		System.out.println("Esta sobre el eje y?: " + punto.estaSobreEjeY());
	}

}
