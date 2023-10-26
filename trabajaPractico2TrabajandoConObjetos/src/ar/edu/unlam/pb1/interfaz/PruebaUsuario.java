package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Usuario;

public class PruebaUsuario {
	public static void main(String[] args) {
		Usuario pipe=new Usuario("pipe","","pipe","",1,1);
		System.out.println(pipe);
		System.out.println(pipe.getUsuario());
	}
}
