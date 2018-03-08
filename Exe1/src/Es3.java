import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es3 {

	public static void main(String[] args) {
		
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		Frazione f1 = new Frazione(1, 3);
		Frazione f2 = new  Frazione(2, 3);
		
		out.println("La somma delle due frazioni è: " + f1.piu(f2).toString());
		out.println("La differenza delle due frazioni è: " + f1.meno(f2).toString());
		out.println("Il prodotto delle due frazioni è: " + f1.per(f2).toString());
		out.println("Il Quoziente delle due frazioni è: " + f1.piu(f2).toString());

	}

}
