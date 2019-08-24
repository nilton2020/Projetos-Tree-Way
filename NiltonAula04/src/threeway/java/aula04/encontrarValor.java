package threeway.java.aula04;
import java.util.Arrays;

public class encontrarValor {

	public static void main(String[] args) {
		int[] a = { 8, 4, 1, 9, 2, 5, 12, 3, 6, 10, 7, 11};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		System.out.println(a[0]);
		System.out.println(a[a.length -1]);
	}
}
