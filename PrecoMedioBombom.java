/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precomediobombom;

/**
 *
 * @author Henrique
 */
public class PrecoMedioBombom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ultimos precos de vendas dos produtos do comerciante
       int preco1 = 5;
       int preco2 = 8;
       int preco3 = 12;
       
       int mediaPrecos = (preco1 + preco2 + preco3) / 3;
       
       System.out.println("\"Sistema de Calculo de Media\"");
       System.out.println("Preco 1: " + preco1);
       System.out.println("Preco 2: " + preco2);
       System.out.println("Preco 3: " + preco3);
       System.out.println("\nMedia dos precos:\n" + mediaPrecos);
    }
    
}
