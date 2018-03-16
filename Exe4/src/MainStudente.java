
public class MainStudente {

	public static void main(String[] args) {

		Studente s = new Studente("nome", "cognome");
		Studente s1 = new Studente("stud1", "s1", "paese");
		
		System.out.println(s.getNome());
		System.out.println(s.getCongnome());
		System.out.println(s.getPaeseResidenza());
		s.setPaeseResidenza("Paese s");
		System.out.println(s.getPaeseResidenza());
		
		System.out.println(s1.getNome());
		System.out.println(s1.getCongnome());
		System.out.println(s1.getPaeseResidenza());
		
		System.out.println(s.getMedia());
		
		System.out.println(s.getVoto(3));
		s.setVoto(18, 3);
		System.out.println(s.getVoto(3));
		
		System.out.println(s.getMedia());
		
		
	}

}
