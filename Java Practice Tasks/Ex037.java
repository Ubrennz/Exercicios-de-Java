import java.util.Scanner;
import entities.Hotel;

public class Ex037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroDeQuartos = 10;
        int[] quartosReservados  = new int[numeroDeQuartos];
        Hotel[] quartos = new Hotel[numeroDeQuartos];

        System.out.print("Quantos estudantes irão alugar os quartos? ");
        int estudantes = sc.nextInt();
        sc.nextLine();
        
        for (int i=0; i<estudantes; i++) {
            System.out.print("Digite o nome do estudante: ");
            String nome = sc.nextLine();
            System.out.print("Digite o email do estudante: ");
            String email = sc.nextLine();
            System.out.print("Digite o número do quarto do estudante: ");
            int numeroDoQuarto = sc.nextInt();
            sc.nextLine();
            
            if (quartosReservados[numeroDoQuarto] == 0) {
                quartosReservados[numeroDoQuarto] = numeroDoQuarto;
                quartos[numeroDoQuarto] = new Hotel(nome, email, numeroDoQuarto);
            } else {
                System.out.println("\nTente novamente!");
                System.out.println("Esse quarto já estar reservado por: " + quartos[numeroDoQuarto].getNome());
                i -= 1;
            }            
        }

        System.out.println("\nDados dos Estudantes: ");
        for (int i=0; i<quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i].toString());
            }            
        }

        sc.close();
    }
}
