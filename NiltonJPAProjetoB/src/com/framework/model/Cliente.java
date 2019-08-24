package com.framework.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String nome;
		private String profissao;
		private String endereco;
		
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		@Override
		public String toString() {
			return "Pessoa [id=" + id + ", nome=" + nome + ", profissao=" + profissao + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getProfissao() {
			return profissao;
		}
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}

}
