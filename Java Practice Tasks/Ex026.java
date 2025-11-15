import java.util.Scanner;
import entities.Triangulo;

public class Ex026 {
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

        double areaX = x.calculandoArea();
        double areaY = y.calculandoArea();

        if (areaX > areaY) {
            System.out.println("A area do triangulo X é maior do que a do Y");
        } else {
            System.out.println("A area do triangulo Y é maior do que a do X");
        }
        
        sc.close();
    }
}
