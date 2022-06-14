/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
/**
*
* @author adaatii
* @author diego 
* Revisão de código 
*/
public class ConnectionFactory {
    /**
     * Método Connection:
     * Cria a conexão com o banco de dados 
     * @return Retorna a informação se teve sucesso na conexão com o banco
     */
    public Connection getConnection(){
        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost/BDVENDAS","root","");
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
}
