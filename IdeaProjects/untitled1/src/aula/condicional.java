package aula;

import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        boolean clienteplus = true;
        boolean incluidoNoPlanoBasico = false;

        System.out.println("digite o ano do filme");
        int anoDeLancamento = leitura.nextInt();
        boolean lancamento = anoDeLancamento <= 2022;


        if (lancamento) {
            System.out.println("filme antigo!");

        } else {
            System.out.println("filme no lançamento");

        }

        if (clienteplus || incluidoNoPlanoBasico){
            System.out.println("filme liberado");
        }
        else {
            System.out.println("O filme não esta liberado");
        }










    }
}