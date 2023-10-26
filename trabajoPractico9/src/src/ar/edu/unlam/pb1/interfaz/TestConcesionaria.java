package src.ar.edu.unlam.pb1.interfaz;

import src.ar.edu.unlam.pb1.dominio.Concesionaria;
import java.util.Scanner;
import src.ar.edu.unlam.pb1.auxiliar.Auto;

public class TestConcesionaria {
	private static Scanner teclado = new Scanner(System.in);
	private static Scanner teclado1 = new Scanner(System.in);
	private static boolean salir = false;
	private static Auto vehiculo;
	private static Concesionaria concesionaria;

	public static void main(String[] args) {
		instanciaConcesionaria();
		do {
			menu();
			switch (ingresarEnteroConMensaje("Selecciona alguna opcion")) {
			case 1:
				ingresarNuevoVehiculo();
				break;
			case 2:
				mostrarDetallesDeLosVehiculos();
				break;
			case 3:
				mostrarDetallesDeUnVehiculos();
				break;
			case 4:
				busquedaPorFiltro();
				break;
			case 5:
				salir = deseaSalir();
				break;
			}
		} while (!salir);
		mensajeSalir();
	}

	private static void busquedaPorFiltro() {
		menuFiltro();
		switch (ingresarEnteroConMensaje("ingrese un numero entre las opciones")) {
		case 1:
			buscarPorAnioDeFabricacion();
			break;
		case 2:
			buscarPorMarca();
			break;
		case 3:
			buscarPorModelo();
			break;
		case 4:
			mostrarDetallesDeUnVehiculos();
			break;
		}
	}

	private static void menuFiltro() {
		mostrarMensaje("1. Buscar por anio de fabricacion");
		mostrarMensaje("2. Buscar por marcas");
		mostrarMensaje("3. Buscar por modelos");
		mostrarMensaje("4. Buscar por ID en el array");
	}

	private static void buscarPorAnioDeFabricacion() {
		int anioDeseado = ingresarEnteroConMensaje("ingrese el anio deseado");
		int indice = 0;
		while (indice < concesionaria.obtenerAutosPorAnioDeFabricacion(anioDeseado).length) {
			if (concesionaria.obtenerAutosPorAnioDeFabricacion(anioDeseado)[indice] != null) {
				mostrarMensaje(concesionaria.obtenerAutosPorAnioDeFabricacion(anioDeseado)[indice].toString());
			}
			indice++;
		}
	}

	private static void buscarPorModelo() {
		String modelo = ingresarStringConMensaje("ingrese la marca");
		int indice = 0;
		while (indice < concesionaria.obtenerAutosPorMarca(modelo).length) {
			if (concesionaria.obtenerAutosPorMarca(modelo)[indice] != null) {
				mostrarMensaje(concesionaria.obtenerAutosPorMarca(modelo)[indice].toString());
			}
			indice++;
		}
	}

	private static void buscarPorMarca() {
		String marca = ingresarStringConMensaje("ingrese la marca");
		int indice = 0;
		while (indice < concesionaria.obtenerAutosPorMarca(marca).length) {
			if (concesionaria.obtenerAutosPorMarca(marca)[indice] != null) {
				mostrarMensaje(concesionaria.obtenerAutosPorMarca(marca)[indice].toString());
			}
			indice++;
		}
	}

	private static void instanciaConcesionaria() {
		concesionaria = new Concesionaria(ingresarEnteroConMensaje("Ingrese la cantidad de autos puede almacenar"));
	}

	private static void ingresarNuevoVehiculo() {
		String modelo = ingresarStringConMensaje("Ingrese el modelo");
		String marca = ingresarStringConMensaje("Ingrese la marca");
		int anioDeFabriacion = ingresarEnteroConMensaje("Ingrese el anio de fabricacion");
		int precio = ingresarEnteroConMensaje("Ingrese el precio del vehiculo");
		vehiculo = new Auto(modelo, marca, anioDeFabriacion, precio);
		if (concesionaria.sePudoCargarAuto(vehiculo)) {
			mostrarMensaje("Se pudo cargar el auto");
		} else {
			mostrarMensaje("No se pudo cargar el auto");
		}
	}

	private static void mostrarDetallesDeLosVehiculos() {
		mostrarMensaje("Los vehiculos dentro de la concesionaria son: ");
		for (int i = 0; i < concesionaria.getAutosDisponibles().length; i++) {
			if (concesionaria.getAutosDisponibles()[i] != null) {
				mostrarMensaje("\n\n" + i + ". " + concesionaria.getAutosDisponibles()[i].toString());
			}
		}
	}

	private static void mostrarDetallesDeUnVehiculos() {
		mostrarDetallesDeLosVehiculos();
		int posicion = ingresarEnteroConMensaje(
				"ingrese la ID (indice del array) del vehiculo que quiere ver detalles");
		esUnaPosicionAdmitida(posicion);
		if (concesionaria.getAutosDisponibles()[posicion] != null) {
			mostrarMensaje("El auto mencionado tiene tales caracteristicas: ");
			mostrarMensaje("[" + posicion + "] " + concesionaria.getAutosDisponibles()[posicion].toString());
		}
	}

	private static boolean esUnaPosicionAdmitida(int posicion) {
		return posicion > 0 && posicion < concesionaria.getAutosDisponibles().length;
	}

	private static boolean deseaSalir() {
		int numero = ingresarEnteroConMensaje(
				"Si desea salir ingrese 0 \nSi desea seguir ingrese cualquier otro numero");
		return numero == 0;
	}

	private static void menu() {
		mostrarMensaje("1. Ingresar un nuevo vehiculo");
		mostrarMensaje("2. mostrar lista de veihiculos");
		mostrarMensaje("3. mostrar detalles de un vehiculo en particular");
		mostrarMensaje("4. filtrar vehiculos por anio de fabricacion");
		mostrarMensaje("5. Salir");
	}

	private static void mensajeSalir() {
		mostrarMensaje("Salio del menu");
	}

	private static String ingresarStringConMensaje(String mensaje) {
		mostrarMensaje(mensaje);
		return teclado1.next().toUpperCase();
	}

	private static void mostrarMensaje(String mensaje) {
		System.out.println("\n\n" + mensaje);
	}

//	private static void mostrarMensajeSinEspacios(String mensaje) {
//		System.out.println(mensaje);
//	}

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
