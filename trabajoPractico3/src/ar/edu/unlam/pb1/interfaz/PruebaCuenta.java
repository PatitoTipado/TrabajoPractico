package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Cuenta;
import java.util.Scanner;

public class PruebaCuenta {
	private static Scanner teclado = new Scanner(System.in);
	private static Scanner teclado1 = new Scanner(System.in);
	private static Cuenta persona = new Cuenta("pipa");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch (opcionesDeCuenta()) {
		case 1:
			consultarTitularSaldo();
			break;
		case 2:
			consultarSaldo();
			break;
		case 3:
			consultarRetiro();
			break;
		case 4:
			cambiarTitularDeCuenta();
			break;
		}
	}

	private static void cambiarTitularDeCuenta() {
		// TODO Auto-generated method stub
		System.out.println("ingrese el nombre del nuevo titular");
		String nombre=teclado1.next();
		persona.setTitular(nombre);
		System.out.println("se cambio con exito");
	}

	private static void consultarRetiro() {
		// TODO Auto-generated method stub
		if (persona.puedeRetirar()) {
			System.out.println("cuanto desea depositar");
			double extraer=teclado.nextDouble();
			persona.retirar(extraer);
		} else {
			System.err.println("No se puede retirar");
			System.out.println("saldo actual: " + persona.getSaldo());
		}
	}

	private static void consultarSaldo() {
		// TODO Auto-generated method stub
		System.out.println("cuanto desea depositar");
		double deposito=teclado.nextDouble();
		persona.depositar(deposito);
		System.out.println("saldo actual: " + persona.getSaldo());
	}

	private static void consultarTitularSaldo() {
		// TODO Auto-generated method stub
		System.out.println(persona);
	}

	public static int opcionesDeCuenta() {
		System.out.println("elegi la operacion a realizar");
		System.out.println("Opcion 1: consultar titular y saldo");
		System.out.println("Opcion 2: consultar deposito");
		System.out.println("Opcion 3: consultar retiro");
		System.out.println("Opcion 4: cambiar titular de cuenta");
		return teclado.nextInt();
	}
}
