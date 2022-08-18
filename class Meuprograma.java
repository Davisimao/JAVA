import java.util.Scanner;

class FistImput {
    public static void main(String[] args) {
        Scanner meuScanner=new Scanner(System.in);
        System.out.println("Qual seu nome??");
        
        String nome=meuScanner.nextLine();
        System.out.println("Seu nome é"+ nome);
    } 
}