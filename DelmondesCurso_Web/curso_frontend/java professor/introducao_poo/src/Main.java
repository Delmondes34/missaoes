import br.senac.df.introducaopoo.humano.Homem;
import br.senac.df.introducaopoo.humano.Humano;
import br.senac.df.introducaopoo.partesDoCorpo.Braco;
import br.senac.df.introducaopoo.partesDoCorpo.Mao;
import br.senac.df.introducaopoo.partesDoCorpo.Olho;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        intancias();

        //operadores

        //operador de atribuicao
        int a = 10;

        //operador de igualdade
        if(a == 10){
            System.out.println("A é igual a 10");
        }

        //operador de diferente
        if(a != 5){
            System.out.println("A é diferente de 5");
        }

        //operador de maior
        if(a > 5){
            System.out.println("A é maior que 5");
        }

        //operador de menor
        if(a < 15){
            System.out.println("A é menor que 15");
        }

        //operador de maior ou igual
        if(a >= 10){
            System.out.println("A é maior ou igual a 10");
        }

        //operador de menor ou igual
        if(a <= 10){
            System.out.println("A é menor ou igual a 10");
        }

        //operador de e
        if(a == 10 && a > 5){
            System.out.println("A é igual a 10 e maior que 5");
        }

        //operador de ou
        if(a == 10 || a > 5){
            System.out.println("A é igual a 10 ou maior que 5");
        }

        //operador de negacao
        if(!(a == 5)){
            System.out.println("A é diferente de 5");
        }

        //operador de incremento
        a++;
        System.out.println("Incremento: " + a);

        //operador de decremento
        a--;
        System.out.println("Decremento: " + a);

        //operador de soma
        a = a + 5;

        //operador de subtracao
        a = a - 5;

        //operador de multiplicacao
        a = a * 5;

        //operador de divisao
        a = a / 5;


        //operador de resto
        a = a % 5;

        //operador de concatenacao
        String nome = "Jorge";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);

        //operador de atribuicao composta
        a += 5; //a = a + 5;
        a -= 5;
        a *= 5;
        a /= 5;
        a %= 5;

        //operador de incremento e decremento
        a = 10;
        System.out.println("Incremento: " + ++a);
        System.out.println("Decremento: " + --a);
        System.out.println("Incremento: " + a++);
        System.out.println("Decremento: " + a--);
        

    }

    private static void intancias() {
        // declaracao de variaveis <tipo> <nome> = <valor>;
        Homem jorge = new Homem("Jorge");

        jorge.setBracoDireito(new Braco());
        jorge.setBracoEsquerdo(new Braco());
        jorge.getBracoDireito().setMao(new Mao());
        jorge.getBracoEsquerdo().setMao(new Mao());

        // acessar propriedades de um objeto usa o ponto (.) <objeto>.<propriedade>
        jorge.getBracoDireito().getMao().fecharMao();
        jorge.getBracoEsquerdo().getMao().abrirMao();

        jorge.setOlhoDireito(new Olho());
        jorge.setOlhoEsquerdo(new Olho());

        jorge.getOlhoDireito().setCor("Azul");
        jorge.getOlhoDireito().setCor("Azul");
        jorge.getOlhoDireito().setTamanho(2);
        jorge.getOlhoDireito().setTamanho(2);

        jorge.cortarArvore();
    }
}