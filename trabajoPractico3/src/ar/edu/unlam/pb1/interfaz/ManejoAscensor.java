package ar.edu.unlam.pb1.interfaz;
import ar.edu.unlam.pb1.dominio.Ascensor;
import ar.edu.unlam.pb1.auxiliar.Persona;
public class ManejoAscensor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascensor consorcioCallePeron=new Ascensor(4,150);
		System.out.println("Piso actual: " + consorcioCallePeron.getPisoActual());
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		System.out.println("Piso actual: " + consorcioCallePeron.getPisoActual());
		Persona pepe=new Persona("","",1,60,1);
		Persona armando=new Persona("","",1,90,1);
		Persona carolina=new Persona("","",1,80,1);
		consorcioCallePeron.abrirPuerta();
		consorcioCallePeron.ingresar(carolina);
		consorcioCallePeron.ingresar(pepe);
		consorcioCallePeron.ingresar(armando);
		consorcioCallePeron.subir();
		System.out.println("Piso actual: " + consorcioCallePeron.getPisoActual());
		consorcioCallePeron.salir(carolina);
		consorcioCallePeron.subir();
		System.out.println("Piso actual: " + consorcioCallePeron.getPisoActual());
		
	}

}
