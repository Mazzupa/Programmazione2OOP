import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class Es8 {

	public static boolean isVocale(char c){
		switch (c) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		case 'A':
			return true;
		case 'E':
			return true;
		case 'I':
			return true;
		case 'O':
			return true;
		case 'U':
			return true;
		default:
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		String s = in.readLine("Inserisci una stringa: ");
		for(int i = 0; i<s.length(); i++){
			
			if(!isVocale(s.charAt(i))){
				out.print(s.charAt(i));
			}
		}
		
	}
}
