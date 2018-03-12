import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import prog.io.ConsoleInputManager;

public class es20 {

	public static boolean isVocale(String c) {

		switch (c) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
			return true;
		default:
			return false;
		}

	}

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		String path = in.readLine("Inserisci il nome del file: ");

		File f = new File(path);

		int cont = 0;

		try {
			Scanner s = new Scanner(f);

			while (s.hasNext()) {
				if (isVocale(Integer.toString(s.nextInt()))) {
					cont++;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(cont);
		
	}

}
