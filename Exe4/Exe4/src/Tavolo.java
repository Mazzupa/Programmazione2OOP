import java.util.ArrayList;

public class Tavolo {

	private int id;
	private int maxCoperti;
	private static ArrayList<Piatto> piattiConsumati;
	private ArrayList<Persona> personeSedute;
	
	public Tavolo(int id, int maxCoperti) {
		
		this.personeSedute = new ArrayList<Persona>();
		piattiConsumati = new ArrayList<Piatto>();
		
		this.id = id;
		this.maxCoperti = maxCoperti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxCoperti() {
		return maxCoperti;
	}

	public void setMaxCoperti(int maxCoperti) {
		this.maxCoperti = maxCoperti;
	}

	public Piatto getPiattoConsumato(int index) {
		return piattiConsumati.get(index);
	}
	
	private static int cerca(String id){
		int index = -1;
		for(int i = 0; i<piattiConsumati.size(); i++){
			index = piattiConsumati.get(i).getId().equals(id)? i : -1;
		}
		
		return index;
	}
	
	public void removePiatto(String id){
		
		piattiConsumati.remove(cerca(id));
	}

	public void addPiattoConsumato(Piatto piatto) {
		piattiConsumati.add(piatto);
	}

	public void addPersonaSedute(Persona persona) {
		this.personeSedute.add(persona);
	}
	
	public float calcolaTotale(){
		
		float tot = 0;
		
		for(Piatto i : piattiConsumati){
			tot+=(i.getPrezzo())*i.getQta();
		}
		return tot;
	}
	
	public float calcolaMedia(){
		if(personeSedute.isEmpty()) return 0;
		
		return calcolaTotale()/personeSedute.size();
	}
	
	
	
	
}
