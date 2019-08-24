package com.framework.testes;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.framework.model.Cliente;
public class TestaPersistenceXML {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hello");
		EntityManager entityManager = factory.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Vinicius");
		cliente.setProfissao("Programador");
		cliente.setEndereco("Rua 19");
		
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();

		List<Cliente> todosClienteJPA = entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
		for (Cliente ClienteLaco : todosClienteJPA) {
			// implementar toString() via suporte da ferramenta
			System.out.println(ClienteLaco);
		}
	}
}
