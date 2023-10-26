package src.ar.edu.unlam.pb1.test;

import java.util.Scanner;

public class Test {
	private static Scanner teclado = new Scanner(System.in);
	private static Scanner teclado1 = new Scanner(System.in);

	public static void main(String[] args) {
		// Ejercicio 1
		int valorEntero = ingresarEnteroConMensaje("Ingrese un valor entero");
		int pruebaArray[] = new int[valorEntero];
		if (valorEntero != 0) {
			for (int i = 0; i < valorEntero; i++) {
				pruebaArray[i] = ingresarEnteroConMensaje("ingrese un valor para el array");
				mostrarMensaje("En la posicion: " + i + " se encuentra el valor: " + pruebaArray[i]);
				mostrarMensaje("--------------------------------------------------------------");
			}
		}
		// ejercicio 2
		int ingresarTamanio = ingresarEnteroConMensaje("Ingrese un valor entero para random");
		int arrayRandom[] = new int[ingresarTamanio];
		if (ingresarTamanio != 0) {
			for (int i = 0; i < ingresarTamanio; i++) {
				arrayRandom[i] = (int) (Math.random() * 100);
				mostrarMensaje("En la posicion: " + i + " se encuentra el valor: " + arrayRandom[i]);
				mostrarMensaje("--------------------------------------------------------------");
			}
		}
		// ejercicio 3
		Character letras[] = new Character[26];
		abecedario(letras);
		boolean salir = false;
		// if (valorEntero != 0) {
		do {
			System.out.println("Ingrese una letra");
			Character letra = teclado.next().toUpperCase().charAt(0);
			for (int i = 0; i < letras.length; i++) {
				if (letras[i].equals(letra)) {
					System.out.println("La letra elegida es: " + letras[i] + " en la posicion " + i);
				}
			}
			salir = deseaSalir();
		} while (!salir);
		// }
		// Ejercicio 4
		int cantidadAlumnos = ingresarEnteroConMensaje("¿Cuantos alumnos queres cargar?");
		String nombreAlumnos[] = new String[cantidadAlumnos];
		int cantidadDeNotas = ingresarEnteroConMensaje("¿Cuantas notas cargara?");
		double notasAlumnos[][] = new double[cantidadAlumnos][cantidadDeNotas];
		cargarNotasAlumnos(nombreAlumnos, notasAlumnos, cantidadDeNotas);
		mostrarArray(nombreAlumnos, notasAlumnos, cantidadDeNotas);
		// Ejercicio 5
		
	}

	private static void mostrarArray(String[] nombreAlumnos, double[][] notasAlumnos, int cantidadDeNotas) {
		double sumatoriaNotas = 0;
		for (int i = 0; i < nombreAlumnos.length; i++) {
			mostrarMensaje("----------------------------------------------");
			mostrarMensaje("El nombre del alumno es: " + nombreAlumnos[i]);
			for (int j = 0; j < cantidadDeNotas; j++) {
				sumatoriaNotas += notasAlumnos[i][j];
				System.out.print("[" + notasAlumnos[i][j] + "]" + " ");
			}
			calcularCondicion(sumatoriaNotas, cantidadDeNotas);
			sumatoriaNotas = 0;
		}
	}

	private static void calcularCondicion(double sumatoriaNotas, int cantidadDeNotas) {
		boolean aprobado = (sumatoriaNotas / cantidadDeNotas) >= 4 && (sumatoriaNotas / cantidadDeNotas) < 7;
		boolean desaprobado = (sumatoriaNotas / cantidadDeNotas) < 4 && (sumatoriaNotas / cantidadDeNotas) >= 0;
		boolean promocionado = (sumatoriaNotas / cantidadDeNotas) >= 7 && (sumatoriaNotas / cantidadDeNotas) <= 10;
		if (aprobado) {
			mostrarMensaje("La condicion del alumno es aprobado: " + aprobado);
		} else if (desaprobado) {
			mostrarMensaje("La condicion del alumno es desaprobo: " + desaprobado);
		} else if (promocionado) {
			mostrarMensaje("La condicion del alumno es promocinado: " + promocionado);
		} else {
			mostrarMensaje("tiene un error con la condicion");
		}
	}

	private static void cargarNotasAlumnos(String nombreAlumnos[], double notasAlumnos[][], int cantidadDeNotas) {
		for (int i = 0; i < nombreAlumnos.length; i++) {
			mostrarMensaje("ingrese el nombre del alumno");
			nombreAlumnos[i] = teclado1.nextLine();
			for (int j = 0; j < (cantidadDeNotas); j++) {
				do {
					notasAlumnos[i][j] = ingresarDoubleConMensaje("ingrese la nota del alumno");
				} while (notasAlumnos[i][j] < 0 || notasAlumnos[i][j] > 10);
			}
		}
	}

	private static void abecedario(Character letras[]) {
		Character letraInicial = 65;
		for (int i = 0; i < letras.length; i++) {
			letras[i] = letraInicial++;
		}
	}

	private static boolean deseaSalir() {
		int numero = ingresarEnteroConMensaje(
				"Si desea salir ingrese 0 \nSi desea seguir ingrese cualquier otro numero");
		return numero == 0;
	}

//	private static void menu() {
//		mostrarMensaje("1. Los valores maximo para peso son de 200kg");
//		mostrarMensaje("2. Los valores maximo para edad son de 120 años de edad");
//	}

//	private static void mensajeSalir() {
//		mostrarMensaje("Salio del menu");
//	}

	/*
	 * private static String mensaje() { return teclado.next(); }
	 */

	private static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	private static void mostrarMensajeError(String mensaje) {
		System.err.println(mensaje);
	}

	private static int ingresarEnteroConMensaje(String mensaje) {
		mostrarMensaje(mensaje);
		while (!teclado.hasNextInt()) {
			mostrarMensaje(mensaje);
			mostrarMensajeError("Ingrese un numero entero");
			teclado.nextLine();
		}
		return teclado.nextInt();
	}

	private static double ingresarDoubleConMensaje(String mensaje) {
		mostrarMensaje(mensaje);
		while (!teclado.hasNextDouble()) {
			mostrarMensaje(mensaje);
			mostrarMensajeError("Ingrese un numero entero");
			teclado.nextLine();
		}
		return teclado.nextDouble();
	}

}
