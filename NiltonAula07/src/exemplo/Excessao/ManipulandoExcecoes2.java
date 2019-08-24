package exemplo.Excessao;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ManipulandoExcecoes2 {

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
		} catch (ArrayIndexOutOfBoundsException e) {
			ps.printf("indice fora do limite [0..3] : %s\n", e.getMessage());
		} catch (NumberFormatException e) {
			ps.printf("Erro de conversão : %s\n", e.getMessage());
		} catch (IOException e) {
			ps.printf("Erro de entrada e saida  : %s\n", e.getMessage());
		} finally {
			ps.printf("Sempre passo aqui para fechar todos os recursos");
		}
	}
}
