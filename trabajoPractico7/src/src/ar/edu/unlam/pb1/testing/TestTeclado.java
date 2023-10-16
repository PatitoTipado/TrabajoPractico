package src.ar.edu.unlam.pb1.testing;

public class TestTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor = Teclado.readInt("");
		System.out.println(valor);
		Teclado.close();
		valor=Teclado.readInt("");
	}

}
