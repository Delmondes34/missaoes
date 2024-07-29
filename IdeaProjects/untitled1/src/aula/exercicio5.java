package aula;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner ler =new Scanner(System.in);

        System.out.println("vc quer caucular o valor do circulo ou quadrado");
        int circulo = 0;
        int num = ler.nextInt();
        if (num == circulo) {
            System.out.println("digite o lado do  quadrado");
            double lado = ler.nextDouble();
            lado = lado * lado;
            System.out.println("o lado e " + lado);
        }



    }
}
