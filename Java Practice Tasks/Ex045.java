import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Trabalhador;
import entities.Departamento;
import entities.HoraContrato;
import entities.enums.NivelTrabalhador;

public class Ex045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do departamento: ");
        Departamento departamento = new Departamento(sc.nextLine());

        System.out.println("Digite os dados do trabalhador:");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.next().toUpperCase();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, departamento);

        System.out.print("Quantos contratos esse trabalhador tem? ");
        int numeroContratos = sc.nextInt();

        for (int i=1; i<=numeroContratos; i++) {
            sc.nextLine();

            System.out.println("Digite os dados do contrato " + i);
            System.out.print("Data (Dia/Mês/Ano): ");
            LocalDate dataContrato = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Horas: ");
            int horasContrato = sc.nextInt();

            trabalhador.addContratos(new HoraContrato(dataContrato, valorPorHora, horasContrato));
            System.out.println("Contrato " + i + " adicionado com sucesso!");
        }

        System.out.print("Digite o ano e mês para calcular a renda (mês/ano): ");
        String data = sc.next();

        System.out.println(trabalhador);
        System.out.println("Renda para " + data + ": " + trabalhador.renda(data));

        sc.close();
    }
}
