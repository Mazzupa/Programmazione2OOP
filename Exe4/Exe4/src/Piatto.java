public class Piatto {

	private String id;
	private int qta;
	private double prezzo;

	public Piatto(String id, int qta, double prezzo) {
		super();
		this.id = id;
		this.qta = qta;
		this.prezzo = prezzo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQta() {
		return qta;
	}

	public void setQta(int qta) {
		this.qta = qta;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}
