import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        String num = (n1 % 2 == 0) ? "par" : "impar";
        System.out.printf("%d é %s%n", n1, num);

        sc.close();
    }
}