package ar.edu.unlam.pb1.dominio;

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

	public double calcularAreaCirculo(double radio) {
		double resultado = PI * (Math.pow(radio, 2));
		return resultado;
	}

	public boolean esPositivo(double a) {
		return a > 0;
	}

	public double potencia(double base, double exponente) {
		double resultadoPotencia = 1;
		if (exponente < 0) {
			exponente = -(exponente);
			for (int i = 0; i < exponente; i++) {
				resultadoPotencia *= base;
			}
			return 1 / resultadoPotencia; //termina aca, por que ya tiene algo que retornar
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

}
