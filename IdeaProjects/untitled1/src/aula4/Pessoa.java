package aula4;

//Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
//No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
//Adicione pelo menos três pessoas à lista utilizando o método add.
//Imprima o tamanho da lista utilizando o método size.
//Imprima a primeira pessoa da lista utilizando o método get.Imprima a lista completa

import org.w3c.dom.ls.LSOutput;

import java.security.PublicKey;

public class Pessoa {


    private String Nome;
    private String Idade;
    private String Nota;

    public String getNome() {
        return Nome;

    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String idade) {
        Idade = idade;
    }
    @Override
    public String toString(){
        return "Nome " + Nome + "indade " + Idade;
    }


}