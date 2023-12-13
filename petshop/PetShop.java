/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author Henrique
 */
public class PetShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Bidu";
        cachorro.idade = 1;
        cachorro.raca = "Boxer";
        cachorro.sexo = 'M';

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);

        Cachorro cachorro02 = new Cachorro();

        cachorro02.nome = "Lupi";
        cachorro02.idade = 5;
        cachorro02.raca = "Bace";
        cachorro02.sexo = 'M';

        System.out.println("Nome: " + cachorro02.nome);
        System.out.println("Idade: " + cachorro02.idade);
        System.out.println("Raça: " + cachorro02.raca);
        System.out.println("Sexo: " + cachorro02.sexo);

    }

}
