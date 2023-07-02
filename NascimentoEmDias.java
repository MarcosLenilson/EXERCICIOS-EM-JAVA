import java.util.Scanner;
 
public class NascimentoEmDias{
  public static void main(String args[]){
    // vamos usar um objeto Scanner para ler a entrada
    // do usuário
    Scanner entrada = new Scanner(System.in);
     
    // vamos ler a quantidade de anos
    System.out.print("Quantidade de anos: ");
    int anos = Integer.parseInt(entrada.nextLine());
     
    // vamos ler a quantidade de meses
    System.out.print("Quantidade de meses: ");
    int meses = Integer.parseInt(entrada.nextLine());
     
    // vamos ler a quantidade de dias
    System.out.print("Quantidade de dias: ");
    int dias = Integer.parseInt(entrada.nextLine());
     
    // vamos calcular a quantidade de dias
    int quant_dias = (anos * 365) + (meses * 30) + dias;
     
    // e mostramos o resultado
    System.out.println("Idade em dias: " + quant_dias);
  }
} 
