
public class RepeticaoWhileContinue {

	public static void main(String[] args) {
		
		int contador = 0;
		
		while(true) {//la�o infinito
			if (contador == 2) {
				System.out.println("continue - (while-true)");
				contador++;
				continue;
				
			}if (contador == 10) {
				System.out.println("break - (while-true)");
				break;
			}
			System.out.println(contador);
			contador++;
		}

	}

}
