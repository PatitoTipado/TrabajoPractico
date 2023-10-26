package ar.edu.unlam.pb1.rewind;

import java.util.Scanner;

public class PruebaCuenta {
	private static Scanner teclado = new Scanner(System.in);
	private static Scanner teclado1 = new Scanner(System.in);
	private static Cuenta persona = new Cuenta("pipa");

	public static void main(String[] args) {
		boolean salir = false;
		while (!salir)
			switch (opcionesDeCuenta()) {
			case 1:
				consultarTitularSaldo();
				break;
			case 2:
				consultarSiDeposito();
				break;
			case 3:
				consultarSiPuedeRetirar();
				break;
			case 4:
				cambiarTitularDeCuenta();
				break;
			case 5:
				salir = true;
				break;
			}
	}

	private static void cambiarTitularDeCuenta() {
		// TODO Auto-generated method stub
		System.out.println("ingrese el nombre del nuevo titular");
		String nombre = teclado1.next();
		persona.setTitular(nombre);
		System.out.println("se cambio con exito");
	}

	private static void consultarSiPuedeRetirar() {
		// TODO Auto-generated method stub
		if (persona.puedeRetirar() && persona.puedeHackear()) {
			System.out.println("cuanto desea retirar: ");
			double extraer = teclado.nextDouble();
			persona.retirar(extraer);
		} else {
			System.err.println("No se puede retirar");
			System.out.println("saldo actual: " + persona.getSaldo());
		}
		System.out.println(Cuenta.saldoHacker);
	}

	private static void consultarSiDeposito() {
		// TODO Auto-generated method stub
		System.out.println("cuanto desea depositar");
		double deposito = teclado.nextDouble();
		persona.depositar(deposito);
		System.out.println("saldo actual: " + persona.getSaldo());
		System.out.println(Cuenta.saldoHacker);

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
		System.out.println("Opcion 5: salir");
		return ingresarEntero();
	}

//	private static String mensaje() {
//		return teclado.next();
//	}

//	private static void mostrarMensaje(String mensaje) {
//		System.out.println(mensaje);
//	}

	private static void mostrarMensajeError(String mensaje) {
		System.err.println(mensaje);
	}

//	private static int ingresarEnteroConMensaje(String mensaje) {
//		mostrarMensaje(mensaje);
//		while (!teclado.hasNextInt()) {
//			mostrarMensaje(mensaje);
//			mostrarMensajeError("Ingrese un numero entero");
//			teclado.nextLine();
//		}
//		return teclado.nextInt();
//	}

	private static int ingresarEntero() {
		while (!teclado.hasNextInt()) {
			mostrarMensajeError("Ingrese un numero entero");
			teclado.nextLine();
		}
		return teclado.nextInt();
	}

}
