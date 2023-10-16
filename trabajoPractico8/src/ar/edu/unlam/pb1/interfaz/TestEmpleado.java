package ar.edu.unlam.pb1.interfaz;

import java.time.LocalDate;
import ar.edu.unlam.pb1.dominio.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado mati = new Empleado(2010, 5, 1);
		LocalDate fecha = mati.getFechaActual();
		LocalDate ingreso = mati.getFechaDeIngreso();
		System.out.println("Dia de hoy: " + fecha);
		System.out.println("Dia de ingreso: " + ingreso);
		System.out.println("La cantidad de vacacion: " + mati.calcularDiasDeVacaciones());

	}

}
