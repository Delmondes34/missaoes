package cauculadora;

public class dever {


    public static void main(String[] args){



        int dia = 6;
        switch (dia) {
            case 1:
                System.out.println("hoje e segunda feira");
                break;
            case 2:
                System.out.println("hoje e tersa feira");
                break;
            case 3:
                System.out.println("hoje e quarta feira");
                break;
            case 4:
                System.out.println("hoje e quinta feira");
                break;
            case 5:
                System.out.println("hoje e sexta feira");
                break;
            case 6:
                System.out.println("hoje e sabado");
                break;
            case 7:
                System.out.println("hoje e domingo");
                break;
            default:
                System.out.println("não esiste mais este dia, e ele não foi encontrado");
        }
        int contador = 10;
        while (contador >= 0){
            System.out.println("contador" + contador);
            contador--;
        }
        int pares = 0 ;
        for (pares =  0; pares <= 100; pares += 2){
            System.out.println(pares);
        }
        System.out.println("final do codigo contador ="+ pares);

    }
}
