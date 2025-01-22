import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra com espaços no começo ou final: ");
        String frase = sc.nextLine();
        String semEspaco = frase.trim();
        int count = semEspaco.length();
        System.out.println("Frase sem espaços: " + semEspaco);
        System.out.println("Frase com espaços: " + frase);
        System.out.printf("Você digitou: %d caracteres!\n", count);        

        sc.close();
    }
}