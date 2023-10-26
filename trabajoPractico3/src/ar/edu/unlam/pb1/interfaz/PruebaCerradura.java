package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Cerradura;
import java.util.Scanner;

public class PruebaCerradura {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cerradura candado = new Cerradura(1234, 0);
		do {
			System.out.println("ingrese la clave");
			int num = teclado.nextInt();
			candado.abrir(num);
			System.out.println("esta abierto? " + candado.estaAbierta());
			System.out.println("esta bloqueado? " + candado.fueBloqueada());
		} while (!candado.fueBloqueada());

	}

}
