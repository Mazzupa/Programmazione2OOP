package es36;

public class Rettangolo extends Figura{

	private int base;
	private int altezza;
	
	public Rettangolo(int _base, int _altezza) {
		super();
		base = _base;
		altezza = _altezza;
	}
	
	@Override
	public double getArea() {
		return base*altezza;
	}

	@Override
	public double getPerimetro() {
		return (base+altezza)*2;
	}

}
