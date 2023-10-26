package ar.edu.unlam.pb1.interfaz;

import ar.edu.unlam.pb1.dominio.DiscoRigido;

public class PruebaDiscoRigido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscoRigido prubea= new DiscoRigido(45);
		DiscoRigido seagate = new DiscoRigido(10240);
		DiscoRigido hitachi = new DiscoRigido(20480);
		DiscoRigido westerDigital = new DiscoRigido(32768);
		DiscoRigido toshiba = new DiscoRigido(49152);

		System.out.println(prubea.cuantosBlueRay());
		System.out.println(seagate.cuantosBlueRay());
		System.out.println(hitachi.cuantosDvd());
		System.out.println(toshiba.cuantosBlueRay());
		System.out.println(westerDigital.cuantosDvd());
	}
}
