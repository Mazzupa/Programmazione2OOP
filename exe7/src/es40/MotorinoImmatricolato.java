package es40;

public class MotorinoImmatricolato extends Motorino{

	private String targa;
	private double maxVelocita;
	/**
	 * @param colore
	 * @param velocita
	 * @param modello
	 * @param targa
	 * @param maxVelocita
	 * @throws VelocitaMassimaRaggiuntaException 
	 */
	public MotorinoImmatricolato(String colore, double velocita, String modello, String targa, double maxVelocita) throws VelocitaMassimaRaggiuntaException {
		super(colore, velocita, modello);
		if(velocita > maxVelocita) throw new VelocitaMassimaRaggiuntaException("Impossibile superare la velocità massima");
		this.targa = targa;
		this.maxVelocita = maxVelocita;
	}
	
	public double getMax() {
		return maxVelocita;
	}
	
	public String getTarga() {
		return targa;
	}
	
	public void accellera(double _velocita) throws AntifurtoInseritoException{
		if(this.getVelocita() + _velocita > maxVelocita)
			super.accellera(maxVelocita - super.getVelocita());
		else
			super.accellera(_velocita);
	}

}
