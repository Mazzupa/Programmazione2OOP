package pratiche;

import java.util.Date;

import cliente.Cliente;

public class PraticaCivile extends PraticaPenale {

	public PraticaCivile(Cliente c, String des, Date d, Stato s, int n, int p, GradoGiudizio g) {
		super(c, des, d, s, n, p, g);
	}

	@Override
	public String toString() {
		return "PraticaCivile [Grado=" + getGrado() + ", Costo=" + getCosto() + ", Cliente=" + getCliente() + ", Descrizione=" + getDescrizione()
				+ ", Data Prossima Udienza=" + getDataProssimaUdienza() + ", Stato=" + getStato()
				+ ", Num Ore=" + getNumOre() + ", Priorita=" + getPriorita() + ", Id=" + getId() + "]";
	}



}
