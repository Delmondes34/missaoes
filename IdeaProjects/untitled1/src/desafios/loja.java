package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class loja {
    public static void main(String[] args) {

        Scanner entrada =new Scanner(System.in);
    String menu = """
            1)  Exibe as informações de um produto ao digitar seu nome.
            2) Cadastrar produto.
            3) Listar produtos.
            4) Registrar venda.
            5) Relatórios.
            6) Sair.
            
            """;


    ArrayList<vendas> vendas = new ArrayList<>();
    ArrayList<controlheDeestoque> estoque = new ArrayList<>();
    while (true){
        int opcao = (int)capturaNumeroDoTeclado(menu);
        switch (opcao) {

            case 1:

                break;
            case 2:
               String novosProdutos = capturaStringDoTeclado("digite o nome do produto, a quantidade e os pressos de veda e custo dele");
               Produtos produtos =new Produtos(novosProdutos);

                atribuirNovoProduto(produtos);
                atribuirAQuantidade(produtos);
                atribuirPrecoDaVenda(produtos);
                atribuirPrecoDeCusto(produtos);



                produtos.add(estoque);

                break;
            case 3:


                break;
            case 4:

                break;
            case 5:
                System.out.println(estoque);
                break;
            case 6:
                System.out.println("sistema encerrado");
                break;
            default:

                break;


        }
        }

    }
    public static double capturaNumeroDoTeclado(String prompt){
        System.out.print(prompt);
        Scanner entrada = new Scanner(System.in);
        if(entrada.hasNextLine()){
            entrada.hasNextLine();
        }
        return  entrada.nextDouble();
    }

    public static String capturaStringDoTeclado(String prompt) {
        System.out.print(prompt);
        Scanner entrada = new Scanner(System.in);
        if (entrada.hasNextLine()) {
            entrada.hasNextLine();
        }
        return entrada.nextLine();

    }
}