package aula2;

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        double saldo = 0;
        int escolhas = 0 ;
        double mn = 0;

        System.out.println("digite seu nome");
        nome = ler.nextLine();

        System.out.println("digite teu saldo inicial");
        saldo = ler.nextDouble();

    while (escolhas < 5){
        System.out.println("escolha 1 para ver saldo");
        System.out.println("escolha 2 para depositar");
        System.out.println("escolha 3 para retira");
        System.out.println("escolha 4 para sair");

        escolhas = ler.nextInt();
     if (escolhas == 1){
         System.out.println("seu saldo e" + saldo);

     } else if (escolhas == 2){
         System.out.println("digite o quanto vc quer colocar");
         mn = ler.nextDouble();
         System.out.println("seu soudo e " +(saldo + mn) + " reais" );

     } else if (escolhas == 3) {
         System.out.println("digite o quanto vc quer retira");
         mn = ler.nextDouble();
         if (saldo < mn){
             System.out.println("saldo insuficiente para retirada");
         }else {
             System.out.println("vc tem " + (saldo - mn));
         }
     }else if (escolhas == 4){
         System.out.println("senhor " + nome + "vc tem em seu saldo o total de "+ saldo +" foi bom fazer negocios com vc." );

         break;
     }

    }}
}