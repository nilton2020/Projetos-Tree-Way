package com.framework.testes;

import java.util.List;

import com.framework.dao.PessoaDao;
import com.framework.model.Pessoa;

public class TestaPessoaDAO {
	static PessoaDao pessoaDao = PessoaDao.getInstance();

	public static void main(String[] args) {
//		incluirPessoa();
//		buscarPessoaPorId();
//		testaFindALL();
//		testarMerge();
//		testaRemovePessoa();
		testaRemoveByID();
		System.out.println("testando instância do padrão Singleton");
	}

	private static void incluirPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("072.456.081-56");
		pessoa.setNome("Outro cara 24");

		pessoaDao.persist(pessoa);
	}

	private static void buscarPessoaPorId() {
		Pessoa pessoa = pessoaDao.getById(1);
	}

	private static void testaFindALL() {
		List<Pessoa> todasPessoaJPA = pessoaDao.findALL();

		for (Pessoa pessoaLaco : todasPessoaJPA) {
			System.out.println(pessoaLaco);
		}
	}

	public static void testarMerge() {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setCpf("072.789.654-52");
		pessoa.setNome("Outro cara 444");
	}

	public static void testaRemovePessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoaDao.remove(pessoa);
	}

	public static void testaRemoveByID() {
		pessoaDao.removedById(2);
	}
}
