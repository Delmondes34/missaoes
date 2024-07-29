package aula2;

import java.util.Scanner;

public class Cauculadora {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("digite um numero para ver o seu dobro");

        double numero = num.nextDouble();

        System.out.println("O numro e " + numero + "e o seu dobro e " +(numero + numero));


    }
}