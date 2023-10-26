package src.ar.edu.unlam.pb1.dominio;

import src.ar.edu.unlam.pb1.auxiliar.Auto;

public class Concesionaria {
	Auto[] autosDisponibles;

	public Concesionaria(int cantidadDeAutomoviles) {
		this.autosDisponibles = new Auto[cantidadDeAutomoviles];
	}

	public Auto[] getAutosDisponibles() {
		return autosDisponibles;
	}

	public boolean sePudoCargarAuto(Auto vehiculo) {
		Integer indice = 0;
		boolean agregado = false;
		while (indice < autosDisponibles.length && !agregado) {
			if (autosDisponibles[indice] == null) {
				autosDisponibles[indice] = vehiculo;
				agregado = true;
			}
			indice++;
		}
		return agregado;
	}

	public Auto[] obtenerAutosPorModelo(String modelo) {
		int indice = 0;
		Auto[] autosPorCoincidencia = new Auto[autosDisponibles.length];
		int indiceCoincidencia = 0;
		while (indice < autosPorCoincidencia.length) {
			if (coincideModelo(modelo, indice)) {
				autosPorCoincidencia[indiceCoincidencia++] = autosDisponibles[indice];
			}
			indice++;
		}
		return autosPorCoincidencia;
	}

	private boolean coincideModelo(String modelo, int indice) {
		return this.autosDisponibles != null
				&& this.autosDisponibles[indice].getMarca().toLowerCase().contains(modelo.toLowerCase());
	}

	public Auto[] obtenerAutosPorMarca(String marca) {
		int indice = 0;
		Auto[] autosPorCoincidencia = new Auto[autosDisponibles.length];
		int indiceCoincidencia = 0;
		while (indice < autosPorCoincidencia.length) {
			if (coincidenciaMarcas(marca, indice)) {
				autosPorCoincidencia[indiceCoincidencia++] = autosDisponibles[indice];
			}
			indice++;
		}
		return autosPorCoincidencia;
	}

	private boolean coincidenciaMarcas(String marca, int indice) {
		return this.autosDisponibles != null && this.autosDisponibles[indice].getMarca().equals(marca);
	}

	public Auto[] obtenerAutosPorAnioDeFabricacion(int anioDeseado) {
		int indice = 0;
		Auto[] autosPorCoincidencia = new Auto[autosDisponibles.length];
		int indiceCoincidencia = 0;
		while (indice < autosPorCoincidencia.length) {
			if (condicionCoincidencia(anioDeseado, indice)) {
				autosPorCoincidencia[indiceCoincidencia++] = autosDisponibles[indice];
			}
			indice++;
		}
		return autosPorCoincidencia;
	}

	private boolean condicionCoincidencia(int anioDeseado, int indice) {
		return this.autosDisponibles != null && this.autosDisponibles[indice].getAnioDeFabricacion() == anioDeseado;
	}

}
