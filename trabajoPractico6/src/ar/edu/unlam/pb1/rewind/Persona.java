package ar.edu.unlam.pb1.rewind;

public class Persona {
	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva; // por que me sale que no esta siendo usada?

	public Persona(double peso, int edad) {
		this.peso = peso;
		this.edad = edad;
	}

	public Persona(String nombre, String genero, long dni, double peso, double altura) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.viva = true;
	}

	public int getEdad() {
		return edad;
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
		return this.edad > 18;
	}

	public boolean estaViva() {
		return viva;
	}

	public void cumplirVarios(int aniosCumplir) {
		if (aniosCumplir > 0) {
			for (int i = 0; i < aniosCumplir; i++) {
				edad++;
			}
		}
	}

	public boolean bajoPeso(Persona persona) {
		return persona.pesar() < 50;
	}

	public boolean sobrePeso(Persona persona) {
		return persona.pesar() > 150;
	}

	public boolean normalPeso(Persona persona) {
		return persona.pesar() > 50 && persona.pesar() < 150;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", dni=" + dni + ", peso=" + peso + ", altura="
				+ altura + ", edad=" + edad + "]";
	}

}
