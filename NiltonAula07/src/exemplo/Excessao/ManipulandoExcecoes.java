package exemplo.Excessao;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ManipulandoExcecoes {

	public static void main(String... args) {
		PrintStream ps = System.out;
		InputStreamReader leitor = new InputStreamReader(System.in);
		int[] array = { 1, 2, 3, 4 };
		try {
			Character ch = (char) leitor.read();
			// NumberFormatException
			int i = Integer.parseInt(ch.toString());
			// ArrayIndexOutOfBoundsException
			ps.println(array[i]);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | IOException e) {
			ps.printf("Um erro aconteceu!! : %s\n", e.getMessage());
		} finally {
			ps.printf("Sempre passo aqui para fechar todos os recursos");
		}
	}
}
