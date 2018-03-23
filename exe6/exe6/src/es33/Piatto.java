package es33;

public class Piatto {

	private int id;
	private double prezzo;

	public Piatto(int _id, double _prezzo) {
		id = _id;
		prezzo = _prezzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int _id) {
		id = _id;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double _prezzo) {
		prezzo = _prezzo;
	}

	@Override
	public String toString() {
		return "Piatto [id=" + id + ", prezzo=" + prezzo + "]";
	}
	
	
}
