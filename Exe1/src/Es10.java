import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class Es10 {
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String s = in.readLine("Inserisci una stringa: ");
		
		for(char i = 'a'; i<'z'; i++){
			int cont = 0;
			for(int j=0; j<s.length(); j++){
				if(s.charAt(j) == i)
					cont++;
			}
			if(cont != 0) 
				out.println(i + " -> " + cont);
		}

	}

}
