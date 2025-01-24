import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, soma, count;
        soma = 0;
        count = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();
            soma += numero;
            count += 1;

        } while (numero != 0);

        System.out.printf("A soma entre todos os %d números é de: %d%n", count, soma);

        sc.close();
    }
}