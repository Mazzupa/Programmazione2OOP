package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import pratiche.*;

public class StudioLegale {

	private ArrayList<Pratica> pratiche = new ArrayList<>();

	public void inserisci(Pratica p) {
		pratiche.add(p);
	}

	
	public void stampaPerPriorita() {
		pratiche.sort((Pratica p1, Pratica p2) -> p1.getPriorita()- p2.getPriorita());
		pratiche.forEach(System.out::println);
	}

	public void stampaPerCosto() {
		pratiche.sort((Pratica p1, Pratica p2) -> p1.getCosto() - p2.getCosto());
		pratiche.forEach(System.out::println);
	}

	public void stampaPerCostoArchiviate() {
		pratiche.sort((Pratica p1, Pratica p2) -> p1.getCosto() - p2.getCosto());
		pratiche.stream()
						.filter((pratica) -> pratica.getStato().equals(Stato.ARCHIVIATA))
						.forEach(System.out::println);
	}

	
	public void caricaDaFile(String path) throws FileNotFoundException{
		
		File file = new File(path);
		
		Scanner in = new Scanner(file);
		
		ArrayList<String> str = new ArrayList<String>();
		
		while(in.hasNext()){
			str.add(in.nextLine());
		}
		
		in.close();
	}

}
