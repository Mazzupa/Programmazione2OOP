package pratiche;

import java.util.Date;

import cliente.Cliente;

public class PraticaPenale extends Pratica{
	
	private static final int PREZZO_ORARIO = 100;
	private GradoGiudizio grado;
	
	public PraticaPenale(Cliente c, String des, Date d, Stato s, int n, int p, GradoGiudizio g) {
		super(c, des, d, s, n, p);
		grado = g;
	}

	public GradoGiudizio getGrado() {
		return grado;
	}

	public void setGrado(GradoGiudizio grado) {
		this.grado = grado;
	}

	@Override
	public int getCosto() {
		return grado.fattoreCosto * numOre * PREZZO_ORARIO;
	}

	@Override
	public String toString() {
		return "PraticaPenale [grado=" + grado + "]";
	}
	
	
	
}
