package es32;

import java.util.ArrayList;

public class Voti {

	public static double getMedia(ArrayList<Integer> voti) throws EmptyArrayException {
		if (voti.size() == 0)
			throw new EmptyArrayException("Array vuoto");
		double somma = 0;
		for (int i = 0; i < voti.size(); i++) {
			somma += voti.get(i);
		}

		return somma / (double) voti.size();
	}

	public static int getMax(ArrayList<Integer> voti) {
		int max = Integer.MIN_VALUE;
		for (int i : voti)
			if (i > max)
				max = i;

		return max;
	}

	public static ArrayList<Integer> stringToArray(String s) throws VotoNonValidoException {
		String[] a = s.split(";");
		ArrayList<Integer> voti = new ArrayList<>();

		try {
			for (int i = 0; i < a.length; i++) {
				if (Integer.parseInt(a[i]) < 0 || Integer.parseInt(a[i]) > 30)
					throw new VotoNonValidoException("Voto minore di 0 o maggiore di 30", Integer.parseInt(a[i]));

				voti.add(Integer.parseInt(a[i]));

			}
		} catch (NumberFormatException e) {
			System.err.println("Stringa non valida: " + e.getMessage() + "\n");
		}

		return voti;

	}

	public static void main(String[] args) throws VotoNonValidoException, EmptyArrayException {

		String votiS = "15;18;30;22;15;0;1";

		ArrayList<Integer> voti = new ArrayList<Integer>();
		voti = stringToArray(votiS);
		System.out.println("Massimo: " + getMax(voti));

		System.out.println("Media: " + getMedia(voti));

	}

}
