package threeway.projeto.service.dao;

public class TestaDeleteClienteDao {

	public static void main(String[] args) {
		Cliente deletar = new Cliente();
		deletar.setCodigo(3);
		ClienteDao dao = new ClienteDao();
		 dao.remover(deletar);
	}
}
