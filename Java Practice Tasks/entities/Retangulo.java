package entities;

public class Retangulo {
    public double largura;
    public double comprimento;

    public double area() {
        return largura * comprimento;
    }

    public double perimetro() {        
        return 2 * (largura + comprimento);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(comprimento, 2));
    }
}
