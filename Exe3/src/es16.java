import java.util.ArrayList;

import prog.io.ConsoleInputManager;
import prog.utili.Rettangolo;

public class es16 {

	public static Rettangolo trovaAreaMaggiore(ArrayList<Rettangolo> _rettangoli) {

		Rettangolo r_AreaMax = new Rettangolo(0, 0);

		for (Rettangolo r : _rettangoli) {

			if (r.haAreaMaggiore(r_AreaMax)) {
				r_AreaMax = r;
			}

		}

		return r_AreaMax;
	}

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ArrayList<Rettangolo> rettangoli = new ArrayList<Rettangolo>();

		do {
			rettangoli.add(new Rettangolo(in.readInt("Inserisci Base: "), in.readInt("Inserisci altezza: ")));

		} while (in.readSiNo("Inserire un altro rettangolo? "));

		Rettangolo r = trovaAreaMaggiore(rettangoli);
		System.out.print("Il rettangolo con area maggiore è: " + r.toString());
		System.out.println(" Con area: " + r.getArea());

	}

}
