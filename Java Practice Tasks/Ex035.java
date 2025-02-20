import java.util.Scanner;
import java.util.Arrays;

public class Ex035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vc vai digitar? ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        double soma = 0.0;

        for (int i=0; i< numeros.length; i++) {
            System.out.print("Digite um número: ");
            double numero = sc.nextInt();

            numeros[i] = numero;
            soma += numeros[i];
        }
        
        System.out.println("Números digitados: " + Arrays.toString(numeros));
        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Divisão de todos os números: " + soma / numeros.length);      

        sc.close();
    }
}
