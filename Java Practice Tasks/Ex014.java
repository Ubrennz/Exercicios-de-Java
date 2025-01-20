import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String frase = sc.nextLine();

        System.out.println(frase.contains("o"));
        System.out.println(frase.indexOf("B"));
        System.out.println(frase.lastIndexOf("n"));

        sc.close();
    }
}