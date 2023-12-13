/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DescobreAnoBissexto;

/**
 *
 * @author Henrique
 */
import java.util.Scanner;

public class DescobreAnoBissexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ano: ");
        int ano = entrada.nextInt();
        
        if (ano % 400 == 0) { 
System.out.println("O ano \"" + ano + "\" eh um ano bissexto");
} else if (ano % 4 == 0) {
if (ano % 100 != 0) { 
System.out.println("O ano \"" + ano + "\" eh um ano bissexto");
} else {
System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
}
} else {
System.out.println("O ano \"" + ano + "\" nao eh um ano bissexto");
}
    }
    
}
