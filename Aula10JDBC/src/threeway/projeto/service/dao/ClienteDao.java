package threeway.projeto.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDao {
	private static final String INSERT_SQL = "INSERT INTO CLIENTE "
			+ "(NOME, LOGIN, SENHA, ENDERECO, CIDADE, BAIRRO, ESTADO, CEP)" + "VALUES (?,?,?,?,?,?,?,?)";
	private static final String SELECT_SQL = "SELECT * FROM CLIENTE WHERE SENHA = ? and LOGIN= ? ";
	private static final String UPDATE_SQL = "UPDATE cliente SET " + "SENHA = ?, LOGIN = ?, ENDERECO = ?, CIDADE = ?, "
			+ "BAIRRO = ?, ESTADO = ?, CEP = ? " + "WHERE COD_CLIENTE = ?";
	private static final String DELETE_SQL = "DELETE FROM CLIENTE where COD_CLIENTE = ? ";

	public Cliente inserir(Cliente cliente) {
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(INSERT_SQL)) {

			consulta.setString(1, cliente.getNome());
			consulta.setString(2, cliente.getLogin());
			consulta.setString(3, cliente.getSenha());
			consulta.setString(4, cliente.getEndereco());
			consulta.setString(5, cliente.getCidade());
			consulta.setString(6, cliente.getBairro());
			consulta.setString(7, cliente.getEstado());
			consulta.setString(8, cliente.getCep());

			consulta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public Cliente obter(Cliente cliente) {
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(SELECT_SQL)) {

			consulta.setString(1, cliente.getSenha());
			consulta.setString(2, cliente.getLogin());
			ResultSet resultado = consulta.executeQuery();

			if (resultado.next()) {
				cliente.setNome(resultado.getString("NOME"));
				cliente.setSenha(resultado.getString("SENHA"));
				cliente.setLogin(resultado.getString("LOGIN"));
				cliente.setEndereco(resultado.getString("ENDERECO"));
				cliente.setCidade(resultado.getString("CIDADE"));
				cliente.setBairro(resultado.getString("BAIRRO"));
				cliente.setEstado(resultado.getString("ESTADO"));
				cliente.setCep(resultado.getString("CEP"));
				cliente.setCodigo(resultado.getInt("cod_cliente"));
			} else {
				cliente = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

	public void alterar(Cliente cliente) {
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(UPDATE_SQL)){
			consulta.setString(1, cliente.getSenha());
			consulta.setString(2, cliente.getLogin());
			consulta.setString(3, cliente.getEndereco());
			consulta.setString(4, cliente.getCidade());
			consulta.setString(5, cliente.getBairro());
			consulta.setString(6, cliente.getEstado());
			consulta.setString(7, cliente.getCep());
			consulta.setInt(8, cliente.getCodigo());

			consulta.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void remover(Cliente entidade) {
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(DELETE_SQL)){
			consulta.setLong(1, entidade.getCodigo());
			consulta.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Erro ao realizar Delete: " + e.getMessage());
		}
	}
}
