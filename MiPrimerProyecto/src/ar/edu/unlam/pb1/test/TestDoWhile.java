package ar.edu.unlam.pb1.test;

import java.util.Scanner;

public class TestDoWhile {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int num = 0;
		do {
			System.out.println("ingresa el numero");
			num = teclado.nextInt();
		} while (!(num > 1 && num < 10));
	}
}
