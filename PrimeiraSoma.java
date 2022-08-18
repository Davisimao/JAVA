import java.util.Scanner;

class PrimeiraSoma {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Escreva os números: ");

            int a = s.nextInt();
            int b = s.nextInt();
            int c =a * b;
            System.out.println("A multiplicação dos dois números é " +c);
        }
    }
}