import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;


public class Es9 {

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
	
	public static int contaVocali(String S){
		
		int cont = 0;
		for(int i =0; i<S.length(); i++){
			
			if(isVocale(S.charAt(i)))
				cont++;
		}
		
		return cont;
	}
	
	public static void main(String[] args) {
		
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		out.println("Le vocali della stringa inserita sono: " + contaVocali(in.readLine("Insersci una stringa: ")));

	}

}
