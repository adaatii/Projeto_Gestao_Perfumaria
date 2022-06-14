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
import model.ItemVenda;
import model.Produtos;
/**
 * @author adaatii
 * @author diego Revisão de código
 */
public class ItemVendaDao {
    private Connection con;
    /**
     * Método ItemVendaDao
     * Registra todas as vendas realizadas no banco de dados na tabela itensvendas 
     */
    public ItemVendaDao() {this.con = new ConnectionFactory().getConnection();} //Conexão com o BD
	/**
	 * Método registar vendas:
	 * Salva as informações dos itens vendidos no banco de dados na tabela tabela itensvendas
	 * @param obj ItemVenda conecta com ItemVendaDao para cadastrar as informações dos itens vendidos
	 */
    public void cadastrarItem(ItemVenda obj){
        try {
            
            String sql = "insert into tb_itensvendas (venda_id,produto_id,qtd,subtotal)values(?,?,?,?)";

            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getVenda().getId());
            stmt.setInt(2, obj.getProduto().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());
           
            
            //Executar o comando SQL
            stmt.execute();
            stmt.close();
            
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
    
	/**
	 * Método para Lista Itens Vendidos por ID
	 * traz as informações do banco de dados da tabela itens vendas por id
	 *  @return Retorna a lista com o todas as vendas relacionadas pelo id informado
	 */   
    
    //Método para Lista Itens Vendidos por ID  
     public List<ItemVenda> listarItensVenda(int venda_id) {

        try {

            //1° Criar a Lista
            List<ItemVenda> lista = new ArrayList<>();

            //2° Criar o sql, organizar e executar
            //Comando SQL (seleciona tudo da tabela produtos)
            String sql = "select p.descricao, i.qtd, p.preco, i.subtotal from tb_itensvendas as i "
                    + " inner join tb_produtos as p on(i.produto_id = p.id) where i.venda_id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, venda_id);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ItemVenda item = new ItemVenda();
                Produtos produto = new Produtos();
                
                
                produto.setDescricao(rs.getString("p.descricao"));
                item.setQtd(rs.getInt("i.qtd"));
                produto.setPreco(rs.getDouble("p.preco"));
                item.setSubtotal(rs.getInt("i.subtotal"));
               
                item.setProduto(produto);             
                

                lista.add(item);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }

    
}
