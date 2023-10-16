package ar.edu.unlam.pb1.dominio;

import java.time.*;

public class Empleado {

	private LocalDate fechaDeIngreso;
	private LocalDate fechaActual = LocalDate.now();
	private int diasDeVacaciones;

	public Empleado(int ingresoAño, int ingresoMes, int ingresoDia) {
		fechaDeIngreso = LocalDate.of(ingresoAño, ingresoMes, ingresoDia);
	}

	public int calcularDiasDeVacaciones() {
		// Después de 6 meses y menos de 5 años
		if (antiguedadMayorASeisMeses()) {
			return 14;
		}
		// Después de 5 años y menos de 10 años
		else if (antiguedadMayorACincoAnios()) {
			return 21;
		}
		// Más de 10 años
		else if (antiguedadMayorADiezAnios()) {
			return 28;
		}
		// Menos de 6 meses o casos error
		else {
			return 0;
		}
	}

	private boolean antiguedadMayorADiezAnios() {
		return fechaActual.getYear() - fechaDeIngreso.getYear() >= 10;
	}

	private boolean antiguedadMayorACincoAnios() {
		return fechaActual.getYear() - fechaDeIngreso.getYear() >= 5
				&& fechaActual.getYear() - fechaDeIngreso.getYear() < 10;
	}

	private boolean antiguedadMayorASeisMeses() {
		return fechaActual.getMonthValue() - fechaDeIngreso.getMonthValue() >= 6
				&& fechaActual.getYear() - fechaDeIngreso.getYear() < 5;
	}

	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public int getDiasDeVacaciones() {
		return diasDeVacaciones;
	}

	public LocalDate getFechaActual() {
		return fechaActual;
	}
}
