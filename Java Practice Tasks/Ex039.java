import entities.Funcionarios;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex039 {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionarios funcionario;
        List<Funcionarios> listaFuncionarios = new ArrayList<>();
        List<Integer> idFuncionarios = new ArrayList<>();

        System.out.print("Digite quantos funcionarios serão adicionados: ");
        int n = sc.nextInt(); 
        
        int count = 0;

        while (count < n) {            
            System.out.println("Digite os dados do funcionario: ");
            System.out.print("Digite o ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            
            if (idFuncionarios.contains(id)) {
                System.out.println("O ID estar repetido!");
            } else {
                idFuncionarios.add(id);
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();
                System.out.print("Digite o salário: "); 
                double salario = sc.nextDouble();
                        
                funcionario = new Funcionarios(id, nome, salario);                        
                listaFuncionarios.add(funcionario);
            
                count ++;                
            }           
        }
        
        System.out.print("Digite o ID do funcionario que recebera o aumento: ");
        int id = sc.nextInt();

        for (int i = 0; i < idFuncionarios.size(); i++) {
            if (idFuncionarios.contains(id)) {
                for (Funcionarios fun : listaFuncionarios) {
                    if (id == fun.getIdFuncionario()) {
                        System.out.print("Digite a porcentagem do aumento do salário: ");
                        double porcent = sc.nextDouble();
                        
                        double salario = fun.getSalarioFuncionario();
                        double salarioComAumento = porcent / 100 * salario + salario;
                        fun.setSalarioFuncionario(salarioComAumento);
                        break;
                    }
                }
                
                i = idFuncionarios.size();
            } else {
                System.out.printf("O ID %d não foi encontrado.\n", id);
                break;
            }            
        }   

        for (Funcionarios fun : listaFuncionarios) {
            System.out.println(fun.toString());
        }

        sc.close();        
    }
}
