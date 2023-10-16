package src.ar.edu.unlam.pb1.testing;

import java.util.Scanner;

public class Teclado {
	private static Scanner teclado = new Scanner(System.in);

	private Teclado() {
		teclado = new Scanner(System.in);
	}
	//private static Scanner aux() {
	// return 
	//}

	public static int readInt(String msj) {
		boolean error = false;
		int valor = 0;
		do {
			try {
				if (!msj.trim().equals("")) {
					System.out.println(msj);
				}
				valor = teclado.nextInt();
				error = false;
			} catch (Exception e) {
				System.err.println("Solo debe ingresar enteros");
				error = true;
				teclado.next();
			}
		} while (error);
		return valor;
	}
	public static void close() {
		teclado.close();
	}
//	public static void open() {
//		//no se puede volver a abrir el scanner.
//		//tendriamos que crear un flujo de entrada o llamarlo
//		//y luego tendriamos que asociar a ese flujo de entrada
//		//al scanner, ya que no cerramos la clase, cerramos el flujo
//		teclado=null;
//		Teclado teclado=new Teclado();
//	}
}
