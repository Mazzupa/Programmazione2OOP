package es36;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		Rettangolo r = new Rettangolo(10, 20);
		Quadrato q = new Quadrato(15);
		Cerchio c = new Cerchio(18);
		Triangolo t = new Triangolo(15, 18, 36, 25);
		
		ArrayList<Figura> figure = new ArrayList<>();
		
		figure.add(t);
		figure.add(r);
		figure.add(q);
		figure.add(c);
		
		Collections.sort(figure);
		
		System.out.println(figure);
		
	}
}
