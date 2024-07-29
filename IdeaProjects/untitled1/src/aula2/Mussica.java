package aula2;

import java.util.Scanner;

public class Mussica {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String musica;
        String artista;
        int anoDeLancamento;
        double avaliacao1;
        double avaliacao2;
        double avaliacao3;
        double numAvalicao;

        System.out.println("digite o nome da musica");
        musica = ler.nextLine();

        System.out.println("digite o nome do artista");
        artista = ler.nextLine();

        System.out.println("digite o ano de lançamento");
        anoDeLancamento = ler.nextInt();

        System.out.println("Digite as avaliações");
        avaliacao1 = ler.nextDouble();
        avaliacao2 = ler.nextDouble();
        avaliacao3 = ler.nextDouble();

        numAvalicao = (avaliacao1 + avaliacao2+ avaliacao3)/3;

        System.out.println("o nome da musica e " + musica + " tem como artista " + artista+ " que foi lançada no ano de " + anoDeLancamento + " e tem a avaliação de " + numAvalicao);

    }
}
