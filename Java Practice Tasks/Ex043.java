import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Ex043 {
    public static int random(int inicio, int fim) {
        List<Integer> listaRandom = new ArrayList<>();

        for (int i = inicio; i <= fim; i++) {
            listaRandom.add(i);
        }

        Collections.shuffle(listaRandom);
        return listaRandom.get(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o intervalo dos números a serem sorteados");
        System.out.print("Digite o começo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o final: ");
        int fim = sc.nextInt();

        System.out.println(random(inicio, fim));

        sc.close();
    }
}
