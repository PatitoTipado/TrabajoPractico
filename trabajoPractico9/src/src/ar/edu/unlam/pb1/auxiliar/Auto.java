package src.ar.edu.unlam.pb1.auxiliar;

public class Auto {
	private String marca;
	private String modelo;
	private int anioDeFabricacion;
	private int precio;

	public Auto(String marca, String modelo, int anioDeFabricacion, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anioDeFabricacion = anioDeFabricacion;
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioDeFabricacion() {
		return anioDeFabricacion;
	}

	public void setAnioDeFabricacion(int anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", anioDeFabricacion=" + anioDeFabricacion + ", precio="
				+ precio + "]";
	}

}
