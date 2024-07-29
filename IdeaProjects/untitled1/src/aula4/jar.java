package aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class jar {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        String menu = """
                1 - adicionar aluno
                2 - Calcular a media 
                3 - remover aluno
                4 - listar aluno
                5 - Exibir aluno com maior media
                6 - Sair
                """;

while (true) {
    int opcao = (int)capturaNumeroDoTeclado(menu);

    {
        switch (opcao) {
            case 1: // adicionar aluno
                String nomeDoNovoAluno = capturaStringDoTeclado("Digite o nome do aluno");
                Aluno novoAluno = new Aluno(nomeDoNovoAluno);

                atribuirNovaNota(novoAluno);
                atribuirNovaNota(novoAluno);
                atribuirNovaNota(novoAluno);


                alunos.add(novoAluno);

                break;

            case 2://Calcular a media

                System.out.println("Listando alunos e suas medias");
                for (int indice = 0;indice <alunos.size(); indice++){
                    Aluno alunoDaLista = alunos.get(indice);
                    System.out.println(alunoDaLista.getNome()+" "+ alunoDaLista.getMedia());
                }

                break;
            case 3://remover aluno
                String nomeDoAlunoParaRemover = capturaStringDoTeclado("Informe o nome do Aluno para removê-lo: ");
                int posicaoDoAlunoNalista = -1;

                for(int indice =0; indice < alunos.size(); indice++) {
                    Aluno alunoDaLista = alunos.get(indice);
                    if (nomeDoAlunoParaRemover.equals(alunoDaLista.getNome())) {
                        posicaoDoAlunoNalista = indice;
                    }
                    break;
                }

            case 4://listar aluno
                    System.out.println(alunos);
                break;
                case 5: //Exibir Aluno com Maior Media

                double maiorMedia = 0;
                Aluno alunoComMaiorMedia = null;
                for(int indice =0; indice<alunos.size(); indice++){
                    Aluno alunoDaLista = alunos.get(indice);
                    if(alunoDaLista.getMedia() > maiorMedia){
                        maiorMedia = alunoDaLista.getMedia();
                        alunoComMaiorMedia = alunoDaLista;
                    }
                }
                System.out.println("Aluno com maior média: "+alunoComMaiorMedia.getNome());
                break;

            case 6://Sair
                System.out.println("sistema Encerrado");
                System.exit(0);
            default:
                System.out.println("Opção Invalida");
                break;


                }
            }
        }
    }

    public  static void atribuirNovaNota(Aluno aluno){
        double nota = capturaNumeroDoTeclado("Informe a nota do aluno: ");
        aluno.adicionarNota(nota);
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
