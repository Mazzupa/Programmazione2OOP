package pratiche;

import java.util.Date;

import cliente.Cliente;

public class PraticaConciliazione extends Pratica{

	private static final int PREZZO_ORARIO = 120;
	
	public PraticaConciliazione(Cliente c, String des, Date d, Stato s, int n, int p) {
		super(c, des, d, s, n, p);
	}

	@Override
	public int getCosto() {
		return PREZZO_ORARIO * numOre;
	}

	@Override
	public String toString() {
		return "PraticaConciliazione []";
	}

}
