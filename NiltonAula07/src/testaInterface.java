
public class testaInterface {

	public static void main(String[] args) {
		Calculos calcula = new Calculadora();
		System.out.println("O resultado da soma �= "+calcula.soma(1.1, 1.4));
		System.out.println("O resultado da subtra��o �= "+calcula.subtracao(1.2, 1.5));
		System.out.println("O resultado da multiplica��o �= "+ calcula.multiplicacao(1.0, 1.2));
		System.out.println("O resultado da conta �= "+ Math.floor( 123.3 ));
		System.out.println("O resultado da conta �= "+ Math.ceil( 123.3 ));
		calcula.raizQuadrada(200.0);
		
		
	}
}
