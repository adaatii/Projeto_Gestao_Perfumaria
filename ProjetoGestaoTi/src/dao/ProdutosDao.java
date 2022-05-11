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
 *
 * @author adaatii
 */
public class ProdutosDao {
    
    private Connection con;
    
    public ProdutosDao() {
        
        this.con = new ConnectionFactory().getConnection(); //Conexão com o BD

    }

    /**
     * Método Cadastrar Produtos
     */
    public void cadastrarProduto(Produtos obj) {
        try {
            
            String sql = "insert into tb_produtos (descricao,preco,qtd_estoque,for_id)values(?,?,?,?)";

            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            
            stmt.setInt(4, obj.getFornecedor().getId());

            //Executar o comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    /**
     * Método Listar Produtos
     */
    public List<Produtos> listarProdutos() {
        
        try {

            //1° Criar a Lista
            List<Produtos> lista = new ArrayList<>();

            //2° Criar o sql, organizar e executar
            //Comando SQL (seleciona tudo da tabela produtos)
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p "
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
     * Método Listar Produtos por nome
     */
    public List<Produtos> buscaProdutosNome(String nome) {
        
        try {

            //1° Criar a Lista
            List<Produtos> lista = new ArrayList<>();

            //2° Criar o sql, organizar e executar
            //Comando SQL (seleciona tudo da tabela produtos)
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
    
    /**
     * Método Alterar Produtos
     */
    
    public void alterarProduto(Produtos obj) {
        try {
            
            String sql = "update tb_produtos set descricao=?,preco=?,qtd_estoque=?,for_id=? where id=?";

            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            
            stmt.setInt(4, obj.getFornecedor().getId());
            
            stmt.setInt(5, obj.getId());

            //Executar o comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Alterado com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
    /**
     * Método Excluir Produto
     */
    
    public void excluirProduto(Produtos obj) {
        try {
            
            String sql = "delete from tb_produtos where id=?";

            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
           
            stmt.setInt(1, obj.getId());

            //Executar o comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Produto Excluido com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
}
