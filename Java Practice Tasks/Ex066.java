import java.util.ArrayList;
import java.util.List;

public class Ex066 {
    public static void copy(List<? extends Number> listaNumber, List<? super Number> listaObj) {
        listaObj.addAll(listaNumber);

        System.out.println(listaObj.isEmpty());
    }

    public static void printList(List<?> obj) {
        obj.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(1, 2, 3));
        List<Double> doubles = new ArrayList<>(List.of(1.2, 1.3, 4.5));
        List<Object> objects = new ArrayList<>();

        copy(ints, objects);
        printList(objects);
        System.out.println();
        copy(doubles, objects);
        printList(objects);

    }
}
