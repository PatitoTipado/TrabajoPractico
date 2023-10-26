package ar.edu.unlam.pb1.dominio;

public class Cuenta {
	private String titular;
	private double saldo;

	public Cuenta(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}

	public Cuenta(String titular, double saldoInicial) {
		this.titular = titular;
		// saldoInicial=0;
		this.saldo = saldoInicial;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double cantidad) {
		this.saldo += cantidad;
	}

	public void retirar(double cantidad) {
		this.saldo -= cantidad;
	}

	public boolean puedeRetirar() {
		return saldo > 0;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}

}
