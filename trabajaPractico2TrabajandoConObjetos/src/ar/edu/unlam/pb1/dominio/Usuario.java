package ar.edu.unlam.pb1.dominio;

public class Usuario {
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int dni;
	private int edad;
	public Usuario(String usuario, String contrasenia, String nombre, String apellido, int dni, int edad) {
		super();
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getDni() {
		return dni;
	}

	public int getEdad() {
		return edad;
	}
}
