package es36;

public class Triangolo extends Figura{
	
	private int base;
	private int lato1;
	private int lato2;
	private int altezza;
	
	public Triangolo(int _base, int _lato1, int _lato2, int _altezza) {
		super();
		lato1 =_lato1;
		lato2 = _lato2;
		base = _base;
		altezza = _altezza;
	}
	
	@Override
	public double getArea() {
		return (base*altezza)/2;
	}
	@Override
	public double getPerimetro() {
		return base + lato1 + lato2;
	}	

}
