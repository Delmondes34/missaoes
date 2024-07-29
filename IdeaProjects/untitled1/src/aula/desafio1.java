package aula;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;

        System.out.println("digite seu nome");

        nome = ler.nextLine();
        System.out.println("Ola " + nome + " espero que vc tenha uma boa experiencia");

        int conta = 0;
        double saldo = 0;
        double acrecentar = 0;
        double retirar = 0;
        System.out.println("digite quanto vc quer depositar para seu saldo inicial");
        saldo = ler.nextDouble();


        while (conta < 4) {
            System.out.println("digite 1 para ver saldo");
            System.out.println("digite 2 para acrecentar saldo");
            System.out.println("digite 3 para retirar saldo");
            System.out.println("digite 4 para sair");
            conta = ler.nextInt();
            if (conta == 1) {
                System.out.println("seu saldo é " + saldo);
            } else if (conta == 2) {
                System.out.println("quanto vc quer depositar ");
                acrecentar = ler.nextDouble();
                System.out.println("Seu saldo e " + (acrecentar + saldo));
                saldo += acrecentar;
            } else if (conta == 3) {
                System.out.println("quanto vc quer sacar ");
                retirar = ler.nextDouble();
                if (saldo >= retirar) {
                    saldo = saldo - retirar ;
                    System.out.println("vc retirou " + retirar + "seu saldo é " + saldo);

                } else {
                    System.out.println("vc não ten dineiro suficiente para gastar");
                }
            } else if (conta == 4) {
                System.out.println("foi bom fazer negocios com vc " +nome+" caso querira saber vc tem "+ saldo+" na sua conta");
                break;
            }
        }
    }
}
