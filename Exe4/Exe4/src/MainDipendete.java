
public class MainDipendete {

	public static void main(String[] args) {
		
		Dipendete d = new Dipendete("Pippo", 2500);
		
		System.out.println(d.getNome());
		System.out.println(d.getStipendio());
		
		d.incrementaStipendio(10);
		
		System.out.println(d.getStipendio());
	}

}
