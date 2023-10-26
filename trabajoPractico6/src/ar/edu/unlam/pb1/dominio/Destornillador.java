package ar.edu.unlam.pb1.dominio;

public class Destornillador {
	private final char TIPO_DE_CABEZA;

	public Destornillador(char tipoDeCabeza) {
		switch (tipoDeCabeza) {
		case 'P':
			this.TIPO_DE_CABEZA = 'P';
			break;
		case 'H':
			this.TIPO_DE_CABEZA = 'H';
			break;
		case 'A':
			this.TIPO_DE_CABEZA = 'A';
			break;
		default:
			this.TIPO_DE_CABEZA = tipoDeCabeza;
			break;
		}
	}

	public void desatornillar(Tornillo tornillo) {
		if (sonIguales(tornillo)) {
			tornillo.girar('a');
		}
	}

	public void atornillar(Tornillo tornillo) {
		if (sonIguales(tornillo)) {
			tornillo.girar('h');
		}
	}

	public void desatornillar(Tornillo tornillo, Tarugo tarugo) {
		if (sonIguales(tornillo)) {
			while (tornillo.getPosicionActual() != tarugo.getLongitud() - tarugo.getLongitud()) {
				tornillo.girar('a');
			}
		}
	}

	public void atornillador(Tornillo tornillo, Tarugo tarugo) {
		if (sonIguales(tornillo)) {
			while (tornillo.getPosicionActual() != tarugo.getLongitud()) {
				tornillo.girar('h');
			}
		}
	}

	public boolean sonIguales(Tornillo tornillo) {
		return tornillo.getTIPO_DE_CABEZA() == TIPO_DE_CABEZA;
	}
}
