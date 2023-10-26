package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;

public class PruebaAscii {
	static private Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int cantidadDeVueltas=ingresarEnteroConMensaje("asigna la cantidad de veces que quieras ingresar un tipo ascii");
		vueltasAscii(cantidadDeVueltas);
/*		boolean salir = false;
		int num = ingresarEnteroConMensaje("ingrese un numero");
		mostrarMensaje("" + num);
		while (!salir) {
			if (num == 47) {
				System.out.println("Caracteres numericos: ");
			}
			if (num >= 48 && num <= 57) {
				System.out.print(num);
				if (num < 57) {
					System.out.print(", ");
				} else {
					System.out.println("");
				}
			}
			if (num == 64) {
				System.out.println("Letras mayuculas: ");
			}
			if (num >= 65 && num <= 90) {
				System.out.print(num);
				if (num < 90) {
					System.out.print(", ");
				} else {
					System.out.println("");
				}
			}
			if (num == 96) {
				System.out.println("Letras minusculas: ");
			}
			if (num >= 97 && num <= 122) {
				System.out.print(num);
				if (num < 122) {
					System.out.print(", ");
				} else {
					System.out.println("");
				}
			}
			if (num == 126) {
				System.out.println("Letras minusculas: ");
			}
			if (num >= 127 && num <= 166) {
				System.out.print(num);
				if (num < 166) {
					System.out.print(", ");
				} else {
					System.out.println("");
				}
			}

			salir = num > 166;
			num++;
		}*/

	}
	public static void vueltasAscii(int vueltas) {
		for (int i = 0; i < vueltas; i++) {
			int limiteInf=ingresarEnteroConMensaje("asignar limite inf");
			int limiteSup=ingresarEnteroConMensaje("asignar limite sup");
			mostrarMensaje("ingrese el mensaje a asignar");
			String mensaje= mensaje();
			ascii(limiteInf, limiteSup,mensaje);
		} 
	}

	public static void ascii(int limiteInf, int limiteSuperior, String mensaje) {
		char num = 0;
		boolean salir = false;
		while (!salir) {
			if (num == (limiteInf - 1)) {
				mostrarMensaje(mensaje);
			}
			if (num >= limiteInf && num <= limiteSuperior) {
				System.out.print(num);
				if (num < limiteSuperior) {
					System.out.print(", ");
				} else {
					mostrarMensaje("");
				}
			}
			num++;
			salir = num > limiteSuperior;
		}
	}

	private static String mensaje() {
		return teclado.next();
	}

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
}
