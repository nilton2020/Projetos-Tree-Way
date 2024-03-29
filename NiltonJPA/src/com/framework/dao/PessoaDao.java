package com.framework.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.framework.model.Pessoa;

public class PessoaDao {

	private static PessoaDao instance;
	EntityManager entityManager;

	private PessoaDao() {
		entityManager = getEntityManager();
	}

	public static PessoaDao getInstance() {
		if (instance == null) {
			instance = new PessoaDao();
		}
		return instance;
	}

	private EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-hello");
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}

	public void persist(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public Pessoa getById(final int id) {
		return entityManager.find(Pessoa.class, id);
	}

	// utiliza o createQuery que recebe um JQPL
	// (Java Persistence Query Language) que � uma alternativa ao SQL
	public List<Pessoa> findALL() {
		return entityManager.createQuery("FROM " + Pessoa.class.getName()).getResultList();
	}

	// O m�todo merge segue o mesmo principio do m�todo persist(),
	// a �nica diferen�a que o merge atualiza o registro e n�o
	// apenas insere ele no banco
	public void merge(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			entityManager.merge(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	public void remove(Pessoa pessoa) {
		try {
			entityManager.getTransaction().begin();
			pessoa = entityManager.find(Pessoa.class, pessoa.getId());
			entityManager.remove(pessoa);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}
	public void removedById(final int id) {
		try {
			Pessoa pessoa = getById(id);
			remove(pessoa);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
