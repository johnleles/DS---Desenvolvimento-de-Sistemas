/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author jwict
 */
public class Data {
    //Atributos
    
   private int dia;
   int mes;
   int ano;  
  
    //Métodos  
    public String imprimirData() {          
        return dia + "/" + mes + "/" + ano;    
  
    
    }
    
    public void setDia(int dia) {
        if (dia >=1 && dia <= 31) {
            this.dia = dia;
            
        }else {
            this.dia = 1;
        }
        this.dia = dia;
        
    }
    
    public int getDia() {
        return this.dia;
    }
}