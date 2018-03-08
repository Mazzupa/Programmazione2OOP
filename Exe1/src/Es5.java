import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Frazione;

public class Es5 {

	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		Frazione f = new Frazione(0);
		
		int cont = 0;
		do{
			
			f = f.piu(new Frazione(in.readInt("Inserisci il numeratore: "), in.readInt("Inserisci il denominatore: ")));
			cont++;
			
		}while(in.readSiNo("Vuoi inserire un'altra frazione? "));
			
		
		out.println("La media è: " + (f.diviso(new Frazione(cont))));

	}

}
