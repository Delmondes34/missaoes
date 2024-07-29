package aula2;

import java.util.Scanner;

public class carro {
    public static void main(String[] args) {

        Scanner carro = new Scanner(System.in);

    String modelo;
    int anoDeCriacao;
    String corDoCarro;
    int anoAtual = 2024;

        System.out.println("digite qual e o modelo do carro");
        modelo = carro.nextLine();

        System.out.println("digite de que ano e  carro");
        anoDeCriacao = carro.nextInt();

        System.out.println("digite a cor do carro");
        limpa(carro);
        corDoCarro = carro.nextLine();

        System.out.println("seu carro e um " + modelo + " ele tem a idade de " + (anoAtual - anoDeCriacao) + "anos da cor de " + corDoCarro);


    }
    private static void limpa(Scanner scaner){

        if (scaner.hasNextLine()){
            scaner.nextLine();
        }
    }
}