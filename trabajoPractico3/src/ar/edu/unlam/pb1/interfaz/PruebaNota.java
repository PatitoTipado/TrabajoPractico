package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Nota;

public class PruebaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nota nota = new Nota(2);
		System.out.println("El valor de la nota es: " + nota.getNota());
		System.out.println("Esta aprobado?: " + nota.aprobado());
		nota.recuperar(8);
		System.out.println("El valor de la nota es: " + nota.getNota());
		System.out.println("Esta aprobado?: " + nota.aprobado());

	}

}
