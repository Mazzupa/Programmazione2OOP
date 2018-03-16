
public class Dipendete {

	public String nome;
	public double stipendio;
	
	public Dipendete(String _nome, double _stipendio){
		
		this.nome = _nome;
		this.stipendio = _stipendio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double _stipendio) {
		this.stipendio = _stipendio;
	}
	
	public void incrementaStipendio(double percentuale){
		
		this.setStipendio(this.stipendio + (this.stipendio * percentuale)/100);
	}
}
