import java.util.ArrayList;

public class Studente {

	private String nome;
	private String congnome;
	private final int numVoti = 10;
	private ArrayList<Integer> voti;
	private String paeseResidenza;

	private void initVoti() {
		this.voti = new ArrayList<Integer>();
		for (int i = 0; i < this.numVoti; i++)
			this.voti.add(0);
	}

	public Studente(String _nome, String _cognome) {

		this.nome = _nome;
		this.congnome = _cognome;

		this.initVoti();
	}

	public Studente(String _nome, String _cognome, String _paeseResidenza) {

		this.nome = _nome;
		this.congnome = _cognome;
		this.paeseResidenza = _paeseResidenza;

		this.initVoti();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public String getCongnome() {
		return congnome;
	}

	public void setCongnome(String _congnome) {
		this.congnome = _congnome;
	}

	public int getVoto(int index) {

		if (index > this.voti.size())
			return 0;

		return voti.get(index);
	}

	public void setVoto(int voto, int index) {
		this.voti.set(index, voto);
	}

	public String getPaeseResidenza() {
		return paeseResidenza;
	}

	public void setPaeseResidenza(String _paeseResidenza) {
		this.paeseResidenza = _paeseResidenza;
	}

	public double getMedia() {

		if (this.voti.isEmpty())
			return 0;

		int s = 0;

		for (int i : this.voti)
			s += i;

		return (float)s / this.voti.size();
	}

}
