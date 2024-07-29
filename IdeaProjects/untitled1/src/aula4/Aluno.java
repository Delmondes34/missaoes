package aula4;

//Crie um programa Java que gerencie uma lista de alunos. Cada aluno deve ter um nome (String) e uma lista de notas (ArrayList de doubles). O programa deve:
//Permitir ao usuário adicionar novos alunos com seus nomes e notas.
//Calcular e exibir a média das notas de cada aluno.
//Encontrar e exibir o aluno com a maior média.
//Permitir ao usuário remover um aluno pelo nome.

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();

    public Aluno(String nome){
        this.nome = nome;
    }

    public void adicionarNota(double nota){
        notas.add(nota);
    }


    public double getMedia(){
        double somaTotal = 0;
        for (int contador = 0; contador < notas.size(); contador++) {
            somaTotal += notas.get(contador);
        }
        return somaTotal/notas.size();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }


    @Override
    public  String toString(){
        return  this.nome;
    }

}