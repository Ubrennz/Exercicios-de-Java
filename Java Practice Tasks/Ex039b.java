import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.FuncionarioB;

public class Ex039b {
    public static boolean verificarIdDuplicado(List<FuncionarioB> funcionarios, int id) {
        for (FuncionarioB funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<FuncionarioB> funcionarios = new ArrayList<>();

        System.out.print("Digite o número de de funcionarios: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite os dados dos funcionarios:");
        for (int i=0; i<n; i++) {
            System.out.print("ID: ");
            int idFuncionario = sc.nextInt();
            sc.nextLine();

            if (!verificarIdDuplicado(funcionarios, idFuncionario)) {
                System.out.print("Nome: ");
                String nomeFuncionario = sc.nextLine();
                System.out.print("Salário: ");
                double salarioFuncionario = sc.nextDouble();

                funcionarios.add(new FuncionarioB(idFuncionario, nomeFuncionario, salarioFuncionario));
            } else {
                System.out.println("Funcionario já está cadastrado, digite outro ID");
                i--;
            }
        }

        System.out.print("Digite i número do ID do funcionario que terá o aumento: ");
        int idFuncionario = sc.nextInt();

        if (verificarIdDuplicado(funcionarios, idFuncionario)) {
            System.out.print("Digite a porcentagem do aumento: ");
            double porcentagem = sc.nextDouble();

            for (FuncionarioB funcionario : funcionarios) {
                if (funcionario.getId() == idFuncionario) {
                    funcionario.aumentoDoSalario(porcentagem);
                }
            }

        } else {
            System.out.println("O funcionario não existe");
        }

        funcionarios.forEach(funcionario -> System.out.println(funcionario.toString()));

        sc.close();
    }
}
