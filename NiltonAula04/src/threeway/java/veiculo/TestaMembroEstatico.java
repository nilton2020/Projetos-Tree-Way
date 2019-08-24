package threeway.java.veiculo;

public class TestaMembroEstatico {

	public static void main(String[] args) {
			CarroA carro1 = new CarroA();
			CarroA carro2 = new CarroA();
			CarroA carro3 = new CarroA();
			
			System.out.println(CarroA.getContadorInstancia() + " instancias criadas");
	}

}
