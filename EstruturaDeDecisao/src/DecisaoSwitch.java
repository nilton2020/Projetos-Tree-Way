import java.util.Scanner;

public class DecisaoSwitch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int mesDoAno;		
		System.out.println("Digite o número correspondente ao mês do ano:");
		mesDoAno = input.nextInt();
		
		switch (mesDoAno) {
			case 12:
			case 1:
			case 2:
				System.out.println("VERÃO");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("OUTONO");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("INVERNO");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("PRIMAVERA");
				
			default:
					System.out.println("MÊS NÃO É VÁLIDO " + mesDoAno);
					break;
				
		
		
		}
		

	}

}
