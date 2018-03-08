import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es4 {

	public static void main(String[] args) {
		
		ConsoleOutputManager out = new ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		Frazione f1 = new Frazione(in.readInt("Inserisci il numeratore della prima frazione: "), 
								   in.readInt("Inserisci il denominatore della prima frazione: "));
		
		Frazione f2 = new Frazione(in.readInt("Inserisci il numeratore della seconda frazione: "), 
								   in.readInt("Inserisci il denominatore della seconda frazione: "));
		
		out.println("La somma delle due frazioni è: " + f1.piu(f2).toString());
		out.println("La differenza delle due frazioni è: " + f1.meno(f2).toString());
		out.println("Il prodotto delle due frazioni è: " + f1.per(f2).toString());
		out.println("Il Quoziente delle due frazioni è: " + f1.piu(f2).toString());


	}

}
