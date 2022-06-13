/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao; //DATA ACCESS OBJECT

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Clientes;

/**
 * @author adaatii
 * @author diego Revisão de código
 */
public class ClientesDao {

	private Connection con;

	/**
	 * Método ClienteDao:
	 * Cadastra, altera, exclui e lista as infromações dos clientes no banco de dados na tabela clientes
	 */
	public ClientesDao() {

		this.con = new ConnectionFactory().getConnection(); // Conexão com o BD

	}
	/**
	 * Método Cadastrar cliente:
	 * Salva as infromações dos clientes no banco de dados tabela clientes
	 * @param obj Cliente com ClienteDao para registar as informações
	 */
	// Metodo Cadastrar Cliente
	public void cadastrarCliente(Clientes obj) {
		try {
			// Criar comando SQL insere nos campos da tabela Clientes os valores
			// 1° pega o valor(Get) do campo e já atribui(Set) ao BD
			String sql = "insert into tb_clientes (nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, obj.getNome());
			stmt.setString(2, obj.getRg());
			stmt.setString(3, obj.getCpf());
			stmt.setString(4, obj.getEmail());
			stmt.setString(5, obj.getTelefone());
			stmt.setString(6, obj.getCelular());
			stmt.setString(7, obj.getCep());
			stmt.setString(8, obj.getEndereco());
			stmt.setInt(9, obj.getNumero());
			stmt.setString(10, obj.getComplemento());
			stmt.setString(11, obj.getBairro());
			stmt.setString(12, obj.getCidade());
			stmt.setString(13, obj.getUf());

			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "RG ou CPF já cadastrado!", null, JOptionPane.ERROR_MESSAGE);

		}

	}
	/**
	 * Método editar
	 * Altera as informações no banco de dados na tabela cliente com as especificações informada pelo usuário
	 * @param  obj Cliente com ClienteDao e altera as informações
	 */
	// Metodo Alterar Cliente
	public void alterarCliente(Clientes obj) {
		try {
			// Criar comando SQL altera nos campos da tabela Clientes os valores
			String sql = "update tb_clientes set nome=?,rg=?,cpf=?,email=?,telefone=?,celular=?,cep=?,endereco=?,"
					+ "numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?";

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, obj.getNome());
			stmt.setString(2, obj.getRg());
			stmt.setString(3, obj.getCpf());
			stmt.setString(4, obj.getEmail());
			stmt.setString(5, obj.getTelefone());
			stmt.setString(6, obj.getCelular());
			stmt.setString(7, obj.getCep());
			stmt.setString(8, obj.getEndereco());
			stmt.setInt(9, obj.getNumero());
			stmt.setString(10, obj.getComplemento());
			stmt.setString(11, obj.getBairro());
			stmt.setString(12, obj.getCidade());
			stmt.setString(13, obj.getUf());
			stmt.setInt(14, obj.getId());
			

			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Alterado com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "RG ou CPF já cadastrado!", null, JOptionPane.ERROR_MESSAGE);

		}

	}
	/**
	* Método excluir
	* Exclui as informações da tabela cliente no banco de dados com as especificações informada pelo usuário
	* @param  obj Cliente com ClienteDao e exclui as informações
	*/
	// Metodo Excluir Cliente
	public void excluirCliente(Clientes obj) {
		try {
			// Criar comando SQL deleta nos campos da tabela Clientes os valores

			String sql = "delete from tb_clientes where id = ?";
			

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, obj.getId());
			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, " Cliente não pode ser Excluido. Já vinculado a venda!", null, JOptionPane.WARNING_MESSAGE);
			
		}
		

	}
	/**
	 * Método Listar
	 * traz as informações do banco de dados da tabela clientes e retona em uma lista
	 * @return Retorna a lista com todos os clientes da tabela cliente
	 */
	// Metodo Listar Clientes
	public List<Clientes> listarCliente() {

		try {

			// 1° Criar a Lista
			List<Clientes> lista = new ArrayList<>();

			// 2° Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela clientes)
			String sql = "select * from tb_clientes";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Clientes obj = new Clientes();
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setRg(rs.getString("rg"));
				obj.setCpf(rs.getString("cpf"));
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
	 * traz as informações do banco de dados da tabela clientes por nome
	 *  @return Retorna a lista com o cliente informado da tabela cliente
	 */
	// Metodo Buscar Cliente por nome - retorna uma Lista
	public List<Clientes> buscaClienteNome(String nome) {

		try {

			// 1° Criar a Lista
			List<Clientes> lista = new ArrayList<>();

			// 2° Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela clientes)
			String sql = "select * from tb_clientes where nome like ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Clientes obj = new Clientes();
				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setRg(rs.getString("rg"));
				obj.setCpf(rs.getString("cpf"));
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
	 * Método busca CPF
	 * traz as informações do banco de dados da tabela clientes por CPF
	 * @return obj objeto de cliente  conecta no ClienteDao
	 */
	// Metodo Buscar Cliente por CPF - retorna uma Lista
	public Clientes buscaClienteCpf(String cpf) {

		try {
			// Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela Fornecedores)
			String sql = "select * from tb_clientes where cpf=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cpf);

			ResultSet rs = stmt.executeQuery();
			Clientes obj = new Clientes();

			if (rs.next()) {

				obj.setId(rs.getInt("id"));
				obj.setNome(rs.getString("nome"));
				obj.setRg(rs.getString("rg"));
				obj.setCpf(rs.getString("cpf"));
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
