import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Quantos anos voce tem??");
        double idade = s.nextDouble();
        double anos = 365*idade;
        double mes = 12;
        System.out.println(" Idade= " + idade);
        System.out.println(" Quantidade de Mêses " + mes * idade);
        System.out.println(" Dias vividos: " + anos);
           
    }

}