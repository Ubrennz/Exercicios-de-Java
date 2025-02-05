package entities;

public class Circulo {
    public double r;

    public double area() {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    public double circunferencia() {
        double c = 2 * Math.PI * r;
        return c;
    }

}
