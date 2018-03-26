package es40;

public class Motorino {

	private String colore;
	private double velocita;
	private String modello;
	private boolean antifurto;
	/**
	 * @param colore
	 * @param velocita
	 * @param modello
	 * @param antifurto
	 */
	public Motorino(String colore, double velocita, String _modello) {
		this.colore = colore;
		this.velocita = velocita;
		modello = _modello;
	}
	
	public String getModello() {
		return modello;
	}
	
	public String getColore() {
		return colore;
	}
	
	public double getVelocita() {
		return velocita;
	}
	
	public void inserisciAntifurto() {
		antifurto = true;
	}
	
	public void togliAntifurto() {
		antifurto = false;
	}
	
	public void accellera(double _velocita) throws AntifurtoInseritoException{
		if(!antifurto)
			velocita += _velocita;
		else 
			throw new AntifurtoInseritoException("Antifurto inserito");
	}
	
	
}
