package threeway.projeto.service.dao;

public class TestaAlterarClienteDao {

	public static void main(String[] args) {
		Cliente alterar = new Cliente() ;
		alterar.setBairro("agua");
		alterar.setCep("123456789");
		alterar.setCidade("goiatuba");
		alterar.setEndereco("rua 19");
		alterar.setEstado("sao");
		alterar.setLogin("estadao");
		alterar.setNome("Karla");
		alterar.setSenha("123456");
		alterar.setCodigo(2);
		
		ClienteDao dao = new ClienteDao();
		
		dao.alterar(alterar);
	}
}
