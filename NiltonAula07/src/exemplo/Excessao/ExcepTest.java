package exemplo.Excessao;

public class ExcepTest {

	public static void main(String[] args) {
		try {
			int a[] = new int[2];
			System.out.println("Access element trhee :" + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ecxeption thrown :" + e);
		}
		System.out.println("Out of the block");
	}
}
