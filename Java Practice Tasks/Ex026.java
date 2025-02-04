import entities.Triangulo;
import java.util.Scanner;

public class Aula19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os valores de X: ");
        x.a = sc.nextInt();
        x.b = sc.nextInt();
        x.c = sc.nextInt();

        System.out.println("Digite os valores de Y: ");
        y.a = sc.nextInt();
        y.b = sc.nextInt();
        y.c = sc.nextInt();

        double p1 = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p1 * (p1 - x.a) * (p1 - x.b) * (p1 - x.c));

        double p2 = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p2 * (p2 - y.a) * (p2 - y.b) * (p2 - y.c));

        if (areaX > areaY) {
            System.out.println("A area do triangulo X é maior do que a do Y");
        } else {
            System.out.println("A area do triangulo Y é maior do que a do X");
        }
        
        sc.close();
    }
}
