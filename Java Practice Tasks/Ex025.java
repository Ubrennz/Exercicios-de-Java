import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 3 números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int resultado = max(n1, n2, n3);        
        mostrarResultado(resultado);
        
        sc.close();
    }

    public static int max(int a, int b, int c) {
        int retorno;

        if (a > b && a > c) {
            retorno = a;
        }
        else if (b > a && b > c) {
            retorno = b;
        }
        else {
            retorno = c;
        }
        return retorno;
    }
    
    public static void mostrarResultado(int maior) {     
        System.out.println("O maior valor foi: " + maior);
    }
}