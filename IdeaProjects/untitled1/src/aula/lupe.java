package aula;

import java.util.Scanner;

public class lupe {
    public static void main(String[] args) {

        Scanner Leitura = new Scanner(System.in);

        double TotalNota = 0;
        double media = 0;

        for(int indice = 1; indice <= 3; indice++ ){
            System.out.println("Digite a nota so seu filme");
            TotalNota += Leitura.nextDouble();
        }
        media = TotalNota/3;

        System.out.println(" A media do seu filme é " +media);


    }
}
