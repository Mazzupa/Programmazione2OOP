package es31;

import java.util.Random;

import prog.io.ConsoleInputManager;

public class DivisioneRandom {
	public static void main(String[] args) {
		Random r = new Random();
		ConsoleInputManager in = new ConsoleInputManager();
		try {
			System.out.println(in.readInt("Inserisci un numero: ") / r.nextInt(3));
		} catch (ArithmeticException e) {
			System.err.println("Divisione per zero");
		}
	}
}
