/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Henrique
 */
public class Caminhada {
    public void andar(Pessoa pessoa){
        System.out.println("Eu \"" + pessoa.nome + "\"" + "estou andando com o \""+ pessoa.cachorro.nome + "\"");
    }
}
