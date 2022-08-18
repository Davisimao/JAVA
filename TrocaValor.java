import java.util.Scanner;

public class TrocaValor {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite o valor de A: ");
            float input1 =s.nextFloat();
            System.out.println("Digite o valor de B: ");
            float input2 =s.nextFloat();
            float b =input1 ;
            float a = input2;
            System.out.println("O valor de B é "+ b);
            System.out.println("O valor de A "+a);
        }


    }
}
