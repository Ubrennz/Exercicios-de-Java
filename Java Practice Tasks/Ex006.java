// convertendo números para Binário, Octal e HexaDecimal
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("[1] converter Binário\n[2] converter Octal\n[3] converter HexaDecimal\nDigite a opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.print("Digite um número inteiro para converter para Binário: ");
            int numero = sc.nextInt();
            String binario = Integer.toBinaryString(numero);
            System.out.printf("%d em binário é %s%n", numero, binario);
        }
        else if (opcao == 2) {
            System.out.print("Digite um número inteiro para converter para Octal: ");
            int numero2 = sc.nextInt();
            String octal = Integer.toOctalString(numero2);
            System.out.printf("%d em Octal é %s%n", numero2, octal);
        }
        else if (opcao == 3) {
            System.out.print("Digite um número inteiro para converter para HexaDecimal: ");
            int numero3 = sc.nextInt();
            String hexa = Integer.toHexString(numero3);
            System.out.printf("%d em HexaDecimal é %s%n", numero3, hexa);
        }
        else {
            System.out.println("Número inválido!");
        }

        sc.close();
    }
}