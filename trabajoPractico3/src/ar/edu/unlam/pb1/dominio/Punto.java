package ar.edu.unlam.pb1.dominio;

public class Punto {
	private double coordenadaX;
	private double coordenadaY;
	public Punto(double coordenadaX, double coordenadaY) {
		this.coordenadaX=coordenadaX;
		this.coordenadaY=coordenadaY;
	}
	public double getCoordenadasX() {
		return coordenadaX;
	}
	public void setCoordenadasX(double coordenadasX) {
		this.coordenadaX = coordenadasX;
	}
	public double getCoordenadasY() {
		return coordenadaY;
	}
	public void setCoordenadasY(double coordenadasY) {
		this.coordenadaY = coordenadasY;
	}
	public boolean estaSobreEjeX() {
		return coordenadaY==0 &&coordenadaX !=0;
	}
	public boolean estaSobreEjeY() {
		return coordenadaX==0 &&coordenadaY !=0;
	}
	public boolean estaSobreElOrigenDeCoordenadas() {
		return coordenadaX==0 && coordenadaY==0;
	}

}
