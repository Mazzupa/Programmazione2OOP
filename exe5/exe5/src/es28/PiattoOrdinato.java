package es28;

public class PiattoOrdinato extends Piatto {

	private int qta;

	public PiattoOrdinato(Piatto p, int _qta) {

		super(p.getId(), p.getPrezzo());
		qta = _qta;

	}

	public int getQta() {
		return qta;
	}

	public void setQta(int _qta) {
		qta = _qta;
	}

	@Override
	public String toString() {
		return "PiattoOrdinato [ " + super.toString() + "qta=" + qta + "]";
	}
	
	

}
