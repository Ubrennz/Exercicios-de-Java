import java.util.Scanner;
import java.util.Arrays;

public class Ex038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros[0]);
        System.out.println(numeros[numeros.length - 1]);
        
        sc.close();
    }
}
