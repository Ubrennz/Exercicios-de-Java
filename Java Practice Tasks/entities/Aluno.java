package entities;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double soma;

    public void validarNotas() {
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
            soma = nota1 + nota2 + nota3;
        } else {
            soma = -1;
        } 
    }

    public void mediaDasNotas() {
        if (soma != -1) {
            double media =  soma / 3;

            if (media >= 6.0) {
                System.out.printf("Nota final: %.2f%nPassou!\n", media);
            } else {
                double pontos = 10 - soma;
                System.out.printf("Nota final: %.2f%nReprovado\nFaltando %.2f pontos para passar!\n", media, pontos);
            }
        } else {
            System.out.println("Notas invalidas!");
        }
    }
}
