import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;

public class Es6 {

	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String s = in.readLine("Inserisci una stringa: ");
		
		String ast = "******************";
		
		String c = ast.substring(0, s.length()+1);
		
		out.println(c);
		out.println(s);
		out.println(c);
		

	}

}
