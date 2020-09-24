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
public class TesteElevador {
    public static void main(String [] args) {
        //Criação e instância do objeto da classe Elevador
        Elevador elevador = new Elevador();
     
        //Construindo o objeto elevador
        elevador.andarAtual = 0;
        elevador.peso = Math.random() * 1000;
        elevador.portaAberta = true;
        
         //Exibindo o status do elevador
         System.out.println("\n\t\t\t -- Elevador Parado -- \n");
         elevador.imprimirStatus();
         
         //Subindo..
         elevador.subir(5);
         
         //Exibindo o status do elevador no quinto andar
         System.out.println("\n\t\t\t -- Elevador no Quinto andar -- \n");
         elevador.imprimirStatus();
         
         //Descendo...
         elevador.descer(0);
        
         
         //Exibindo o status do elevador do térreo
         
    }
    
}
