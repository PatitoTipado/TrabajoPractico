package ar.edu.unlam.pb1.rewind;

import java.lang.Math;

public class Calculadora {
	private double operador1;
	private double operador2;
	private final double PI = Math.PI;

	public Calculadora() {
	}

	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	public double sumar() {
		return this.operador1 + this.operador2;
	}

	public double sumar(double operador1, double operador2) {
		return operador1 + operador2;
	}

	public double restar() {
		return this.operador1 - this.operador2;
	}

	public double restar(double operador1, double operador2) {
		return operador1 - operador2;
	}

	public double multiplicar() {
		return operador1 * operador2;
	}

	public double multiplicar(double operador1, double operador2) {
		return operador1 * operador2;
	}

	public double dividir() {
		double resultado = 0.0;
		if (this.operador2 == 0) {
			System.err.println("no es posible");
			return 0;
		} else {
			resultado = operador1 / operador2;
			return resultado;
		}
	}

	public double dividir(double numerador, double divisor) {
		double resultado = 0.0;
		this.operador2 = divisor;
		if (divisor == 0) {
			System.err.println("no es posible");
			return 0;
		} else {
			resultado = numerador / divisor;
			return resultado;
		}
	}

	public boolean sePuedeDividir() {
		return this.operador2 != 0;
	}

	public boolean sePuedeDividir(double num) {
		return num != 0;
	}

	public double calcularAreaCirculo(double radio) {
		double resultado = PI * (Math.pow(radio, 2));
		return resultado;
	}

	public boolean esPositivo(double a) {
		return a > 0;
	}

	public boolean esNegativo(double a) {
		return a < 0;
	}

	public double potencia(double base, double exponente) {
		double resultadoPotencia = 1;
		if (esNegativo(exponente)) {
			exponente = -(exponente);
			for (int i = 0; i < exponente; i++) {
				resultadoPotencia *= base;
			}
			return 1 / resultadoPotencia; // termina aca, por que ya tiene algo que retornar
		}
		for (int i = 0; i < exponente; i++) {
			resultadoPotencia *= base;
		}
		return resultadoPotencia;
	}

	public double potenciaPow(double base, double exponente) {
		double resultadoPotencia = Math.pow(base, exponente);
		return resultadoPotencia;
	}

	public double sumatorio(int limite) {
		double resultadoSumatoria = 0;
		for (int i = 0; i < limite; i++) {
			resultadoSumatoria += i;
		}
		return resultadoSumatoria;
	}

	public double sumatorio(int limiteInferior, int limiteSuperior) {
		double resultadoSumatoria = 0;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultadoSumatoria += i;
		}
		return resultadoSumatoria;
	}

	public double productoria(int limite) {
		double resultadoProductoria = 1;
		for (int i = 0; i < limite; i++) {
			resultadoProductoria *= i;
		}
		return resultadoProductoria;
	}

	public double productoria(int limiteInferior, int limiteSuperior) {
		double resultadoProductoria = 1;
		for (int i = limiteInferior; i <= limiteSuperior; i++) {
			resultadoProductoria *= i;
		}
		return resultadoProductoria;
	}

	public double contarDivisores(int numero) {
		double contador = 0;
		for (int i = 0; i < numero; i++) {
			if (numero % 2 == 0)
				contador++;
			// System.out.println(i); como que devolver todos los numeros divisibles
		}
		return contador;
	}

	public int factorial(int numero) {
		int resultado = 1;
		int aux = 0;
		int contador = 0;
		if (numero == 0) {
			return 1;
		}
		aux = numero;
		do {
			// 1*5== 5*2 == 10*3==30 *4==120
			// 5*2 =10
			// 10*3=30
			// 30*4=120
			resultado *= aux;
			aux--;
			contador++;
		} while (contador != numero);
		return resultado;
	}

	public int factoriales(int num) {
		// con for
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public double calcularRaizCuadrada(double radicando) {
		double resultado = 0;
		resultado = Math.sqrt(radicando);
		return resultado;
	}

	public double calcularRaiz(double radicando, double indice) {
		double resultado = 0;
		resultado = Math.pow(radicando, (1 / indice));
		return resultado;
	}

	public double cambioSigno(double numero) {
		if (esPositivo(numero)) {
			return -(numero);
		} else if (esNegativo(numero)) {
			return -(numero);
		}
		return 0;
	}

	public double redondearNumero(Double numero) {
		Math.round(numero);
		return numero;
	}

	public int numeroRandom(int numeroMaximo) {
		return (int) Math.random() * numeroMaximo;
	}

	public double valorAbsoluto(double numero) {
		return Math.abs(numero);
	}
}
