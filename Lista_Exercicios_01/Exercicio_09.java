import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        int num1, quintaParte;

        System.out.println("Digite um numero: ");
        num1 = leitorScanner.nextInt();

        quintaParte = num1 * 1/5;

        System.out.println("A quinta parte do numero " + num1 + " é: " + quintaParte);
        
    }
}
