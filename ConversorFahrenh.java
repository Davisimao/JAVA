import java.util.Scanner;

public class ConversorFahrenh {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Escreva uma temperatura em graus Fahrenheit:");
            int f= s.nextInt();
            double c= (f - 32) * (5.0/9.0);
            System.out.println("A temperatura em Celsius é " + c);
        }
    }
}
