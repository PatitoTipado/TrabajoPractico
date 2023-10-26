package ar.edu.unlam.pb1.dominio;

public class Coche {

	private final int CERO_KM = 0; // ¿debian iniciarse con un valor?
	private final int ANIO_ACTUAL = 2023;
	private static int cantidadCoches;
	private String marca;
	private String modelo;
	private int kilometrosActuales;
	private int anioDeFabricacion;
	private double precio;

	public Coche(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		cantidadCoches++;
	}

	public Coche(String marca, String modelo, int kilometros, int anio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		cantidadCoches++;
	}

	public static int getCantidadDeCoches() {
		return cantidadCoches;
	}

	public void setKilometrosActuales(int kilometros) {
		this.kilometrosActuales += kilometros;
	}

	public void setPrecio(double precio) {
		this.precio += precio;
	}

	public double getPrecio() {
		return this.precio;
	}

	public int calcularAntiguedad() {
		int antiguedad = ANIO_ACTUAL - this.anioDeFabricacion;
		return antiguedad;
	}

	public int getkilometros() {
		return this.kilometrosActuales;
	}

	public int getCERO_KM() {
		return CERO_KM;
	}

	public int getANIO_ACTUAL() {
		return ANIO_ACTUAL;
	}

	public static int getCantidadCoches() {
		return cantidadCoches;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getKilometrosActuales() {
		return kilometrosActuales;
	}

	public int getAnioDeFabricacion() {
		return anioDeFabricacion;
	}
}
