package es33;

public class PersonaGiaPresenteException extends Exception {

	private static final long serialVersionUID = 6061436048763826079L;

	public PersonaGiaPresenteException(Persona p, String msg) {
		super(p + msg);
	}

}
