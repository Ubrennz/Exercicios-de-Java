import entities.Circulo;
import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo x, y;

        x = new Circulo();
        y = new Circulo();

        System.out.print("Digite o raio do círculo X: ");
        x.r = sc.nextDouble();
        System.out.print("Digite o raio do círculo Y: ");
        y.r = sc.nextDouble();
        sc.nextLine();

        double areaX = x.area();
        double areaY = y.area();

        double circunferenciaX = x.circunferencia();
        double circunferenciaY = y.circunferencia();

        System.out.printf("A area de X é %.2f, e a circunfência é %.2f%n", areaX, circunferenciaX);
        System.out.printf("A area de Y é %.2f, e a circunfência é %.2f%n", areaY, circunferenciaY);

        sc.close();
    }
}
