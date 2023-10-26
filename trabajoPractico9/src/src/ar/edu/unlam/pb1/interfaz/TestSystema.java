package src.ar.edu.unlam.pb1.interfaz;

import java.util.Scanner;
import src.ar.edu.unlam.pb1.auxiliar.Persona;
import src.ar.edu.unlam.pb1.dominio.Sistema;

public class TestSystema {
	private static Scanner teclado = new Scanner(System.in);
	private static Scanner teclado1 = new Scanner(System.in);
	private static Sistema sistemaUnlam;
	private static boolean salir = false;

	public static void main(String[] args) {
		configurarElSistema();
		do {
			menu();
			switch (ingresarEnteroConMensaje("Ingrese una opcion")) {
			case 1:
				agregarUsuarioAlSistema();
				break;
			case 2:
				buscarUsuario();
				break;
			case 3:
				salir = deseaSalir();
				break;
			}
		} while (!salir);
	}

	private static void buscarUsuario() {
		String correo = ingresarStringConMensaje("Ingrese el correo a buscar");
		mostrarMensaje("El correo existe: ");
		mostrarMensaje(sistemaUnlam.buscarPorCorreo(correo));
	}

	private static void agregarUsuarioAlSistema() {
		Persona usuario = new Persona("pablito@unlam.com", "P4231mauri");
		if (sistemaUnlam.logearUsuario(usuario)) {
			mostrarMensajeConSeparacion("Se pudo logear");
		} else {
			mostrarMensajeConSeparacion("No se pudo logear");
			mostrarMensajeConSeparacion("su correo es: " + sistemaUnlam.verificarCorreo(usuario));
			mostrarMensajeConSeparacion("su contraseña es: " + sistemaUnlam.verificarContrasenia(usuario));
		}

	}

	private static void configurarElSistema() {
		String nombreSistema = ingresarStringConMensaje("Ingrese el nombre del sistema: ");
		int ingreseCantidad = ingresarEnteroConMensaje("Ingresar la cantidad de personas");
		sistemaUnlam = new Sistema(nombreSistema, ingreseCantidad);
	}

	private static void menu() {
		mostrarMensaje("1. Ingresar el nombre del sistema");
		mostrarMensaje("2. Agregar usuarios al sistema");
		mostrarMensaje("3. buscar usuario");
		mostrarMensaje("4. Ingrese cualquier otro numero para salir");
	}

	private static boolean deseaSalir() {
		int numero = ingresarEnteroConMensaje(
				"Si desea salir ingrese 0 \nSi desea seguir ingrese cualquier otro numero");
		if (numero == 0) {
			mensajeSalir();
		}
		return numero == 0;
	}

	private static void mensajeSalir() {
		mostrarMensaje("Salio del menu");
	}

	private static String ingresarStringConMensaje(String mensaje) {
		mostrarMensaje(mensaje);
		return teclado1.next().toLowerCase();
	}

	private static void mostrarMensajeConSeparacion(String mensaje) {
		System.out.println("\n" + mensaje + "\n");
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
			mostrarMensajeConSeparacion(mensaje);
			mostrarMensajeError("Ingrese un numero entero");
			teclado.nextLine();
		}
		return teclado.nextInt();
	}

}
