package com.framework.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.framework.model.Pessoa;

public class TestaPersistenceXML {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hello");
		EntityManager entityManager = factory.createEntityManager();

		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("07245608156");
		pessoa.setNome("Nilton");

		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		entityManager.getTransaction().commit();

		List<Pessoa> todasPessoaJPA = entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
		for (Pessoa pessoaLaco : todasPessoaJPA) {
			// implementar toString() via suporte da ferramenta
			System.out.println(pessoaLaco);
		}
	}
}