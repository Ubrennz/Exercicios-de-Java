import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String frase = sc.nextLine();
        System.out.print("Digite um número para começar a String: ");
        int comeco = sc.nextInt();
        System.out.print("Digite um número para o final da String: ");
        int fim = sc.nextInt();

        System.out.println(frase.substring(comeco, fim));

        sc.close();
    }
}