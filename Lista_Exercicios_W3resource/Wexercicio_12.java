package Lista_Exercicios_W3resource;

import java.util.Scanner;

public class Wexercicio_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        
        
        System.out.println("Digite o valor de a: ");
        a = sc.nextInt();

        
        System.out.println("Digite o valor de b: ");
        b = sc.nextInt();

        
        System.out.println("Digite o valor de c: ");
        c = sc.nextInt();
       

        System.out.println("A media dos da soma dos valores é : " + ( a + b + c ) /3);

        sc.close();
    }
}
