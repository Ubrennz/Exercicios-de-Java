import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("[1] para soma\n[2] para subtração\n[3] para multiplicação\n[4] para divisão\nOpção: ");        
        int opcao = sc.nextInt();        
        
        if (opcao > 0 && opcao <= 4) {
            System.out.print("Digite o primeiro número: ");
            double n1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            double n2 = sc.nextInt();
            double num;

            switch(opcao) {
                case 1:                    
                    num = n1 + n2;
                    System.out.printf("%.2f + %.2f = %.2f%n", n1, n2, num);
                    break;
                case 2:
                    num = n1 - n2;
                    System.out.printf("%.2f - %.2f = %.2f%n", n1, n2, num);
                    break;
                case 3:
                    num = n1 * n2;
                    System.out.printf("%.2f * %.2f = %.2f%n", n1, n2, num);
                    break;
                case 4:
                    num = n1 / n2;
                    System.out.printf("%.2f / %.2f = %.2f%n", n1, n2, num);
                    break;                               
            }            
        } 
        else {
            System.out.println("Digite um número válido!");
        }
        
        sc.close();
    }
}