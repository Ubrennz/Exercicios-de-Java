import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Contrato;
import service.ContratoServico;
import service.PayPalService;

public class Ex059 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite os dados do contrato:");
            System.out.print("Número: ");
            int numeroContrato = sc.nextInt();
            System.out.print("Data (Dia/mês/Ano): ");
            LocalDate dataContrato = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Valor do contrato: ");
            double valorTotalContrato = sc.nextDouble();
            Contrato contrato = new Contrato(numeroContrato, dataContrato, valorTotalContrato);

            System.out.print("Digite o número das parcelas do contrato: ");
            int numeroParcelasContrato = sc.nextInt();

            ContratoServico contratoServico = new ContratoServico(new PayPalService());
            contratoServico.processoContrato(contrato, numeroParcelasContrato);

            contrato.getParcelas().forEach(parcela -> System.out.println(parcela.toString()));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
