import entities.Trabalhador;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Ex045 {
    private static List<Trabalhador> trabalhadores = new ArrayList<>();
    private static String[] niveisTrabalhador = {"JUNIOR", "PLENO", "SENIOR"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---SISTEMA DO TRABALHADOR---");
        System.out.print("Digite o departamento: ");
        String departamento = sc.nextLine();

        System.out.print("Digite o nome do trabalhador: ");
        String nome = sc.nextLine();
        int nivel = 0;

        do {
            System.out.println("[1] Para junior\n[2] Para Pleno\n[3] Para Senior");
            System.out.print("Digite o nivel do trabalhador: ");
            nivel = sc.nextInt();
        } while (nivel != 1 && nivel != 2 && nivel != 3);

        System.out.print("Digite o salário minímo: ");
        double salarioMinimo = sc.nextDouble();
        System.out.print("Digite quantos contratos o trabalhador tem: ");
        int numerosContratos = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numerosContratos; i++) {
            System.out.print("Digite a data do #" + i + " contrato (Dia/Mês/Ano): ");
            LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Digite o valor por hora trabalhada do contrato: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Digite a duração (horas): ");
            int horas = sc.nextInt();
        }

        sc.close();
    }
}
