import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es1 {

	public static void main(String[] args) {
		
		ConsoleOutputManager out = new  ConsoleOutputManager();
		ConsoleInputManager in = new ConsoleInputManager();
		
		String input = in.readLine("Inserisci una stringa: ");
		
		out.println("La stringa inserita �: " + input);
	}

}
