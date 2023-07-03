/**
 * Ainda não está certo os parametros do mes, pois temos que fazer com que seja pego o DIA e MES de aniversário
 * CASO minha data atual seja MAIOR ou MENOR que o DIA e MES de aniversário, temos que calcular a diferença de dias
 * 
 */


// import java.util.Calendar;

import java.util.Scanner;

public class Exercicio_01{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // 2. instanciando e criando um objeto Scanner

        // Calendar c = Calendar.getInstance();
        // c.set(Calendar.MONTH, Calendar.JULY + 1);
        // System.out.println("Mês atual " + c.get(Calendar.MONTH));
                
        int idade, meses, dia;
        
        System.out.printf("Informe sua idade: ");        
        idade = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        System.out.println(idade * 365);
        
        System.out.printf("Informe seu mes de nascimento: ");
        meses = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)   

        System.out.printf("Informe seu dia de nascimento: ");
        dia = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)
        
        long resultado = (idade * 365) + (meses * 30) + dia;
        
        System.out.println("Total de dias: "+ resultado);

    }
}    