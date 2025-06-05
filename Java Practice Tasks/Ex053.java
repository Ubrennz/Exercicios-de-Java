import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Account;
import exceptions.LimiteDeSaqueException;

public class Ex053 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Digite os dados da conta:");
            System.out.print("Número: ");
            int numeroDaConta = sc.nextInt();
            sc.nextLine();
            System.out.print("Títular: ");
            String titularDaConta = sc.nextLine();
            System.out.print("Saldo inicial: ");
            double saldoDaConta = sc.nextDouble();
            System.out.print("Limite da saque: ");
            double limiteDeSaque = sc.nextDouble();

            Account account = new Account(numeroDaConta, titularDaConta, saldoDaConta, limiteDeSaque);

            System.out.print("Digite o valor a ser sacado: ");
            account.saque(sc.nextDouble());

            System.out.println(account);

        } catch (InputMismatchException e) {
            System.out.println("Erro na digitação dos dados");
        } catch (LimiteDeSaqueException e) {
            System.out.println("Erro ao realizar o saque: " + e.getMessage());
        }
    }
}
