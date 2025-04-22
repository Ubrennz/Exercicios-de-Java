import entities.Trabalhador;
import entities.HoraContrato;
import entities.Departamento;
import entities.enums.NivelTrabalhador;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Ex045 {
    private static NivelTrabalhador[] niveisTrabalhador = {NivelTrabalhador.JUNIOR, NivelTrabalhador.PLENO, NivelTrabalhador.SENIOR};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---SISTEMA DO TRABALHADOR---");
        System.out.print("Digite o departamento: ");
        Departamento departamento = new Departamento(sc.nextLine());

        System.out.print("Digite o nome do trabalhador: ");
        String nome = sc.nextLine();
        int opcaoNivel;

        do {
            System.out.println("[0] Para junior\n[1] Para Pleno\n[2] Para Senior");
            System.out.print("Digite o opcaoNivel do trabalhador: ");
            opcaoNivel = sc.nextInt();
            sc.nextLine();
        } while (opcaoNivel != 0 && opcaoNivel != 1 && opcaoNivel != 2);

        System.out.print("Digite o salário minímo: ");
        double salarioMinimo = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome, niveisTrabalhador[opcaoNivel], salarioMinimo, departamento);

        System.out.print("Digite quantos contratos o trabalhador tem: ");
        int numerosContratos = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numerosContratos; i++) {
            System.out.print("Digite a data do #" + i + " contrato (Dia/Mês/Ano): ");
            LocalDate dataContrato = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            System.out.print("Digite o valor por hora trabalhada do contrato: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Digite a duração (horas): ");
            int horas = sc.nextInt();

            HoraContrato horaContrato = new HoraContrato(dataContrato, valorPorHora, horas);
            trabalhador.adicionarContrato(horaContrato);
        }

        System.out.print("Digite o mês e o ano para calcular a renda (Mês/Ano): ");
        String mesAno = sc.next();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3, 7));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + departamento.getNome());
        System.out.printf("Renda de %s: %.2f\n", mesAno, trabalhador.renda(mes, ano));

        sc.close();
    }
}
