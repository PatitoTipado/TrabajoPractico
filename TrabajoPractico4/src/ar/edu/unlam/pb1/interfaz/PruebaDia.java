package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.Dia;
import ar.edu.unlam.pb1.dominio.DiasDeSemana;

import java.util.Scanner;

public class PruebaDia {
	public static void main(String[] args) {
		Dia dia = new Dia();
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("ingrese un numero de dia");
		String diaIngresado = teclado1.next();
		DiasDeSemana opcion = DiasDeSemana.valueOf(diaIngresado);
		System.out.println("dia de la semana: " + dia.dias(opcion));
		teclado1.close();
	}
}
