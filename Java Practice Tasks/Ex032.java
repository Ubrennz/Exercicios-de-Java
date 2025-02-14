import java.util.Scanner;
import util.Conversor;

public class Ex032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do dolár: ");
        double valorDolar = sc.nextDouble();
        System.out.print("Digite quantos doláres você quer comprar: ");
        double compraDolar = sc.nextDouble();

        double dolar = Conversor.ConverterParaDolar(valorDolar, compraDolar);
        System.out.printf("Valor para ser pago em reais: R$%.2f%n", dolar);

        sc.close();
    }
}
