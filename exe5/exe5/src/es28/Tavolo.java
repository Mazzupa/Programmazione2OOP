package es28;

import java.util.ArrayList;

public class Tavolo {

	private static int numTavoli = 0;
	private int id;
	private int numCoperti;
	private ArrayList<PiattoOrdinato> piattiConsumati;
	private ArrayList<Persona> personeSedute;

	public Tavolo(int _numCoperti) {

		numCoperti = _numCoperti;
		id = ++numTavoli;

		piattiConsumati = new ArrayList<PiattoOrdinato>();
		personeSedute = new ArrayList<Persona>();

	}

	public int getNumCoperti() {
		return numCoperti;
	}

	public void setNumCoperti(int _numCoperti) {
		numCoperti = _numCoperti;
	}

	public int getId() {
		return id;
	}

	public void aggiungiPersona(Persona p) {
		
		if(personeSedute.size() == this.numCoperti)
			System.err.println("Numero massimo coperti raggiunto");
		else
			personeSedute.add(p);
	}

	public void aggiungiPiatto(Piatto p) {
		int cont = 1;
		for(PiattoOrdinato i : piattiConsumati){
			if(i.getId() == p.getId())
				cont ++;
		}
		
		piattiConsumati.add(new PiattoOrdinato(p, cont));
	}

	public void rimuoviPiatto(int id) {
		for (Piatto i : piattiConsumati) {
			if (i.getId() == id) {
				piattiConsumati.remove(i);
			}
		}
	}

	public void modificaQuantita(int id, int nQta) {
		for (Piatto i : piattiConsumati) {
			if (i.getId() == id) {
				piattiConsumati.get(piattiConsumati.indexOf(i)).setQta(nQta);
			}
		}
	}

	public void stampaPiatti() {
		System.out.println(piattiConsumati.toString());
	}

	public void stampaPersone() {
		System.out.println(personeSedute.toString());
	}

	public float getTotale() {

		float tot = 0;

		for (PiattoOrdinato i : piattiConsumati)
			tot += (i.getPrezzo() * i.getQta());

		return tot;
	}

	public float getTotaleAPersona() {
		return getTotale() / personeSedute.size();
	}

	@Override
	public String toString() {
		return "Tavolo [id=" + id + ", numCoperti=" + numCoperti + ", piattiConsumati=" + piattiConsumati
				+ ", personeSedute=" + personeSedute + "]";
	}
	
	

}
