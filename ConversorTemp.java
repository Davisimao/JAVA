import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Escreva uma temperatura em graus Celsius:");
            int c=s.nextInt();
            int f= (9 * c + 160) /5;
            System.out.println("A temperatura em Fahrenheit é " + f);
        }
    }
    
}
