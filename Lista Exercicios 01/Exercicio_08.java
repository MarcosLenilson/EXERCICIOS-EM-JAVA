import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;


        System.out.println("Digite um numero: ");
        num1 = leitorScanner.nextInt();

        System.out.println("Digite outro numero: ");
        num2 = leitorScanner.nextInt(); 

        System.out.println("Digite outro numero: ");
        num3 = leitorScanner.nextInt(); 

        int media = (num1 + num2 + num3) / 3;
        System.out.println("A Média dos numeros é: " + media);

        leitorScanner.close();
    }
}
