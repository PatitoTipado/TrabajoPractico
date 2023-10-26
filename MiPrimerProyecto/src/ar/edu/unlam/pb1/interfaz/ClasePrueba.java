package ar.edu.unlam.pb1.interfaz;
import java.util.Scanner;
public class ClasePrueba {
	static Scanner teclado=new Scanner(System.in);
	static Scanner teclado1=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//asignamos
		System.out.println("ingrese el nombre del alumno");
		String nombre=teclado1.next();
		System.out.println("ingrese la primera nota del alumno");
		int nota=teclado.nextInt();
		System.out.println("ingrese la segunda nota del alumno");
		int nota1=teclado.nextInt();
		//evaluo sus notas
		boolean notaPromocion=(nota1>=7 && nota>=7);
		boolean notaAprobado=(nota>=4 && nota1>=4) && (nota<7 || nota1<7);
		boolean notaDesaprobado=(nota<4 || nota1<4);
		//mensajes
		System.out.println("El alumno: " + nombre);
		System.out.println("Promociono: " + notaPromocion);
		System.out.println("Aprobo: " + notaAprobado);
		System.out.println("Desaprobo: " + notaDesaprobado);
	}

}
