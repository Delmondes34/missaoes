package br.senac.df.introducaopoo.humano;

// Herança: Homem é um Humano
// extends: indica a herança de uma classe
public class Homem extends Humano{


    public Homem(String nome) {
        super(nome);
    }

    public String pensar() {
        return "Pensando como um homem";
    }
}
