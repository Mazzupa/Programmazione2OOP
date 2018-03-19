package es29;

import java.util.ArrayList;

public class Volo {

	private String idVolo;
	private Aereoporto partenza;
	private Aereoporto destinazione;
	private Aereo aereo;
	private ArrayList<Passeggero> passeggeri;
	
	public Volo(){}
	
	public void aggiungiPasseggero(Passeggero p){}
	
	public void rimuoviPasseggero(String id){}
	
	public double getTotale(){
		return 0;
	}
	
	public void stampaPasseggeri(){
		System.out.println(passeggeri.toString());
	}
	
}
