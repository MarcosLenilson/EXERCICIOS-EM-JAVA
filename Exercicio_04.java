import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner leitoScanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double ipi = leitoScanner.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = leitoScanner.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorPeca1 = leitoScanner.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        int quantidadePeca1 = leitoScanner.nextInt();
        

        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = leitoScanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorPeca2 = leitoScanner.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        int quantidadePeca2 = leitoScanner.nextInt();

        
        double valorTotal = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (ipi / 100 + 1);

        System.out.println("Valor total a ser pago: " + valorTotal);

        leitoScanner.close();
    }
}
