// sistema de estoque

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Estoque;
import entities.Produto;

public class Ex057 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o código de barra do produto: ");
            int codigoDeBarra = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Digite a quantidade do produto: ");
            int qtdeProduto = sc.nextInt();
            Estoque.adicionarProduto(new Produto(codigoDeBarra, nomeProduto,  precoProduto, qtdeProduto));

            System.out.print("Digite o código de barra do produto a ser removido: ");
            codigoDeBarra = sc.nextInt();
            Estoque.removerProduto(codigoDeBarra);

        } catch (InputMismatchException e) {
            System.out.println("Erro: " + e.getMessage());
        }




    }
}
