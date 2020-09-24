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
public class Elevador {
    //Atributos
    int andarAtual;
    double peso;
    boolean portaAberta;
    
   //Método
    public void imprimirStatus() {
        System.out.println("Andar Atual: " + andarAtual);
        System.out.printf("Peso %.3fkg\n", peso);
        System.out.println(portaAberta?"Porta aberta!\n\n":"Porta fechada!\n\n");
    }
   
   public void subir (int andarDesejado) {
       if(andarDesejado <= ULTIMO_ANDAR) {
           while(andarDesejado > andarAtual) {
               andarAtual++;
               System.out.println("Andar" + andarDesejado);
           }
           
           andarAtual++;
           System.out.println(andarAtual + "° andar...");
       }
   }
    
   public void descer(int andarDesejado) {
       while(andarDesejado < andarAtual) {
           andarAtual--;
           System.out.println(andarAtual + "° andar...");
       }
   }
}
