package ar.edu.unlam.pb1.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadorPares = 0;
		int acumulador = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				contadorPares++;
				acumulador += i;

			}
		}
		System.out.println("la cantidad de numeros pares son: " + contadorPares);
		System.out.println("el numero acumulado: " + acumulador);

		//boolean test = (1 > 1 && 1 > 1) == 1 > 1;
		// 			   false == false ---> falso es igual a falso es verdadero? 
		// solo acepta valores V o F
		//System.out.println(test);
	}
}
