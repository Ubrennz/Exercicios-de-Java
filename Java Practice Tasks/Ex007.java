import java.util.Scanner;

public class Ex007 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite quantos minutos foram cosumidos do plano de telefônia: ");
        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
            System.out.println("Valor a pagar: R$" + conta);
        }
        else {
            System.out.println("Valor a pagar: R$" + conta);
        }

        sc.close();
    }
}