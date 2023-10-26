package ar.edu.unlam.pb1.auxiliar;

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva; //por que me sale que no esta siendo usada?

	public Persona(String nombre, String genero, long dni, double peso, double altura) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.viva = true;
	}

	public void alimentar(double kilos) {
		if (this.viva) {
			this.peso += kilos;
		}
	}

	public void crecer(double metros) {
		if (this.viva) {
			this.altura += metros;
		}
	}

	public void cumpliranios() {
		this.edad++;
	}

	public void morir() {
		this.viva = false;
	}

	public double pesar() {
		return peso;
	}

	public double medir() {
		return altura;
	}
	public boolean esMayorDeEdad() {
		return this.edad>18;
	}
	public boolean estaViva() {
		return viva;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", dni=" + dni + ", peso=" + peso + ", altura="
				+ altura + ", edad=" + edad + "]";
	}

}
