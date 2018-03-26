package es40;

public class Main {
public static void main(String[] args) throws AntifurtoInseritoException, VelocitaMassimaRaggiuntaException {
	
	Motorino m = new Motorino("rosso", 45, "qdsuf");
	MotorinoImmatricolato mi = new MotorinoImmatricolato("Verde", 50, "asd", "dm463ws", 75);
	
	m.inserisciAntifurto();
	m.accellera(456);
	mi.accellera(80);
	System.out.println(mi.getVelocita());
	
}
}
