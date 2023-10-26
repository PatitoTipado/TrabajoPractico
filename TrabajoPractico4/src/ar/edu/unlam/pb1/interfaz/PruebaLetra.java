package ar.edu.unlam.pb1.interfaz;
import ar.edu.unlam.pb1.dominio.Letra;
import java.util.Scanner;
public class PruebaLetra {
	private static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letra vocal=new Letra();
		System.out.println("ingrese una vocal");
		char letra=teclado.next().charAt(0);
		System.out.println("es vocal?: "+ vocal.esVocal(letra));
	}

}
