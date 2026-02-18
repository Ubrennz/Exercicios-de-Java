import java.util.List;
import java.util.ArrayList;

public class Ex064 {
    private static <T extends Comparable<T>> T comparacao(List<T> lista) {
        T max = lista.getFirst();

        for (T item : lista) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<String> valores = new ArrayList<>(List.of("Java", "Python", "C++", "Dart"));
        List<Double> valoresNumericos = new ArrayList<>(List.of(10.00, 1.50, 1000.00, 1000.11));

        System.out.println("Max: " + comparacao(valores));
        System.out.println("Max: " + comparacao(valoresNumericos));
    }
}
