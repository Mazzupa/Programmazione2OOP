package cliente;

public class Cliente {

	String nome;
	String cognome;
	String codiceFiscale;

	/**
	 * TODO
	 */

	public Cliente() {

	}

	public Cliente(String n, String c, String cod) {
		nome = n;
		cognome = c;
		codiceFiscale = cod;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + "]";
	}
	
	

}
