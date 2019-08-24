
public class ExercicioArray4 {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		for (int contador = 0; contador < array1.length; contador++) {// percorre array

			if (contador % 2 == 0) {
				array1[contador] = -1;
			} else
				array1[contador] = +1;

		}for (int contador1 : array1) {
			System.out.println(contador1);
		}

	}

}
