
public class Pesce {

	private String identificativo;
	private int eta;
	private double profondita;

	public Pesce(String identificativo, int eta, double profondita) {
		this.identificativo = identificativo;
		this.eta = eta;
		this.profondita = profondita;
	}

	public String getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public double getProfondita() {
		return profondita;
	}

	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}

	@Override
	public String toString() {
		return "Pesce [identificativo=" + identificativo + ", eta=" + eta + ", profondita=" + profondita + "]";
	}
}
