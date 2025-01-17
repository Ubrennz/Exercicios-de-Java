// switch case

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para um dia da semana: ");
        int opcao = sc.nextInt();
        String dia;

        switch(opcao) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;                        
            default:
                dia = "Valor Inválido";
                break;
        }

        System.out.printf("%d é %s!%n", opcao, dia);

        sc.close();
    }
}