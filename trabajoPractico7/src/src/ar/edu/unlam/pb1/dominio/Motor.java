package src.ar.edu.unlam.pb1.dominio;

public class Motor {
	private int bomba;
	private String tipoFluido;
	private String combustible;

	public Motor(int bomba, String tipoFluido, String combustible) {
		super();
		this.bomba = bomba;
		this.tipoFluido = tipoFluido;
		this.combustible = combustible;
	}

	public int getBomba() {
		return bomba;
	}

	public void setBomba(int bomba) {
		this.bomba = bomba;
	}

	public String getTipoFluido() {
		return tipoFluido;
	}

	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String dimeTipoMotor(int opcion) {
		switch (opcion) {
		case 0:
			return "no hay establecido un valor definido para este tipo de bomba";
		case 1:
			return "la bomba es una bomba de agua";
		case 2:
			return "la bomba es una bomba de gasolina";
		case 3:
			return "la bomba es una bomba de hormigon";
		case 4:
			return "la bomba es una bomba de pasta alimenticia";
		default:
			return "no existe un valor valido para este tipo de bomba";
		}
	}
}
