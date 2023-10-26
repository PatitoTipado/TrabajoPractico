package src.ar.edu.unlam.pb1.dominio;

public class Jean {
	private String marca;
	private String color;
	private String talle;
	private double precio;

	public Jean(String marca, String color, String talle, int precio) {
		this.marca = marca;
		this.color = color;
		this.talle = talle;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public double getPrecio() {
		return precio;
	}

	public void aumentoDePrecioPorcentaje(Double porcentajeAumento) {
		this.precio += (precio * porcentajeAumento);
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Jean [marca=" + marca + ", color=" + color + ", talle=" + talle + ", precio=" + precio + "]";
	}

}
