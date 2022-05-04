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
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost/BDVENDAS","root","");
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
}
