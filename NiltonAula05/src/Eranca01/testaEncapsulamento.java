package Eranca01;

public class testaEncapsulamento {
	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		veiculo.setCor("azul");
		veiculo.setAno(2001);
		veiculo.setIdentificacao("Carro");
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getAno());
		System.out.println(veiculo.getIdentificacao());
		

	}
}
