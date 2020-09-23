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
public class TesteData {
    public static void main (String[] args) {
        //Criação e instância de um objeto da classe Data
        Data data = new Data ();
        
        //Construção de uma data
        data.setDia (1);
        data.mes = 1;
        data.ano = 2020;
        
        //Imprimindo uma data
        System.out.println("Data: " + data.imprimirData());
        
        //Imprimindo o dia
        System.out.println("Data: " + data.getDia());
        
        
        
           
        }
               
     
    }
    
