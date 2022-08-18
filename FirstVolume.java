import java.util.Scanner;

public class FirstVolume {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Digite o valor do Raio: ");
            float r=s.nextFloat();
            System.out.println("Digite o valor da altura: ");
            float h=s.nextFloat();
            float v =(float) (3.14159 * (r * r) *h);
            System.out.println("O valor do volume é igual a "+ v);
        }


    }
}
