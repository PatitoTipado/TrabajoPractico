package ar.edu.unlam.pb1.interfaz;

public class PruebaConEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.a almacena una variable entera el valor maximo que soporta dicho tipo de
		// dato
		//declaracion e inicializacion del dato, con impresion
		int dato = 2147483647;
		System.out.println(dato);
		// 2.c incrementa el valor guardado en la variable e impresion
		dato++;
		System.out.println(dato);
		// 2.e Cambia de signo por que no puede almacenar ese tipo de valor, desborda y lo intenta
		// representar de alguna forma.
		// para solucionarlo, podriamos cambiarlo por un tipo de dato mas grande,
		// atraves de estructuras condicionales o imprimirlo directamente por pantalla a
		// esto atraves de un string
		System.out.println("2147483648");
		//declaracion e inicializacion del dato, con impresion
		byte enteroChico=127;
		System.out.println(enteroChico);
		// 2.c incrementa el valor guardado en la variable e impresion
		enteroChico++;
		System.out.println(enteroChico);
		//char no representa datos numericos, pero se podria representar su mayor valor por el codigo ascii
		char ascii=255;
		System.out.println(ascii);
		//incremento
		ascii++;
		System.out.println(ascii);
		//declaracion
		short mediano=32767;
		System.out.println(mediano);
		//incremento
		mediano++;
		System.out.println(mediano);
		//declaracion
		long grande=9223372036854775807l;
		System.out.println(grande);
		//incremento
		grande++;
		System.out.println(grande);
		enteroChico+=30;
		System.out.println(enteroChico);
	}
}
