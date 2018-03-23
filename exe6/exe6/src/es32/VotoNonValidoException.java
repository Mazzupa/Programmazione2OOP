package es32;

public class VotoNonValidoException extends Exception {

	private int voto;

	public VotoNonValidoException(String msg, int _voto) {
		super(msg);
		voto = _voto;
	}

	public int getVoto() {
		return voto;
	}

}
