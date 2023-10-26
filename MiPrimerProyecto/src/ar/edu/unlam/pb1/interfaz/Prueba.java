package ar.edu.unlam.pb1.interfaz;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacidadHdd=1; //expresada en tera
		double capacidadDvd=8.5; //expresado en giga
		double capacidadBlueray=25.0; //expresado en giga
		int capacidadDeDvdsParaBackupearHdd;
		int capacidadDeBlueraysParaBackupearHdd;
		
		int conversionDeUnidad=1024;
		
		capacidadDeDvdsParaBackupearHdd=((capacidadHdd*conversionDeUnidad)/(int)capacidadDvd);
		capacidadDeBlueraysParaBackupearHdd=((capacidadHdd*conversionDeUnidad)/(int)capacidadBlueray);
		System.out.println("cantidad de dvds: " + (capacidadDeDvdsParaBackupearHdd+1));
		System.out.println("cantidad de bluerays: " + (capacidadDeBlueraysParaBackupearHdd+1));
	}

}
