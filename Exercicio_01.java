import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio_01{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner
        int ano = 0;
        int mes = 0;
        int dia = 0;
        int anoAtual = 2023;
        int mesAtual = 7;

        // Data de aniversário
        int diaAniversario = 16;
        int mesAniversario = 5;
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximoAniversario = LocalDate.of(dataAtual.getYear(), mesAniversario, diaAniversario);
        System.out.println(dataAtual);
        System.out.println(proximoAniversario);




        System.out.printf("Informe seu ano de nascimento: ");        
        ano = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        int resultAno = anoAtual - ano;
        long resultDiasAnos = resultAno * 365;
        
        System.out.printf("Informe seu mes de nascimento: ");
        mes = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        int resultMes = mesAtual - mes;
            

        System.out.printf("Informe seu dia de nascimento: ");
        dia = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        
        
        System.out.println("Voce tem "+ resultAno +" anos, "+ resultMes + " meses e "+ dia + " dias!"  );

    }
}    