/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author adaatii
 * @author diego
 * Revisão de código
 */
public class TestaConexao {

    /**
     * Método teste de conexão
     * Testa a conexão com o banco de dados 
     * Retorna a informação se teve sucesso na conexão com o banco
     */
    public static void main(String[] args) {

        try {

            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Ocorreu o erro: " + erro);

        }
    }

    /**
     * Método teste de conexão con internet
     * Testa se a conexão com o a internet para busca do WEBSERVICE 
     * @return Retorna a informação se teve sucesso na conexão com o banco
     */

    public static boolean testarInternet(String address) {
        try {
            URL url = new URL(address);
            URLConnection connection = url.openConnection();
            connection.connect();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
