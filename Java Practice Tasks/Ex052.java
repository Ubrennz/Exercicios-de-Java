import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Ex052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Quantas pessoas serão adicionadas? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Digite os dados da #" + i + " pessoa: ");
            System.out.print("Pessoa física ou jurídica (F/J)? ");
            char tipoDePessoa = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Digite a renda anual dessa pessoa: ");
            double rendaAnual = sc.nextDouble();

            switch (tipoDePessoa) {
                case 'F':
                    System.out.print("Digite o valor dos gastos com a saúde: ");
                    double gastosComSaude = sc.nextDouble();
                    pessoas.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
                    break;
                case 'J':
                    System.out.print("Digite o número de funcionários: ");
                    int numeroDeFuncionarios = sc.nextInt();
                    pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
                    break;
            }
        }

        double valorTotalDasTaxas = 0.0;
        System.out.println("Dados das pessoas:");

        for (Pessoa pessoa : pessoas) {
            valorTotalDasTaxas += pessoa.taxasPagas();
            System.out.println(pessoa);
        }

        System.out.printf("\nValor total de taxas: %.2f%n", valorTotalDasTaxas);

        sc.close();
    }
}
