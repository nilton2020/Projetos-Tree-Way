package threeway.projeto.service.dao;

public class TestaClienteDao {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Joao Neto");
		cliente.setLogin("Milton");
		cliente.setSenha("48215");
		cliente.setEndereco("Rua 19");
		cliente.setCidade("Goiania");
		cliente.setBairro("Garavelo");
		cliente.setEstado("Goiás");
		cliente.setCep("48844-777");

		ClienteDao dao = new ClienteDao();
		dao.inserir(cliente);
	}
}
