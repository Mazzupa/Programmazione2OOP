import prog.io.ConsoleOutputManager;
import prog.io.ConsoleInputManager;


public class Es7 {

	public static void main(String[] args){
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String s = in.readLine("Inserisci una stringa: ");
		
		String ast = "************************************************************************";
		String spc = "                                                                        ";
		
		String c = ast.substring(0, s.length()+4);
		String c1 = spc.substring(0, s.length()+2);
		
		String c2 = "*" + c1 + "*";
		
		out.println(c);
		out.println(c2);
		out.println("* " + s + " *");
		out.println(c2);
		out.println(c);
		
	}
}
