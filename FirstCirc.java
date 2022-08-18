import java.util.Scanner;

public class FirstCirc {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite o valor do Raio: ");
            float r=s.nextFloat();
            float v =(float) (3.14159 * (r * r));
            System.out.println("A area da circunferencia é igual a "+ v);
    }
}
