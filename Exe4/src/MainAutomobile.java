import java.util.ArrayList;

public class MainAutomobile {

	public static void main(String[] args) {

		Automobile a1 = new Automobile("1234286", 151836);
		Automobile a2 = new Automobile("3456", 42);

		System.out.println(a1.getID());
		System.out.println(a1.getKmPercorsi());

		System.out.println(a1.isMaggioreKm(a2));

		System.out.println(a2.getID());

		ArrayList<Automobile> auto = new ArrayList<Automobile>();
		auto.add(a1);
		auto.add(a2);

		Automobile.sort(auto);

		for (Automobile i : auto)
			System.out.println(i.getID());

	}

}
