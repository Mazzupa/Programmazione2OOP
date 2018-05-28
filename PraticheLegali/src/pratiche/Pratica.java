package pratiche;

import java.util.Date;

import cliente.Cliente;

public abstract class Pratica {

	private static int numPratiche = 0;
	
	private int id;
	private Cliente cliente;
	private String descrizione;
	private Date dataProssimaUdienza;
	private Stato stato;
	
	protected int numOre;

	public Pratica(Cliente c, String des, Date d, Stato s, int n, int p) {
		id = ++numPratiche;
		cliente = c;
		descrizione = des;
		dataProssimaUdienza = d;
		stato = s;
		numOre = n;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Date getDataProssimaUdienza() {
		return dataProssimaUdienza;
	}

	public void setDataProssimaUdienza(Date dataProssimaUdienza) {
		this.dataProssimaUdienza = dataProssimaUdienza;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {

		this.stato = stato;
	}

	public int getNumOre() {
		return numOre;
	}

	public void setNumOre(int numOre) {
		this.numOre = numOre;
	}

	public int getPriorita() {
		if (stato == Stato.CHIUSA || stato == Stato.ARCHIVIATA)
			return 1000;
		Date oggi = new Date();
		int deltaGiorni = oggi.compareTo(dataProssimaUdienza);
		if (deltaGiorni < 0) {
			return Integer.MAX_VALUE;
		} else {
			return deltaGiorni;
		}
	}

	public int getId() {
		return id;
	}

	public abstract int getCosto();

}
