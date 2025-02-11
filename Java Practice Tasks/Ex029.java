import java.util.Scanner;
import entities.Retangulo;

public class Ex029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo x = new Retangulo();

        System.out.print("Digite a largura do retângulo: ");
        x.largura = sc.nextDouble();
        System.out.print("Digite o comprimento do retângulo: ");
        x.comprimento = sc.nextDouble();

        System.out.println("Área: " + x.area());
        System.out.println("Perímetro: " + x.perimetro());
        System.out.println("Diagonal: " + x.diagonal());

        sc.close();
    }
}