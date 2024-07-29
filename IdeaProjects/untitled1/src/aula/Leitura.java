package aula;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner Leitura = new Scanner(System.in);
        System.out.println("Digite o nome do seu filme favorito");

        String filme = Leitura.nextLine();

        System.out.println(" Digite o ano de lançamento ");
        int anoDeLansamento = Leitura.nextInt();

        System.out.println(" Qual e sua nota para o filme");
        double nota = Leitura.nextDouble();

        System.out.println(" O seu Filme Favorito é " + filme);
        System.out.println("foi Lançado em " + anoDeLansamento);
        System.out.println(" Sua nota foi " +nota);









    }
}