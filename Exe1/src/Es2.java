import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es2 {

	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new   ConsoleOutputManager();
		
		int a = 0;
		int b = 0;
		
		a = in.readInt("Inserisci il primo numero: ");
		b = in.readInt("Inserisci il secondo numero: ");
		
		out.println("La somma dei numeri è " + (a + b));

	}

}
