package threeway.java.aula04;

import java.util.Arrays;

public class UtilArrays {

	public static void main(String[] args) {
			int[] a = { 8, 4, 1, 9, 2, 5, 12, 3, 6, 10, 7, 11};
			System.out.println(Arrays.toString(a));
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			
			System.out.println("============");
			
			String[] array = { "b", "e", "f", "a", "c", "d" };
			System.out.println(Arrays.toString(array));
			Arrays.sort(array);
			System.out.println(Arrays.toString(array));			
	}
}
