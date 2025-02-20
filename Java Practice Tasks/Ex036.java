import java.util.Scanner;
import entities.Usuarios;

public class Ex036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas pessoas vão ser adicionadas: ");
        int pessoas = sc.nextInt();
        sc.nextLine();

        Usuarios[] usuarios = new Usuarios[pessoas];

        double somaAltura = 0.00;

        for (int i=0; i< usuarios.length; i++) {
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            System.out.print("Digite a altura da pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            usuarios[i] = new Usuarios(nome, idade, altura);
            somaAltura += usuarios[i].getAltura();            
        }
        
        System.out.println("\nAltura média: " + somaAltura / usuarios.length);
        System.out.println("Pessoas com menos de 16 anos:");

        for (int i=0; i< usuarios.length; i++) {
            if (usuarios[i].getIdade() <= 16) {
                System.out.println(usuarios[i].toString());
            }
        }

        sc.close();
    }
}
