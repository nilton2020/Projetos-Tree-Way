
public class Exercicio3Array {

	public static void main(String[] args) {
		
		int [] array1 = {1,2,3,4,5,-8,-55,88,-33};
		
		int contadorMaiorque2 = 0;
		for (int verificar : array1) {
			
						
			if (verificar > 2 ){
				
				contadorMaiorque2++;								
			}				
		}System.out.println("Quantidade de números maior que dois: "+ contadorMaiorque2);
				
	}

}
