
public class Calculadora implements Calculos {

	@Override
	public Double soma(Double x, Double y) {
		return x + y;
	}

	@Override
	public Double subtracao(Double x, Double y) {
		return x - y;
	}

	@Override
	public Double multiplicacao(Double x, Double y) {
		return x * y;
	}

	@Override
	public void raizQuadrada(Double valor) {
		System.out.println("A raiz quadrada de "+ valor +" é= "+ Math.sqrt( valor ));
	}
		
}
