package aula4;

import java.util.ArrayList;

public class acao {
    public static void main(String[] args) {

   Pessoa pessoa1 = new Pessoa();
   pessoa1.setNome("Jose");
   pessoa1.setIdade("25");

   Pessoa pessoa2 = new Pessoa();
   pessoa2.setNome("Ariel");
   pessoa2.setIdade("19");

   Pessoa pessoa3 = new Pessoa();
    pessoa3.setNome("Sam");
    pessoa3.setIdade("36");

    ArrayList<Pessoa> ListaDePessoa = new ArrayList<>();

    ListaDePessoa.add(pessoa1);
        System.out.println("tamanho da lsita de pessoas " + ListaDePessoa.size());

    ListaDePessoa.add(pessoa2);
        System.out.println("tamanho da lsita de pessoas " + ListaDePessoa.size());

    ListaDePessoa.add(pessoa3);
        System.out.println("tamanho da lsita de pessoas " + ListaDePessoa.size());

        System.out.println("quantidade de pessoas " + ListaDePessoa.size());
        System.out.println(ListaDePessoa.get(0));
        System.out.println(ListaDePessoa);






    }
}