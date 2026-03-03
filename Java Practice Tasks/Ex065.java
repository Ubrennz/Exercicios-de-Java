import java.util.ArrayList;
import java.util.List;

public class Ex065 {
    public static void printList(List<?> lista) {
        lista.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("Brenno", "GG", "BlaBla"));

        printList(integers);
        printList(strings);
    }
}
