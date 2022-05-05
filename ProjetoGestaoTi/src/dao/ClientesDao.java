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
 *
 * @author adaatii
 */
public class ClientesDao {
    
    private Connection con;
    
    public ClientesDao(){
        
        this.con = new ConnectionFactory().getConnection(); //Conexão com o BD
        
    }
    
    
    
    //Metodo Cadastrar Cliente
    public void cadastrarCliente(Clientes obj){        
        try {
            //Criar comando SQL insere nos campos da tabela Clientes os valores 
            //1° pega o valor(Get) do campo e já atribui(Set) ao BD             
            String sql = "insert into tb_clientes (nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                                                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
            
            //Conectar banco de dados e organizar o comando SQL
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
            
            //Executar o comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: "+erro);
        }
        
    }
    //Metodo Alterar Cliente
    public void alterarCliente(Clientes obj){
        try {
            //Criar comando SQL altera nos campos da tabela Clientes os valores           
            String sql = "update tb_clientes set nome=?,rg=?,cpf=?,email=?,telefone=?,celular=?,cep=?,endereco=?,"
                    + "numero=?,complemento=?,bairro=?,cidade=?,estado=? where id=?"; 
            
            //Conectar banco de dados e organizar o comando SQL
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
            
            //Executar o comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: "+erro);
        }
        
    }
    //Metodo Excluir Cliente
    public void exluirCliente(Clientes obj){
        try {
            //Criar comando SQL deleta nos campos da tabela Clientes os valores 
                       
            String sql = "delete from tb_clientes where id = ?"; 
            
            //Conectar banco de dados e organizar o comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
           
            
            //Executar o comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } 
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: "+erro);
        }
        
    }    
    //Metodo Listar Clientes
    public List<Clientes> listarCliente(){
        
        try {
            
            //1° Criar a Lista
            List<Clientes> lista = new ArrayList<>();
            
            //2° Criar o sql, organizar e executar
            //Comando SQL (seleciona tudo da tabela clientes)
            String sql ="select * from tb_clientes"; 
            PreparedStatement stmt =con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
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
            JOptionPane.showMessageDialog(null,"Erro: "+erro);
            return null;
        }
    
    }    
    //Metodo Buscar Cliente por nome - retorna uma Lista
    public List<Clientes> buscaClienteNome(String nome){
        
        try {
            
            //1° Criar a Lista 
            List<Clientes> lista = new ArrayList<>();
            
            //2° Criar o sql, organizar e executar
            //Comando SQL (seleciona tudo da tabela clientes)
            String sql ="select * from tb_clientes where nome like ?";          
            PreparedStatement stmt =con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
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
            JOptionPane.showMessageDialog(null,"Erro: "+erro);
            return null;
        }
    
    }
    
//    public Clientes consultaCpf(String cpf){
//        try {
//            //1 passo - criar o sql , organizar e executar.
//            String sql = "select * from tb_clientes where nome = ?";
//            PreparedStatement stmt = con.prepareStatement(sql);
//            stmt.setString(1, cpf);
//
//            ResultSet rs = stmt.executeQuery();
//            Clientes obj = new Clientes();
//
//            if (rs.next()) {
//
//                obj.setId(rs.getInt("id"));
//                obj.setNome(rs.getString("nome"));
//                obj.setRg(rs.getString("rg"));
//                obj.setCpf(rs.getString("cpf"));
//                obj.setEmail(rs.getString("email"));
//                obj.setTelefone(rs.getString("telefone"));
//                obj.setCelular(rs.getString("celular"));
//                obj.setCep(rs.getString("cep"));
//                obj.setEndereco(rs.getString("endereco"));
//                obj.setNumero(rs.getInt("numero"));
//                obj.setComplemento(rs.getString("complemento"));
//                obj.setBairro(rs.getString("bairro"));
//                obj.setCidade(rs.getString("cidade"));
//                obj.setUf(rs.getString("estado"));
//            }
//            return obj;
//        }catch (Exception erro) {
//            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
//            return null;
//        }
//    
//    }
}
