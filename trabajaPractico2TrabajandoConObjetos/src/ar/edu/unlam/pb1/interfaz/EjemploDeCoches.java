package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Coche;

public class EjemploDeCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche auto = new Coche("", "", 0.0);
		//System.out.println(auto.getCantidadDeCoches()); // Se debe acceder al método estático get CantidadDeCoches() del
		System.out.println(auto.getPrecio());												// tipo Coche de forma estática ¿why?
														//¿que significa acceder de forma static?
		System.out.println(Coche.getCantidadDeCoches()); //acceder de forma static, signifia
														//entrar desde la clase.
	}

}
