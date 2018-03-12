import java.util.ArrayList;
import java.util.StringTokenizer;

import prog.utili.Figura;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class es16a {

	public static Figura trovaAreaMaggiore(ArrayList<Figura> _figure) {

		Figura f_AreaMax = new Rettangolo(0,0);
		
		for (Figura r : _figure) {

			if (r.haAreaMaggiore(f_AreaMax)) {
				f_AreaMax = r;
			}
		}

		return f_AreaMax;
	}

	public static Figura trovaPerimetroMaggiore(ArrayList<Figura> _figure) {

		Figura f_PerimetroaMax = new Rettangolo(0, 0);

		for (Figura r : _figure) {

			if (r.haPerimetroMaggiore(f_PerimetroaMax)) {
				f_PerimetroaMax = r;
			}
		}

		return f_PerimetroaMax;
	}

	
	public static void main(String[] args) {

		String s = "2,4;6,3;10,15;15,15;50,89;50,50;100,100";

		StringTokenizer st = new StringTokenizer(s, ";");
		StringTokenizer st1 = null;

		ArrayList<Integer> lati = new ArrayList<Integer>();

		ArrayList<Figura> figure = new ArrayList<Figura>();

		while (st.hasMoreTokens()) {
			st1 = new StringTokenizer(st.nextToken(), ",");
			while (st1.hasMoreTokens()) {
				lati.add(Integer.parseInt((String) st1.nextElement()));
			}
		}

		for (int i = 0; i < lati.size() - 1; i++) {
			if (lati.get(i) == lati.get(i + 1)) {
				figure.add(new Quadrato(lati.get(i)));
			} else
				figure.add(new Rettangolo(lati.get(i), lati.get(i + 1)));
		}

		Figura a_Max = trovaAreaMaggiore(figure);
		Figura p_Max = trovaPerimetroMaggiore(figure);
		
		if(a_Max instanceof Quadrato){
			
			System.out.print("La figura con area maggiore è un quadrato con: " + a_Max.toString());
			System.out.println(" con area: " + a_Max.getArea());
		}
		else if((a_Max instanceof Rettangolo)){
			
			System.out.print("La figura con area maggiore è un rettangolo con: " + a_Max.toString());
			System.out.println(" con area: " + a_Max.getArea());
		}
		
		if(p_Max instanceof Quadrato){
			
			System.out.print("La figura con perimetro maggiore è un quadrato con: " + a_Max.toString());
			System.out.println(" con area: " + p_Max.getPerimetro());
		}
		else if((p_Max instanceof Rettangolo)){
			
			System.out.print("La figura con area maggiore è un rettangolo con: " + a_Max.toString());
			System.out.println(" con area: " + a_Max.getArea());
		}
		

		



	}

}
