import java.util.Scanner;

public class Exercicio_10 {
    // FUNÇÃO
    static void soma(int a, int b) {
        int soma = a + b;
        System.out.println("A soma dos numeros é: " + soma);
    }

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        int num1;
        int num2;
        System.out.println("Digite um numero: ");
        num1 = leitorScanner.nextInt();
        
        System.out.println("Digite outro numero: ");
        num2 = leitorScanner.nextInt();
        
        soma(num1, num2);

        if(num1 < num2){
            System.out.println("O menor numero digitado foi: " + num1);
        }else{
            System.out.println("O menor numero digitado foi: " + num2);
        }
        return ;
    }
}