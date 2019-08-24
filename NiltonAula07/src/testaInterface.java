
public class testaInterface {

	public static void main(String[] args) {
		Calculos calcula = new Calculadora();
		System.out.println("O resultado da soma é= "+calcula.soma(1.1, 1.4));
		System.out.println("O resultado da subtração é= "+calcula.subtracao(1.2, 1.5));
		System.out.println("O resultado da multiplicação é= "+ calcula.multiplicacao(1.0, 1.2));
		System.out.println("O resultado da conta é= "+ Math.floor( 123.3 ));
		System.out.println("O resultado da conta é= "+ Math.ceil( 123.3 ));
		calcula.raizQuadrada(200.0);
		
		
	}
}
