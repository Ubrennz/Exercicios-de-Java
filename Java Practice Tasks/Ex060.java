import entities.Produto3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex060 {
    public static void main(String[] args) {
        List<Produto3> produtos = new ArrayList<>(Arrays.asList(new Produto3("Caixa", 20.00), new Produto3("Sapato", 150.00)));

        Collections.sort(produtos);
        produtos.forEach(produto -> System.out.println(produto.etiquetaDoProduto()));
    }
}
