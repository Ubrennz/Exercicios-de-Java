import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = sc.nextInt();            

        } while (numero > 0);

        sc.close();
    }
}