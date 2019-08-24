package threeway.projeto.service.dao;

public class TestaObterClienteDao {

	public static void main(String[] args) {	
		Cliente cliente = new Cliente();
		cliente.setSenha("48215");
		cliente.setLogin("Milton");
		
		ClienteDao dao = new ClienteDao();
		
		Cliente cliente2 = dao.obter(cliente);
		System.out.println(cliente2.getNome());
		
	}

}
