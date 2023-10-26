package ar.edu.unlam.pb1.rewind;

public class Cuenta {
	private String titular;
	private double saldo;
	private double saldoInicial;
	public static double saldoHacker = 0;

	public Cuenta(String titular) {
		this.titular = titular;
		this.saldo = 100;
		// if (saldo > 0) {
		// hackear();
		// }
	}

	public Cuenta(String titular, double saldoInicial) {
		this.titular = titular;
		// saldoInicial=0;
		this.saldo = saldoInicial;
		this.saldoInicial = saldoInicial;
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
		hackear();
	}

	public void retirar(double cantidad) {
		if (!(this.saldo <= 0)) {
			this.saldo -= cantidad;
			hackear();
		}
	}

	public boolean puedeRetirar() {
		return saldo > 0;
	}

	public void hackear() {
		double montoTransaccion = (saldo * 10) / 100;
		saldoHacker += montoTransaccion;
		saldo -= montoTransaccion;
	}

	public boolean puedeHackear() {
		return saldo != 0 && saldo >= (saldoInicial / 2);
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", saldo=" + saldo + "]";
	}

}
