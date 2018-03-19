package es28;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Mario", "Rossi");
		Persona p2 = new Persona("Filippo", "Verdi");
		
		Piatto d1 = new Piatto(001, 15.89);
		Piatto d2 = new Piatto(002, 15.18);
		Piatto d3 = new Piatto(003, 42.36);
	
		Tavolo t1 = new Tavolo(4);
		
		t1.aggiungiPersona(p1);
		t1.aggiungiPersona(p2);
		t1.aggiungiPersona(p2);
		t1.aggiungiPersona(p2);
		
		t1.aggiungiPiatto(d1);
		t1.aggiungiPiatto(d2);
		t1.aggiungiPiatto(d2);
		t1.aggiungiPiatto(d3);
		t1.aggiungiPiatto(d1);
		t1.aggiungiPiatto(d1);
		
		System.out.println(t1.toString());
		
		
	}

}
