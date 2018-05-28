package pratiche;

public enum GradoGiudizio {
	
	PRIMO(1), SECONDO(2), CASSAZIONE(3);

	int fattoreCosto;
	
	GradoGiudizio(int i){
		fattoreCosto = i;
	}
}