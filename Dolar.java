import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Quantidade de Dolar em mãos:");
            float d=s.nextFloat();
            System.out.println("Digite o valor da cotação do dolar hoje: ");
            float c=s.nextFloat();
            float r =(float) c*d;
            System.out.println("O valor em reais é igual a "+ r);
        }
    }
