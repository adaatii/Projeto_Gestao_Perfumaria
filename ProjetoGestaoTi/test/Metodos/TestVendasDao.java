/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdbc.ConnectionFactory;
import model.Vendas;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Clientes;


/**
 *
 * @author adaatii
 * hdaushudhasudhuasd
 */
public class TestVendasDao {
     private Connection con;
    
    public TestVendasDao() {
        
        this.con = new ConnectionFactory().getConnection(); //Conexão com o BD

    }
    
    //cadastrar Venda
    public boolean cadastrarVenda(Vendas obj){
         try {
            
            String sql = "insert into tb_vendas (cliente_id,data_venda,total_venda,observacoes)values(?,?,?,?)";

            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCliente().getId());
            stmt.setString(2, obj.getData_venda());
            stmt.setDouble(3, obj.getTotal_venda());
            stmt.setString(4, obj.getObs());
            
            //Executar o comando SQL
            stmt.execute();
            stmt.close();
            
           
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return false;
        }
         return true;
    }
    
    //retornar ultima venda
    
    public int retornaUltimaVenda(){
        try {
            int idvenda = 0;
            
            String sql = "select max(id) id from tb_vendas;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                Vendas p = new Vendas();
                p.setId(rs.getInt("id"));
                idvenda = p.getId();
                
            }
            
            return idvenda;
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
         
    }
    
    //Métodos que lista vendas por datas
    
    public List<Vendas> listarVendasPeriodo(LocalDate data_inicial, LocalDate data_final) {

        try {

            //1° Criar a Lista
            List<Vendas> lista = new ArrayList<>();

            //2° Criar o sql, organizar e executar
            //Comando SQL (seleciona tudo da tabela produtos)
            String sql = "select v.id ,  date_format(v.data_venda,'%d/%m/%Y') as data_format , c.nome, v.total_venda, v.observacoes, c.cpf  from tb_vendas as v  "
                    + " inner join tb_clientes as c on(v.cliente_id = c.id) where v.data_venda BETWEEN ? AND ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, data_inicial.toString());
            stmt.setString(2, data_final.toString());
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vendas obj = new Vendas();
                Clientes c = new Clientes();
                
                obj.setId(rs.getInt("v.id"));
                obj.setData_venda(rs.getString("data_format"));
                c.setNome(rs.getString("c.nome"));
                c.setCpf(rs.getString("c.cpf"));
                obj.setTotal_venda(rs.getDouble("v.total_venda"));
                obj.setObs(rs.getString("v.observacoes"));

                obj.setCliente(c);
                

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }

    }
    
    //Método para calcular o total das vendas no dia selecionado
    public double totalVendaDia(LocalDate data_venda){
        try {
            double totalvendido = 0;
            
            String sql = "select sum(total_venda) as total from tb_vendas where data_venda=?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, data_venda.toString());
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                totalvendido = rs.getDouble("total");
            }
            return totalvendido;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    
  

    
}
