package aula;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double TotalNota = 0;
        double Media = 0;
        int QuatindadesDeNotas= 0;
        double nota = 0.0;

        while (nota!= -1){
            System.out.println("Digite a nota ou -1 para apresentar o calculo");
            System.out.println("digite a nota do filme: " );
            nota = leitura.nextDouble();
            if (nota <0 || nota >10) {
                if (nota!= -1) {
                    System.out.println("Nota invalida, somente numereos de 0 a 10");
                }
                continue;
            }
            TotalNota += nota;
            QuatindadesDeNotas++;
        }


        Media = TotalNota/QuatindadesDeNotas;
        System.out.println("Seu filme tem média: " +Media);

    }
}