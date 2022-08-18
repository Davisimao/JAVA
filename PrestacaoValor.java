import java.util.Scanner;

public class PrestacaoValor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Digite o valor da prestação:");
        float v= s.nextFloat();
        System.out.println("Digite o valor da taxa da prestação:");
        float t=s.nextFloat();
        System.out.println("Digite o tempo em que a prestação esta em atraso;");
        float temp=s.nextFloat();
        float r=v + (v * (t/100) * temp);
        System.out.println("O valor da prestaçao em atraso é: "+r);
    }
    
}
