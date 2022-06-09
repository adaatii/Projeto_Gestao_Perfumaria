/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import jdbc.ConnectionFactory;
import model.Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedores;

/**
 * @author adaatii
 * @author diego Revisão de código
 */
public class ProdutosDao {

	private Connection con;

	public ProdutosDao() {

		this.con = new ConnectionFactory().getConnection(); // Conexão com o BD

	}

	/**
	 * Método Cadastrar Produtos:
	 * Salva as infromações dos Produtos no banco de dados tabela Produtos
	 * @param obj Produtos  cadastrar as informações
	 */	
	
	public void cadastrarProduto(Produtos obj) {
		try {

			String sql = "insert into tb_produtos (descricao,preco,qtd_estoque,for_id)values(?,?,?,?)";

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, obj.getDescricao());
			stmt.setDouble(2, obj.getPreco());
			stmt.setInt(3, obj.getQtd_estoque());
			
			stmt.setInt(4, obj.getFornecedor().getId());
			

			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Descrição de Produto já cadastrada", null, JOptionPane.ERROR_MESSAGE);
		
		}
	
	}

	/**
	 * Método Lista na Produtos
	 * traz as informações do banco de dados da tabela Produtos e retona em uma lista
	 * @return Retorna a lista com todos os Produtos da tabela Produtos
	 */
	public List<Produtos> listarProdutos() {

		try {

			// 1° Criar a Lista
			List<Produtos> lista = new ArrayList<>();

			// 2° Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela produtos)
			String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome, f.cnpj from tb_produtos as p "
					+ "inner join tb_fornecedores as f on (p.for_id = f.id)";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Produtos obj = new Produtos();
				Fornecedores f = new Fornecedores();
				obj.setId(rs.getInt("p.id"));
				obj.setDescricao(rs.getString("p.descricao"));
				obj.setPreco(rs.getDouble("p.preco"));
				obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

				f.setNome(rs.getString(("f.nome")));

				obj.setFornecedor(f);

				lista.add(obj);
			}

			return lista;

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
			return null;
		}

	}


	/**
	 * Método Lista na Produtos por nome
	 * traz as informações do banco de dados da tabela Produtos e retona o produto informado
	 * @return Retorna a lista com o Produto informado da tabela Produtos
	 */
	public List<Produtos> buscaProdutosNome(String nome) {

		try {

			// 1° Criar a Lista
			List<Produtos> lista = new ArrayList<>();

			// 2° Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela produtos)
			String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p "
					+ "inner join tb_fornecedores as f on (p.for_id = f.id) where p.descricao like ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Produtos obj = new Produtos();
				Fornecedores f = new Fornecedores();
				obj.setId(rs.getInt("p.id"));
				obj.setDescricao(rs.getString("p.descricao"));
				obj.setPreco(rs.getDouble("p.preco"));
				obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

				f.setNome(rs.getString(("f.nome")));

				obj.setFornecedor(f);

				lista.add(obj);
			}

			return lista;

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
			return null;
		}

	}
	// Busca Produto por código

	public Produtos buscaProdutosCodigo(int id) {

		try {

			// Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela produtos)
			String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p "
					+ "inner join tb_fornecedores as f on (p.for_id = f.id) where p.id= ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			Produtos obj = new Produtos();
			Fornecedores f = new Fornecedores();

			if (rs.next()) {

				obj.setId(rs.getInt("p.id"));
				obj.setDescricao(rs.getString("p.descricao"));
				obj.setPreco(rs.getDouble("p.preco"));
				obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

				f.setNome(rs.getString(("f.nome")));

				obj.setFornecedor(f);

			}

			return obj;

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
			return null;
		}

	}

	/**
	 * Método Alterar Produtos
	 * Salva as infromações dos Produtos no banco de dados na tabela Produtos
	 * @param obj Produtos  altera as informações através do ID
	 */	
	public void alterarProduto(Produtos obj) {
		try {

			String sql = "update tb_produtos set descricao=?,preco=?,qtd_estoque=? where id=?"; //,for_id=?

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, obj.getDescricao());
			stmt.setDouble(2, obj.getPreco());
			stmt.setInt(3, obj.getQtd_estoque());

			//stmt.setInt(4, obj.getFornecedor().getId());

			stmt.setInt(4, obj.getId());

			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
		}
	}
	
	/**
	 * Método Excluir Produtos
	 * Excluir as infromações dos Produtos no banco de dados na tabela Produtos
	 * @param obj Produtos  Excluir as informações através do ID
	 */	
	public void excluirProduto(Produtos obj) {
		try {

			String sql = "delete from tb_produtos where id=?";

			// Conectar banco de dados e organizar o comando SQL
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, obj.getId());

			// Executar o comando SQL
			stmt.execute();
			stmt.close();

			JOptionPane.showMessageDialog(null, "Produto Excluido com sucesso!");

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Produto não pode ser Excluido. Já vinculado a venda!",null, JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * Método baixa de estoque
	 * Faz a baixa do saldo em estoque
	 */
	public void baixarEstoque(int id, int qtd_nova) {
		try {
			String sql = "update tb_produtos set qtd_estoque=? where id=?";

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, qtd_nova);
			stmt.setInt(2, id);
			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}

	}

	/**
	 * Método Atualizar estoque
	 * Faz a atualização do estoque 
	 */
	public void atualizarEstoque(int id, int qtd_nova) {
		try {
			String sql = "update tb_produtos set qtd_estoque=? where id=?";

			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, qtd_nova);
			stmt.setInt(2, id);
			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}
	}

	/**
	 * Metodo que retorna o estoque atual de um produto
	 * @return Retorna o saldo do estoque atual
	 */
	public int retornaEstoqueAtual(int id) {
		try {
			int qtd_estoque = 0;
			String sql = "SELECT qtd_estoque from tb_produtos where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				qtd_estoque = (rs.getInt("qtd_estoque"));
			}

			return qtd_estoque;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	
	/**
	 * Método Lista na Produtos por ID
	 * traz as informações do banco de dados da tabela Produtos e retona o produto pelo ID
	 * @return Retorna o Produto informado da tabela Produtos pelo ID
	 */
	public List<Produtos> listarProdutosCodigo(int id) {

		try {

			// 1° Criar a Lista
			List<Produtos> lista = new ArrayList<>();

			// 2° Criar o sql, organizar e executar
			// Comando SQL (seleciona tudo da tabela produtos)
			String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p "
					+ "inner join tb_fornecedores as f on (p.for_id = f.id) where p.id like ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Produtos obj = new Produtos();
				Fornecedores f = new Fornecedores();
				obj.setId(rs.getInt("p.id"));
				obj.setDescricao(rs.getString("p.descricao"));
				obj.setPreco(rs.getDouble("p.preco"));
				obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));

				f.setNome(rs.getString(("f.nome")));

				obj.setFornecedor(f);

				lista.add(obj);
			}

			return lista;

		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Erro: " + erro);
			return null;
		}

	}

}
