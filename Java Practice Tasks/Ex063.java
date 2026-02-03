import entities.Jogador;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Ex063 {
    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();

        jogadores.add(new Jogador("Ubrennz", 10.00, 100));
        jogadores.add(new Jogador("Guxx", 200.00, 40));
        jogadores.add(new Jogador("BBBdsd", 2134.00, 400));

        Collections.sort(jogadores);

        jogadores.forEach(System.out::println);

    }
}
