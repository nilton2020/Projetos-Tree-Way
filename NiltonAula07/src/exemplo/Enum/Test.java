package exemplo.Enum;

public class Test {
	
	public static void main (String[] args) {
		
		double result = Operation.PLUS.calculate(1, 2);
			System.out.println(result);
		double result2 = Operation.MINUS.calculate(5, 8);
			System.out.println(result2);
		double result3 = Operation.TIME.calculate(4, 9);
			System.out.println(result3);
		double result4 = Operation.DIVIDE.calculate(6, 10);
			System.out.println(result4);
		
		
		for (UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
		
		//whois.arin.net
		System.out.println(WhaisRIR.ARIN.url());
	
		//ACTIVE
		System.out.println(UserStatus.ACTIVE);
	}

}
