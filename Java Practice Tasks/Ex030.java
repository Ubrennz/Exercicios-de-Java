import java.util.Scanner;
import entities.Funcionario;

public class Ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario x = new Funcionario();

        System.out.print("Digite o nome do funcionário: ");
        x.nome = sc.nextLine();
        System.out.print("Digite o salário bruto do funcionário: R$");
        x.salarioBruto = sc.nextDouble();
        System.out.print("Digite o valor de desconto do salário do funcionário: R$");
        x.taxa = sc.nextDouble();

        System.out.println("funcionário: " + x.nome + ", R$" + x.salarioComDesconto());
        System.out.printf("Em quantos porcento o funcionario(a) %s vai ter de aumento? ", x.nome);
        double porcentagem = sc.nextDouble();
        x.aumentoDoSalario(porcentagem);
        
        sc.close();
    }
}
