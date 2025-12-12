import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Estudante;

public class Ex061 {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("----------Sistema de Notas de Alunos----------");
            System.out.print("Digite a nota mínima para ser aprovado: ");
            double notaMinima = sc.nextDouble();

            char opcaoSair;

            do {
                sc.nextLine();
                System.out.print("Nome: ");
                String nomeEstudante = sc.nextLine();
                System.out.print("Nota: ");
                double notaEstudante = sc.nextDouble();
                estudantes.add(new Estudante(nomeEstudante, notaEstudante));

                System.out.print("Deseja sair (S/N)? ");
                opcaoSair = sc.next().toUpperCase().charAt(0);
            } while (opcaoSair != 'S');

            Collections.sort(estudantes);

            for (Estudante estudante : estudantes) {
                if (estudante.isAprovado(notaMinima)) {
                    System.out.println(estudante + " - Aprovado");
                } else {
                    System.out.println(estudante + " - Reprovado");
                }
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
