package Lista_Exercicios_W3resource;

import java.util.Scanner;

public class Wexercicio_05 {
    public static void main(String[] args) {
        Scanner leitoScanner = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite num1: ");
        num1 = leitoScanner.nextInt();

        System.out.println("Digite num2: ");
        num2 = leitoScanner.nextInt();

        System.out.println(num1 + " x "+ num2 + " = " + num1 * num2 );

        leitoScanner.close();
    }
}
