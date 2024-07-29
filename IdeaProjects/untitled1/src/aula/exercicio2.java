package aula;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner lei = new Scanner(System.in);

        System.out.println("digite dois numero inteiro");
        int a = lei.nextInt();
        int b = lei.nextInt();

        if (a == b){
            System.out.println("Os numeros sãO iguais");
        }
        else if(a < b){
            System.out.println("0 "+a +" e menor que " +b);
        }
        else if(a > b) {
            System.out.println("0 "+a +" e maior que " +b);
        }






    }
}