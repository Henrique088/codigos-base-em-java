/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprofessor;

/**
 *
 * @author Henrique
 */
public class CalculadoraProfessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // constante do Pi
        float pi = 3.14f;
        
        // raio - informado pelo professor
        float raio = 5.3f;
        
        // area eh igual ao raio ao quadrado multiplicado por Pi
        float area = raio * raio * pi;
        int areaSemCasasDecimais = (int) area;
        
        System.out.println("Resultado: " + area);
        System.out.println("Resultado   sem     casas   decimais:   "   +areaSemCasasDecimais);
    }
    
}
