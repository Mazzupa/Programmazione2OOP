import java.util.ArrayList;

public class Vasca {

	private String nome;
	private static ArrayList<Pesce> pesci;

	public Vasca(String nome) {

		pesci = new ArrayList<Pesce>();

		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pesce getPesce(int index) {
		return pesci.get(index);
	}

	public void addPesce(Pesce pesce) {
		pesci.add(pesce);
	}

	public void stampaPesci() {

		if (pesci.isEmpty())
			System.err.println("\nNon ci sono pesci");
		else
			for (Pesce i : pesci)
				System.out.println(i.toString());
	}

	private static int cerca(String id) {

		int index = -1;

		for (int i = 0; i < pesci.size(); i++)
			index = pesci.get(i).getIdentificativo().equals(id) ? i : -1;

		return index;
	}

	public void eliminaPesce(String id) {
		pesci.remove(cerca(id));
	}

}
