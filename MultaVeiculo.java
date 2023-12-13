/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multaveiculo;

/**
 *
 * @author Henrique
 */
import java.util.Scanner;
public class MultaVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tipo do veiculo (passeio, caminhao)");
        String tipoVeiculo = entrada.nextLine();
        System.out.println("Velocidade maxima da via");
        int velocidadeMaxima = entrada.nextInt();
        System.out.println("Velocidade do veiculo");
        int velocidadeVeiculo = entrada.nextInt();
        
        
        if (tipoVeiculo.equals("passeio") && velocidadeVeiculo > velocidadeMaxima * 1.1) {
        System.out.println("Multa");
        } else if (tipoVeiculo.equals("caminhao") && velocidadeVeiculo > velocidadeMaxima * 1.05)
        {
        System.out.println("Multa");
        }
        }
    
    
}
