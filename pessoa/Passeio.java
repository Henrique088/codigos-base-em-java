/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
package pessoa;

public class Passeio {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "José";

        p1.cachorro = new Cachorro();
        
        p1.cachorro.nome = "Bidu";
        p1.cachorro.idade = 3;
        p1.cachorro.raca = "Boxer";
        p1.cachorro.sexo = 'M';
        
        Caminhada c = new Caminhada();
        c.andar(p1);
}
}
