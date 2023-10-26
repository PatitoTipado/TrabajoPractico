package ar.edu.unlam.pb1.interfaz;

public class ConcatenandoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saludo;
		saludo = "buenos dias";
		String nombre = "pepe";
		System.out.println(saludo + " " + nombre);
		//prueba, para verificar
		int variable=0;
		int var1=0;
		int num=5;
		int num1=5;
		//pre
		var1=++num*2;
		System.out.println(var1);
		//post
		variable=num1++*2;
		System.out.println(variable);
		//valor luego de incrementar
		System.out.println(num1);
		//pruebas con casteos
		byte numero=8;
		byte numero1=8;
		byte resultado= (byte)(numero/numero1);
		System.out.println(resultado);
		int numero2=20;
		int numero3=11;
		double resultara= (numero2/(double)numero3);
		System.out.println(resultara);
		

	}
}
