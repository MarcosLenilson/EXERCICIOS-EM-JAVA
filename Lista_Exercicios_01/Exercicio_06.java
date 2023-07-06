import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        int numero, antecessor, sucessor;
        
        System.out.println("Digite um numero qualquer: ");
        numero = leitorScanner.nextInt();
        leitorScanner.nextLine();
        
        antecessor =numero-1;
        sucessor = numero+1;

        System.out.println("O valor do antecessor: " + antecessor);
        System.out.println("O valor do sucessor: " + sucessor);
        
        leitorScanner.close();
    }
}
