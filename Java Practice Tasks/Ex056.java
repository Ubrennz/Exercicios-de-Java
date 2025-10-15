import java.util.Scanner;
import java.util.InputMismatchException;

import entities.Produto;
import exceptions.ProdutoException;

public class Ex056 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Produto produto = new Produto();

            System.out.print("Digite o número de produtos a serem digitados: ");
            int numeroProdutos = sc.nextInt();

            for (int i=0; i<numeroProdutos; i++) {
                sc.nextLine();
                System.out.print("Digite o nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.print("Digite o preço do produto: ");
                double precoProduto = sc.nextDouble();
                System.out.print("Digite a quantidade do produto: ");
                int qtdeProduto = sc.nextInt();

                produto = new Produto(nomeProduto, precoProduto, qtdeProduto);
                produto.adicionarProduto();
            }

            produto.adicionarDadosAoSumario();

            System.out.println("Dados do sumario:");
            produto.verDadosDoSumario();
        } catch (InputMismatchException e) {
            System.out.println("Digite erro de digitação!");
        } catch (ProdutoException e) {
            System.out.println(e.getMessage());
        }
    }
}
