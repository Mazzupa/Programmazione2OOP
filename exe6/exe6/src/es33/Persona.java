package es33;

public class Persona {

	private String nome;
	private String cognome;

	public Persona(String _nome, String _cognome) {
		nome = _nome;
		cognome = _cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		nome = _nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String _cognome) {
		cognome = _cognome;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}

}
