
public class AcessandoElementosdaArray {

	public static void main(String[] args) {
		
		int [] array1 = {1,2,3,4,5,6,7,8,9,10,11,12};
		System.out.println(array1 [0] );//acessando o primeiro elementeo do array
		System.out.println(array1 [6] );//acessando o elemento do indice 6
		System.out.println(array1 [array1.length -1]); // acesando o último elemento
		
		for (int valorArray : array1) {
			System.out.println(valorArray);
		}
		

	}

}
