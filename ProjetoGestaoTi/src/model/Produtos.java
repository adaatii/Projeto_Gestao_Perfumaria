/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author diego
 */
public class Produtos {
    
        //Atributos
    private int Varcodigo;
    private char Vardescricao, Varfornecedor ;
    private double Varperco;
    
    
        //Getters e Setters

   public int getVarcodigo(){
       return Varcodigo;
   }
   public  void setVarcodigo(int Varcodigo){
       this.Varcodigo=Varcodigo;
   }
   
   public int getVardescricao(){
       return Vardescricao;
   }
   public  void setVardescricao(char Vardescricao){
       this.Vardescricao=Vardescricao;
   }

   public double getVarperco(){
       return Varperco;
   }
   public  void setVarperco(double Varperco){
       this.Varperco=Varperco;
   }
   
   public int getVarfornecedor(){
       return Varfornecedor;
   }
   public  void setVarfornecedor(char Varfornecedor){
       this.Varfornecedor=Varfornecedor;
   }

    public void setVarcodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
