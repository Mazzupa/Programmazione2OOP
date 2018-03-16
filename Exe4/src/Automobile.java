import java.util.ArrayList;

public class Automobile {

	private String ID;
	private double kmPercorsi;

	public Automobile(String _ID, double _kmPercorsi) {
		this.ID = _ID;
		this.kmPercorsi = _kmPercorsi;
	}

	public String getID() {
		return ID;
	}

	public void setID(String _ID) {
		ID = _ID;
	}

	public double getKmPercorsi() {
		return kmPercorsi;
	}

	public void setKmPercorsi(double _kmPercorsi) {
		this.kmPercorsi = _kmPercorsi;
	}

	public boolean isMaggioreKm(Automobile a) {
		return this.kmPercorsi > a.getKmPercorsi() ? true : false;
	}

	public boolean isMinoreKm(Automobile a) {
		return this.kmPercorsi < a.getKmPercorsi() ? true : false;
	}

	private static void scambia(Automobile a1, Automobile a2) {

		Automobile t = new Automobile(a1.getID(), a1.getKmPercorsi());
		a1 = a2;
		a2 = t;
	}

	public static void sort(ArrayList<Automobile> auto) {

		for (int i = 0; i < auto.size(); i++) {
			for (int j = 0; j < auto.size() - 1; j++) {
				if (auto.get(j + 1).isMaggioreKm(auto.get(j))) {
					scambia(auto.get(j), auto.get(j + 1));
				}
			}
		}

	}
}
