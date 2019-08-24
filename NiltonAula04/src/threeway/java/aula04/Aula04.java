package threeway.java.aula04;

public class Aula04 {

	public static void main(String[] args) {
		String[] array = { "a", "b", "c", "d", "e", "3way" };

		for (String valorArray : array) {
			System.out.println(valorArray);
			if (valorArray.equals("3way")) {
				System.out.println("a palavra 3way foi encontrada!!");
			}
		}
	}
}
