
public class MainAcquario {

	public static void main(String[] args) {
		
		Pesce p = new Pesce("id", 42, 36);
		
		Vasca v = new Vasca("vasca");
		
		v.addPesce(p);
		
		v.stampaPesci();
		
		v.eliminaPesce("id");

		v.stampaPesci();
	}
	
}
