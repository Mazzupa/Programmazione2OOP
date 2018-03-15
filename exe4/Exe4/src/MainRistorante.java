
public class MainRistorante {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("nome1", "cognome1");
		Persona p2 = new Persona("Nome2", "cognome2");
		
		Piatto pi1 = new Piatto("1", 2, 15.18);
		Piatto pi2 = new Piatto("2", 2, 45.00);
		Piatto pi3 = new Piatto("3", 1, 15.70);
		
		Tavolo t = new Tavolo(123, 8);
		
		t.addPersonaSedute(p1);
		t.addPersonaSedute(p2);

		t.addPiattoConsumato(pi1);
		t.addPiattoConsumato(pi2);
		t.addPiattoConsumato(pi3);
		
		System.out.println(t.calcolaMedia());
		System.out.println(t.calcolaTotale());
		
	}
	
}
