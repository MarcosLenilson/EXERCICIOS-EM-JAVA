import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Teste__ex01__CalculoDiasAposAniversario {
    public static void main(String[] args) {
        // Data de aniversário
        int diaAniversario = 16;
        int mesAniversario = 5;
        
        // Obter a data atual
        LocalDate dataAtual = LocalDate.now();
        
        // Obter a data do próximo aniversário
        LocalDate proximoAniversario = LocalDate.of(dataAtual.getYear(), mesAniversario, diaAniversario);
        
        // Verificar se o próximo aniversário já passou
        if (proximoAniversario.isBefore(dataAtual) || proximoAniversario.isEqual(dataAtual)) {
            proximoAniversario = proximoAniversario.plusYears(1);
        }
        
        // Calcular a diferença de dias entre o próximo aniversário e a data atual
        long diasPassados = ChronoUnit.DAYS.between(dataAtual, proximoAniversario);
        
        System.out.println("Dias passados desde o ultimo aniversário: " + diasPassados);
    }
}
