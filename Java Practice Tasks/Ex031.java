import java.util.Scanner;
import entities.Aluno;

public class Ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno x = new Aluno();

        System.out.print("Diigte o nome do aluno(a): ");
        x.nome = sc.nextLine();
        System.out.print("Digite a primeira nota do aluno(a), entre 0 a 10: ");
        x.nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno(a), entre 0 a 10: ");
        x.nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota do aluno(a), entre 0 a 10: ");
        x.nota3 = sc.nextDouble();

        x.validarNotas();
        x.mediaDasNotas();

        sc.close();
    }
}
