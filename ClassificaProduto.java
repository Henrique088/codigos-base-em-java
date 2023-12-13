/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificaproduto;

import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class ClassificaProduto {

    

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
       
        int[] codigoProduto =new int [10];
        String corredor = null;
        int i=0,cont=0;
        do{
            
            System.out.print("Digite o codigo do produto: ");
            codigoProduto[i] = entrada.nextInt();
            
            i++;
            cont++;
        }while(codigoProduto[i] !=0);
        
        for(int j=0;j<=cont;j++){
        if(codigoProduto[i] != 0){
               
           if(codigoProduto[i] % 2 ==0){
               corredor = "direita";
           }
           else{
               corredor = "esquerda";
           }
           
           
           
        }
        }
        for (i = 8; i>=1; i--){
            if(codigoProduto[i] % i ==0){
                    System.out.println("O produto de codigo:" + codigoProduto + " ficara no corredor da " + corredor + " e na gaveta " + i);
                     break;
            }
        }
        
    }
    
}
