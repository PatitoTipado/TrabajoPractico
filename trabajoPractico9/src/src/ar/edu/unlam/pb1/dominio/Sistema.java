package src.ar.edu.unlam.pb1.dominio;

import src.ar.edu.unlam.pb1.auxiliar.*;

public class Sistema {
	private String nombreSistema;
	private Persona[] usuarios;
	private String[] correos;

	public Sistema(String nombreSistema, int cantidadUsuarios) {
		this.nombreSistema = nombreSistema;
		this.usuarios = new Persona[cantidadUsuarios];
		this.correos = new String[cantidadUsuarios];
	}

	public String buscarPorCorreo(String correo) {
		int indice = 0;
		boolean encontrado = false;
		String correoEncontrado = "";
		while (indice < this.correos.length && !encontrado) {
			if (this.correos[indice] != null && correos[indice].equals(correo)) {
				correoEncontrado = correos[indice];
				encontrado = true;
			}
			indice++;
		}
		return correoEncontrado;
	}

	public String[] buscarPorNombre(String nombreBuscado) {
		int indice = 0;
		String[] nombresEncontrados = new String[usuarios.length];
		int indiceCoincidencia = 0;
		while (indice < nombresEncontrados.length) {
			if (encontrarNombre(nombreBuscado, indice)) {
				nombresEncontrados[indiceCoincidencia++] = usuarios[indice].getNombre();
			}
			indice++;
		}
		return nombresEncontrados;
	}

	private boolean encontrarNombre(String nombreBuscado, int indice) {
		return this.usuarios[indice] != null
				&& this.usuarios[indice].getNombre().toLowerCase().equals(nombreBuscado.toLowerCase());
	}

	public boolean logearUsuario(Persona usuario) {
		int indice = 0;
		boolean agregar = false;
		while (indice < usuarios.length && !agregar) {
			if (this.usuarios[indice] == null && verificarContrasenia(usuario) && verificarCorreo(usuario)) {
				this.usuarios[indice] = usuario;
				this.correos[indice] = usuario.getCorreo();
				agregar = true;
			}
			indice++;
		}
		return agregar;
	}

	private boolean validarQueNoExistaCorreo(String correo) {
		boolean esValido = true;
		for (int i = 0; i < usuarios.length && esValido; i++) {
			if (this.usuarios[i] != null && usuarios[i].getCorreo().equals(correo)) {
				esValido = false;
			}
		}
		return esValido;
	}

	public boolean verificarCorreo(Persona usuario) {
		return validarQueNoExistaCorreo(usuario.getCorreo()) && Correo.verificarCorreo(usuario.getCorreo());
	}

	public boolean verificarContrasenia(Persona usuario) {
		return Contrasenia.esFuerte(usuario.getContrasenia());
	}

	public String getNombreSistema() {
		return nombreSistema;
	}

	public Persona[] getUsuarios() {
		return usuarios;
	}

	public String[] getCorreos() {
		return correos;
	}
}
