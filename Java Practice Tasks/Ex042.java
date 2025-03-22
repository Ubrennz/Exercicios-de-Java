import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;

public class Ex042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("[1] Para ver a data local\n[2] Para digitar uma data");
            System.out.println("[3] Para ver a data-hora local\n[4] Para digitar uma data-hora");
            System.out.print("[5] Para ver o horário de Londrdes\n[0] Para sair\nDigite a opçao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    LocalDate dataLocal = LocalDate.now();
                    System.out.println("Data Local do seu dispositivo: " + dataLocal);
                    break;
                case 2:
                    System.out.print("Digite uma data, utilizando o formato ano-mês-dia: ");
                    LocalDate inputLocalDate = LocalDate.parse(sc.next());
                    System.out.println("Data digitada: " + inputLocalDate);
                    break;
                case 3:
                    LocalDateTime dataHoraLocal = LocalDateTime.now();
                    System.out.println("Data-hora local do seu dispositivo: " + dataHoraLocal);
                    break;
                case 4:
                    System.out.println("Exemplo: 2025-10-03T10:30:02");
                    System.out.print("Digite uma data com hora, utilizado o formato ano-mês-dia T hora:minutos:segundos: ");
                    LocalDateTime inputLocalDateTime = LocalDateTime.parse(sc.next());
                    System.out.println("Data-hora digitada: " + inputLocalDateTime);
                    break;
                case 5:
                    Instant londres = Instant.now();
                    System.out.println("Horário de Londres (GMT): " + londres);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
