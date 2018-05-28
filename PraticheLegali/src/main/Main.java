package main;

import java.util.Date;
import cliente.Cliente;
import pratiche.GradoGiudizio;
import pratiche.PraticaCivile;
import pratiche.PraticaConciliazione;
import pratiche.PraticaPenale;
import pratiche.Stato;

public class Main {

	public static void main(String[] args) {

		StudioLegale gp = new StudioLegale();

		gp.inserisci(new PraticaCivile(new Cliente(), "des", new Date(), Stato.ARCHIVIATA, 10, 2, GradoGiudizio.CASSAZIONE));
		gp.inserisci(new PraticaConciliazione(new Cliente(), "des", new Date(), Stato.CHIUSA, 10, 2));
		gp.inserisci(new PraticaPenale(new Cliente(), "des", new Date(), Stato.ARCHIVIATA, 10, 2, GradoGiudizio.PRIMO));
		gp.inserisci(new PraticaConciliazione(new Cliente(), "des", new Date(), Stato.IN_CORSO, 10, 2));
		gp.inserisci(new PraticaCivile(new Cliente(), "des", new Date(), Stato.CHIUSA, 10, 2, GradoGiudizio.SECONDO));

		gp.stampaPerCostoArchiviate();

	}
	
}
