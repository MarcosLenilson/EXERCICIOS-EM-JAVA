import java.util.Scanner;

public class Exercicio_11 {
    
    static void quadrado(int a) {
        int quadrado = a * a;
        System.out.println("A quadrado do numero é: " + quadrado);
    }
    
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        quadrado(leitorScanner.nextInt());
        leitorScanner.close();

    }


}
