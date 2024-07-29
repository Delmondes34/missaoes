import cauculadora.cauculadora;
public class Main {
    public static void main(String[] args) {
        cauculadora calc = new cauculadora();

        float divicao = calc.divicao(50, 500);
        System.out.println(divicao);
        float porcentual = calc.multiplicacao (divicao,100);
        System.out.println("o resultado e"+ porcentual +"%");
    }

}
