import entities.Empregado;
import entities.EmpregadoTerceirizado;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Empregado> empregados = new ArrayList<>();

        System.out.print("Digite o números de empregados: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Empregado #" + i + ":");
            System.out.print("O empregado é terceirizado (S/N)? ");
            char opcaoEmpregado = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite as horas trabalhadas: ");
            int horasTrabalhadas = sc.nextInt();
            System.out.print("Digite o valor por hora trabalhada: ");
            double valorPorHoraTrabalhada = sc.nextDouble();

            if (opcaoEmpregado == 'S') {
                System.out.print("Digite o valor das despesas adicionais: ");
                double despesaAdicional = sc.nextDouble();

                Empregado empregadoTerceirizado = new EmpregadoTerceirizado(nome, horasTrabalhadas, valorPorHoraTrabalhada, despesaAdicional);
                empregados.add(empregadoTerceirizado);
            } else {
                Empregado empregadoComum = new Empregado(nome, horasTrabalhadas, valorPorHoraTrabalhada);
                empregados.add(empregadoComum);
            }
        }

        System.out.println("\nPagamentos: ");
        empregados.forEach(System.out::println);

        sc.close();
    }
}
