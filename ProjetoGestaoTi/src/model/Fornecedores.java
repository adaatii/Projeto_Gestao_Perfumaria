/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
*
* @author adaatii
* @author diego 
* Revisão de código
*/
public class Fornecedores extends Clientes {
/**
 * Método Fornecedores
 * Fornecedores que contem o atributuo:CNPJ
 */
	public Fornecedores() {
	}
		
    //Atributos
    private String cnpj;
    
    //Getters e Setters
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString(){
        return this.getCnpj();
     
    }
}
