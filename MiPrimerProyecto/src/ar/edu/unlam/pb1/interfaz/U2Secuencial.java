package ar.edu.unlam.pb1.interfaz;
import java.util.Scanner;
public class U2Secuencial {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 1
		System.out.println("ingrese la cantidad de horas trabajadas");
		double horaTrabajada=teclado.nextDouble();
		System.out.println("el valor por hora de un empleado");
		double valorHora=teclado.nextDouble();
		double sueldoDia=horaTrabajada*valorHora;
		System.out.println("El sueldo de ese dia es: " + sueldoDia);
/*		int cantidadDiasLaborablesSemanales= 6;
		double sueldoSemana=sueldoDia*(cantidadDiasLaborablesSemanales);
		System.out.println("A la semana: " + sueldoSemana);
		double sueldoMes=sueldoSemana*4;
		System.out.println("Al mes: " + sueldoMes);*/
		//Ejercicio 2
		System.out.println("ingrese nota 1");
		double nota=teclado.nextDouble();
		System.out.println("ingrese nota 2");
		double nota1=teclado.nextDouble();
		byte cantidadNotas=2;
		double promedioNota=(nota+nota1)/cantidadNotas;
		System.out.println("el promedio del alumno es: " + promedioNota);
		//Ejercicio 3
		System.out.println("ingrese el primer numero entero");
		double numEntero=teclado.nextDouble();
		System.out.println("ingrese el segundo numero entero");
		double numEntero1=teclado.nextDouble();
		System.out.println("La suma de los numero es igual a: " + (numEntero+numEntero1));
		System.out.println("El producto de los numero es igual a: " + (numEntero*numEntero1));
		System.out.println("El cociente de los numero es igual a: " + ((double)numEntero/numEntero1));
		System.out.println("El resto de los numero es igual a: " + (numEntero%numEntero1));
		//Ejercicio 4
		System.out.println("ingrese la medida en pies");
		float numPies=teclado.nextFloat();
		double pulgada=numPies*12;
		double yardas=numPies/3;
		double cms=(numPies/12)*2.4;
		System.out.println("num de pies: "+ numPies);
		System.out.println("num de yardas: "+ yardas);
		System.out.println("num de pulgadas: "+ pulgada);
		System.out.println("num de cms: "+ cms);
		//Ejercicio 5
		int tarrosDePintura=10;
		int tarroDe1L=tarrosDePintura/2;
		int tarroDe4L=tarrosDePintura/3;
		int tarroDe20L=tarrosDePintura-tarroDe1L-tarroDe4L;
		System.out.println("la cantidad de tarros de pintura de 1L son: " + tarroDe1L);
		System.out.println("la cantidad de tarros de pintura de 4L son: " + tarroDe4L);
		System.out.println("la cantidad de tarros de pintura de 20L son: " + tarroDe20L);
		//Ejercicio 6

	}

}
