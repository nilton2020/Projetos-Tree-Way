package threeway.java.veiculo;

public class CarroA {

	// (1)Atributos - Variáveis
	public int ano;
	public String cor;
	public String modelo;
	public String placa;
	public boolean ligado = false;
	static int contador;

	// (2) construtores
	public CarroA() {
		contador++;
		System.out.println("construindo o objeto carro");
	}

	public CarroA(String placa) {
		this.placa = placa;
	}

	public CarroA(String modelo, String placa) {
		this(placa);
		this.modelo = modelo;
	}

	public CarroA(String modelo, String cor, int ano, String placa ) {
		this(modelo, placa);
		this.cor = cor;
		this.ano = ano;
	}

	public String ligar() {
		if (!ligado) {
			ligado = true;
			return "carro ligado";

		} else {
			return "O carro já está ligado";
		}
	}
	// (3) Métodos 
	public String ligar(int msg) {
		System.out.println(msg);
		if (!ligado) {
			ligado = true;
			return "carro ligado";

		} else {
			return "O carro já está ligado";
		}
	}

	public String frear() {
		return "parando...";
	}

	public String acelerar() {
		return "acelerando...";
	}
	// Método estático 
	public static int getContadorInstancia() {
		return contador;
	}
	
	public void print(String msg) {
		
		System.out.println(msg);
		System.out.println("Carro de placa: " + placa);
		System.out.println("Cor: " + cor);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	
	public void print() {
		
		System.out.println("Carro de placa: " + placa);
		System.out.println("Cor: " + cor);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);

	}
	
}
