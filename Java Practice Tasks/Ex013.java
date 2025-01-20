import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra para ser comparada: ");
        String palavra1 = sc.next();
        System.out.print("digite outra palavra: ");
        String palavra2 = sc.next();
        System.out.print("[1] para case sensitive\n[2] sem case sensitive\nOpção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(palavra1.equals(palavra2));
                break;
            case 2:
                System.out.println(palavra1.equalsIgnoreCase(palavra2));
                break;
            default:
                System.out.println("Digite 1 ou 2!");        
        }

        sc.close();        
    }
}