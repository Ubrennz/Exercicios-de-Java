import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qualquer coisa: ");
        String frase = sc.nextLine();
        String frase2 = frase.replace("biscoito", "bolacha");
        System.out.println(frase2);

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}