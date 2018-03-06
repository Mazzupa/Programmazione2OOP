/**Crivello di eratostene
 * @author pat
 * @todo Uncompleted
 */


import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es15 {

	public static void main(String[] args) {

		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int n = in.readInt("Inserisci un numero: ");

		boolean A[] = new boolean[n];

		for (int i = 0; i < A.length; i++)
			A[i] = true;

		int B[] = new int[n];
		for (int i = 0; i < B.length; i++)
			B[i] = i;

		for (int i = 2; i < B.length; i++) {
			for (int j = i; j < A.length; j++) {

				if (B[j-2] % i == 0) {
					A[j-2] = false;

				}
			}
		}

		for (int i = 0; i < A.length; i++)
			if (A[i])
				out.print(B[i] + " ");

	}
}