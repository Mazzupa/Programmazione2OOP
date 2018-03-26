package es36;

public class Cerchio extends Figura{
	
	private int raggio;
	
	public Cerchio(int _raggio) {
		super();
		raggio = _raggio;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(raggio, 2);
	}

	@Override
	public double getPerimetro() {
		return 2 * Math.PI * raggio;
	}

}
