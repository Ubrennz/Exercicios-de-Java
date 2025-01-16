import java.util.Scanner;
import java.util.Locale;

public class Ex005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Digite o valor da casa que você deseja comprar R$");
        double casaValor = sc.nextDouble();
        System.out.print("Digite o seu salário R$");
        double salario = sc.nextDouble();
        System.out.print("Digite em quantos meses voce vai pagar a casa: ");
        int meses = sc.nextInt();

        double prestacao = casaValor / meses;
        double trintaPorcento = 0.3 * salario;
        System.out.println(prestacao);
        System.out.println(trintaPorcento);

        if (prestacao < trintaPorcento) {
            System.out.printf("O valor das prestações é %.2f%%, sendo menor do que 30%%.\nSituação: Aprovado.\n", prestacao);
        }
        else {
            System.out.printf("O valor das prestações é %.2f%%, sendo maior do que 30%%.\nSituação: Negado.\n", prestacao);
        }

        sc.close();
    }
}