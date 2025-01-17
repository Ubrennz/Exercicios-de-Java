import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        String verificador = (idade > 0 && idade < 18) ? "Menor de idade" : "Maior de idade";
        System.out.println("A pessoa é " + verificador);

        sc.close();
    }
}