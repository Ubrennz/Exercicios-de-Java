import entities.Banco;
import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco nuBank = new Banco();

        System.out.print("Digite o número da sua conta: ");
        int numeroDaConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Vai fazer algum deposito inicial? [S/N]: ");
        char opcao = sc.next().toUpperCase().charAt(0);

        if (opcao == 'S') {
            System.out.print("Digite quanto você vai depositar: R$");
            double depositoInicial = sc.nextDouble();
            nuBank = new Banco(numeroDaConta, nome, depositoInicial);
            System.out.print(nuBank.toString());
        } 
        else if (opcao == 'N') {
            nuBank = new Banco(numeroDaConta, nome);
            System.out.print(nuBank.toString());
        } else {
            System.out.println("Digite S ou N");
        }
        
        System.out.print("Digite o valor do deposito: R$");
        double deposito = sc.nextDouble();
        nuBank.fazerDeposito(deposito);

        System.out.print(nuBank.toString());
       
        System.out.print("Digite o valor do saque: R$");
        double saque = sc.nextDouble();
        nuBank.fazerSaque(saque);
        
        System.out.print(nuBank.toString());      

        sc.close();
    }
}
