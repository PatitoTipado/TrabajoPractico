package ar.edu.unlam.pb1.rewind;
import java.util.Scanner;
public class PruebaDia {
	public static void main(String[] args) {
		Dia dia=new Dia();
		Scanner teclado1=new Scanner(System.in);
		System.out.println("ingrese un numero de dia");
		String diaOpcion= teclado1.next();
		DiasDeSemana opcion = DiasDeSemana.valueOf(diaOpcion.toUpperCase());
		System.out.println("dia de la semana: "+ dia.dias(opcion));
		teclado1.close();
	}
}
