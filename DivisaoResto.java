import java.util.Scanner;

public class DivisaoResto {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Escreva um número e veja mostre o resto da divisão por 6:");
    int a=s.nextInt();
    int r= a%6 ;
    System.out.println("o quadrado dos número é "+r);
}    
}
