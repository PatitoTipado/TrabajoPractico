package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Calculadora;
import java.util.Scanner;

public class EjemploDeCalculadora {

	private static Scanner teclado = new Scanner(System.in);
	private static Calculadora casio = new Calculadora();
	private static Calculadora calculadoraDeCelular = null;

	public static void main(String[] args) {

		switch (opcionCalculadora()) {
		case 1:
			casioCalculadora();
			break;
		case 2:
			celularCalculadora();
			break;
		}

	}

	private static void celularCalculadora() {
		usarCelular();
		switch (opcionesDeCalculadora()) {
		case 1:
			sumaCelular();
			break;
		case 2:
			restaCelular();
			break;
		case 3:
			multiplicarCelular();
			break;
		case 4:
			dividirCelular();
			break;
		case 5:
			radioCelular();
			break;
		default:
			System.out.println("elegi entre las opciones");
			break;
		}
	}

	private static void radioCelular() {
		// TODO Auto-generated method stub
		System.out.println("ingrese el radio");
		double radio = teclado.nextDouble();
		System.out.println(calculadoraDeCelular.calcularAreaCirculo(radio));
	}

	private static void casioCalculadora() {
		switch (opcionesDeCalculadora()) {
		case 1:
			sumaCasio();
			break;
		case 2:
			restaCasio();
			break;
		case 3:
			multiplicarCasio();
			break;
		case 4:
			dividirCasio();
			break;
		case 5:
			radioCasio();
			break;
		default:
			System.out.println("elegi entre las opciones");
			break;
		}
	}

	private static void radioCasio() {
		// TODO Auto-generated method stub
		System.out.println("ingrese el radio");
		double radio = teclado.nextDouble();
		System.out.println(casio.calcularAreaCirculo(radio));
	}

	private static int opcionCalculadora() {
		System.out.println("elegi la caluladora a usar");
		System.out.println("Opcion 1: casio");
		System.out.println("Opcion 2: de celular");
		return teclado.nextInt();
	}

	public static int opcionesDeCalculadora() {
		System.out.println("elegi la operacion a realizar");
		System.out.println("Opcion 1: suma");
		System.out.println("Opcion 2: resta");
		System.out.println("Opcion 3: multiplicacion");
		System.out.println("Opcion 4: division");
		System.out.println("opcion 5: Area de un circulo");
		return teclado.nextInt();
	}

	private static void sumaCasio() {
		System.out.println("eliga el primer numero a usar");
		int numeroUno = teclado.nextInt();
		System.out.println("eliga el segundo numero a usar");
		int numeroDos = teclado.nextInt();
		System.out.println(casio.sumar(numeroUno, numeroDos));
	}

	private static void restaCasio() {
		System.out.println("eliga el primer numero a usar");
		int numeroUno = teclado.nextInt();
		System.out.println("eliga el segundo numero a usar");
		int numeroDos = teclado.nextInt();
		System.out.println(casio.restar(numeroUno, numeroDos));
	}

	private static void multiplicarCasio() {
		System.out.println("eliga el primer numero a usar");
		int numeroUno = teclado.nextInt();
		System.out.println("eliga el segundo numero a usar");
		int numeroDos = teclado.nextInt();
		System.out.println(casio.multiplicar(numeroUno, numeroDos));
	}

	private static void dividirCasio() {
		System.out.println("eliga el primer numero a usar");
		int numeroUno = teclado.nextInt();
		System.out.println("eliga el segundo numero a usar");
		int numeroDos = teclado.nextInt();
		System.out.println(casio.dividir(numeroUno, numeroDos));
	}

	private static Calculadora usarCelular() {
		System.out.println("eliga el primer numero a usar");
		int numeroUno = teclado.nextInt();
		System.out.println("eliga el segundo numero a usar");
		int numeroDos = teclado.nextInt();
		return calculadoraDeCelular = new Calculadora(numeroUno, numeroDos);
	}

	private static void sumaCelular() {
		System.out.println("el resultado de la suma es: " + calculadoraDeCelular.sumar());
	}

	private static void restaCelular() {
		System.out.println("el resultado de la suma es: " + calculadoraDeCelular.restar());
	}

	private static void multiplicarCelular() {
		System.out.println("el resultado de la suma es: " + calculadoraDeCelular.multiplicar());
	}

	private static void dividirCelular() {
		if (calculadoraDeCelular.sePuedeDividir()) {
			System.out.println("el resultado de la suma es: " + calculadoraDeCelular.dividir());
		} else {
			System.err.println("no se puede");
		}
	}

}