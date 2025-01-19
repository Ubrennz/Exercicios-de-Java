// programa para somar dois números com vírgulas

import java.util.Scanner;
import java.util.Locale;

public class Ex012 {
    public static void main(String[] args) {        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número com ponto flutuante com vírgula: ");
        String num = sc.next();
        System.out.print("Digite outro número do tipo com ponto flutuante com vírgula: ");
        String num2 = sc.next();
        
        if (num.contains(",") && num2.contains(",")) {
            String numVirgula = num.replace(",", ".");
            String numVirgula2 = num2.replace(",", ".");
            double numPonto = Double.valueOf(numVirgula);
            double numPonto2 = Double.valueOf(numVirgula2);
            
            double soma = numPonto + numPonto2;
            String somados = String.valueOf(soma);
            String resultado = somados.replace(".", ",");
            System.out.printf("%s + %s = %s%n", num, num2, resultado);
        } else {
            System.out.println("Digite apenas números com vírgula!");
        }        

        sc.close();
    }
}