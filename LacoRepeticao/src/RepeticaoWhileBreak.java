
public class RepeticaoWhileBreak {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while(true) { //laço infinito
			if(contador == 10) {
				System.out.println("break - (while-true)");
				break;
				
			}
			System.out.println(contador);
			contador ++;
		}
				

	}

}
