package src.ar.edu.unlam.pb1.auxiliar;

public class Persona {
	// String
	private String nombre;
	private String genero;
	private String correo;
	private String contrasenia;
	// numericos
	private int saldo;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private int vidas;
	// bolean
	private boolean viva;

	public Persona(String nombre) {
		this.nombre = nombre;
		this.vidas = 2;
	}

	public Persona(String correo, String contrasenia) {
		this.correo = correo;
		this.contrasenia = contrasenia;
	}

	// test
	public Persona() {
		this.nombre = "pablito";
		this.genero = "pablito";
		this.saldo = 10000;
		this.dni = 42987765;
		this.peso = 78;
		this.altura = 1.70;
		this.edad = 20;
		this.viva = true;
		this.vidas = 2;
		this.contrasenia = "P54231unlam";
		this.correo = "pablito@unlam.com";
	}

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

	public void pierdeUnaVida() {
		this.vidas--;
	}

	public int getEdad() {
		return edad;
	}

	public void alimentar(double kilos) {
		if (this.viva) {
			this.peso += kilos;
		}
	}

	public int getVidas() {
		return vidas;
	}

	public void crecer(double metros) {
		if (this.viva) {
			this.altura += metros;
		}
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", saldo=" + saldo + ", dni=" + dni + ", vidas=" + vidas + "]";
	}

}
