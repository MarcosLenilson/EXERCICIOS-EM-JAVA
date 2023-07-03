import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        
        final double salarioMin = 1320;

        System.out.print("Digite o valor do seu salario: ");
        double salarioUsuario = leitorScanner.nextDouble();

        double qntSalarioMin = salarioUsuario / salarioMin;

        String valorFormatado = new DecimalFormat("#,##0.00").format(qntSalarioMin);

        System.out.println("Você recebe " + valorFormatado + " salarios minimos");

        leitorScanner.close();
    }
}
