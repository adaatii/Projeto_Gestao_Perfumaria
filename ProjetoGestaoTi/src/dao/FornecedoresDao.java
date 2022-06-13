/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Fornecedores;

/**
 *
 * @author adaatii
 */
public class FornecedoresDao {

	private Connection con;

    /**
     * Método FornecedoresDao
     * Cadastra, altera, exclui e lista as infromações dos fornecedores no banco de dados na tabela fornecedores
     */
	public FornecedoresDao() {this.con = new ConnectionFactory().getConnection();} // Conexão com o BD	

	/**
	 * Método Cadastrar Fornecedores:
	 * cadastra na tabela Fornecedores os atributuos
     * (nome,cnpj,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
	 * @param obj Fornecedores conecta com FornecedoresDao para registar as informações na tabela tabela fornecedores
	 */
	// Metodo Cadastrar Fornecedores
	public void cadastrarFornecedores(Fornecedores obj) {
		try {
			// Criar comando SQL insere nos campos da tabela fornecedores os valores
			// 1° pega o valor(Get) do campo e já atribui(Set) ao BD
			String sql = "insert into tb_fornecedores (nome,cnpj,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, obj.getNome());
			stmt.setString(2, obj.getCnpj());
			stmt.setString(3, obj.getEmail());
			stmt.setString(4, obj.getTelefone());
			stmt.setString(5, obj.getCelular());
			stmt.setString(6, obj.getCep());
			stmt.setString(7, obj.getEndereco());
			stmt.setInt(8, obj.getNumero());
			stmt.setString(9, obj.getComplemento());
			stmt.setString(10, obj.getBairro());
			stmt.setString(11, obj.getCidade());
			stmt.setString(12, obj.getUf());

			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "CNPJ já cadastrado!", null, JOptionPane.ERROR_MESSAGE);

		}

	}

	/**
	* Método excluir
	* Exclui as informações da tabela Fornecedores no banco de dados com as especificações informada pelo usuário
	* @param  obj Fornecedores com FornecedoresDao e exclui as informações
	*/	
	// Método Excluir Fornecedores
	public void excluirFornecedor(Fornecedores obj) {
		try {
			// Criar comando SQL deleta nos campos da tabela fornecedores os valores

			String sql = "delete from tb_fornecedores where id = ?";

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, obj.getId());

			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Fornecedor não pode ser Excluido. Já vinculado a venda!", null, JOptionPane.WARNING_MESSAGE);
		}

	}
	/**
	 * Método editar
	 * Altera as informações no banco de dados na tabela fornecedores com as especificações informada pelo usuário
	 * @param  obj Fornecedores com FornecedoresDao e altera as informações
	 */
	// Metodo Alterar Fornecedores
	public void alterarFornecedor(Fornecedores obj) {
		try {
			// Criar comando SQL altera nos campos da tabela Fornecedores os valores
			String sql = "update tb_fornecedores set nome=?,cnpj=?,email=?,telefone=?,celular=?,cep=?,endereco=?,"
					+ "numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?";

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, obj.getNome());
			stmt.setString(2, obj.getCnpj());
			stmt.setString(3, obj.getEmail());
			stmt.setString(4, obj.getTelefone());
			stmt.setString(5, obj.getCelular());
			stmt.setString(6, obj.getCep());
			stmt.setString(7, obj.getEndereco());
			stmt.setInt(8, obj.getNumero());
			stmt.setString(9, obj.getComplemento());
			stmt.setString(10, obj.getBairro());
			stmt.setString(11, obj.getCidade());
			stmt.setString(12, obj.getUf());

			stmt.setInt(13, obj.getId());

			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
		}

	}
	/**
	 * Método Listar
	 * traz as informações do banco de dados da tabela fornecedores e retona em uma lista
	 * @return Retorna a lista com todos os fornecedores da tabela cliente
	 */
	// Metodo Listar Fornecedores
	public List<Fornecedores> listarFornecedor() {

		try {

			// 1° Criar a Lista
			List<Fornecedores> lista = new ArrayList<>();

			// 2° Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela fornecedores)
			String sql = "select * from tb_fornecedores";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Fornecedores obj = new Fornecedores();
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setCnpj(rs.getString("cnpj"));
				obj.setEmail(rs.getString("email"));
				obj.setTelefone(rs.getString("telefone"));
				obj.setCelular(rs.getString("celular"));
				obj.setCep(rs.getString("cep"));
				obj.setEndereco(rs.getString("endereco"));
				obj.setNumero(rs.getInt("numero"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setBairro(rs.getString("bairro"));
				obj.setCidade(rs.getString("cidade"));
				obj.setUf(rs.getString("estado"));

				lista.add(obj);
			}

			return lista;

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
			return null;
		}

	}
	/**
	 * Método listar por nome
	 * traz as informações do banco de dados da tabela fornecedores por nome
	 *  @return Retorna a lista com o fornecedores informado da tabela fornecedores
	 */
	// Metodo Buscar Fornecedor por nome - retorna uma Lista
	public List<Fornecedores> buscaFornecedorNome(String nome) {

		try {

			// 1° Criar a Lista
			List<Fornecedores> lista = new ArrayList<>();

			// 2° Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela Fornecedores)
			String sql = "select * from tb_fornecedores where nome like ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Fornecedores obj = new Fornecedores();
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setCnpj(rs.getString("cnpj"));
				obj.setEmail(rs.getString("email"));
				obj.setTelefone(rs.getString("telefone"));
				obj.setCelular(rs.getString("celular"));
				obj.setCep(rs.getString("cep"));
				obj.setEndereco(rs.getString("endereco"));
				obj.setNumero(rs.getInt("numero"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setBairro(rs.getString("bairro"));
				obj.setCidade(rs.getString("cidade"));
				obj.setUf(rs.getString("estado"));

				lista.add(obj);
			}

			return lista;

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
			return null;
		}

	}
	/**
	 * Método busca por nome
	 * traz as informações do banco de dados da tabela fornecedores por nome
	 *  @return Retorna os dados do fornecedor informado
	 */
	// Método consulta Fornecedores Por nome
	public Fornecedores consultaFornecedorNome(String nome) {
		try {
			// Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela Fornecedores)
			String sql = "select * from tb_fornecedores where nome=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);

			ResultSet rs = stmt.executeQuery();
			Fornecedores obj = new Fornecedores();

			if (rs.next()) {

				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setCnpj(rs.getString("cnpj"));
				obj.setEmail(rs.getString("email"));
				obj.setTelefone(rs.getString("telefone"));
				obj.setCelular(rs.getString("celular"));
				obj.setCep(rs.getString("cep"));
				obj.setEndereco(rs.getString("endereco"));
				obj.setNumero(rs.getInt("numero"));
				obj.setComplemento(rs.getString("complemento"));
				obj.setBairro(rs.getString("bairro"));
				obj.setCidade(rs.getString("cidade"));
				obj.setUf(rs.getString("estado"));
			}

			return obj;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fornecedor não encontrado!");
			return null;
		}
	}

}
