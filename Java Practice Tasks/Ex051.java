import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Produto3;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Ex051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto3> produtos = new ArrayList<>();

        System.out.print("Digite quantos produtos serão digitados: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do #" + i + " produto: ");
            System.out.println("[1] Para produto nacional\n[2] Para produto importado\n[3] Para produto usado");
            System.out.print("Digite a opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1 || opcao == 2 || opcao == 3) {
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();
                System.out.print("Digite o preço: ");
                double preco = sc.nextDouble();

                switch (opcao) {
                    case 1:
                        produtos.add(new Produto3(nome, preco));
                        break;
                    case 2:
                        System.out.print("Digite as taxas da alfândega: ");
                        double taxaDaAlfandega = sc.nextDouble();
                        produtos.add(new ProdutoImportado(nome, preco, taxaDaAlfandega));
                        break;
                    case 3:
                        System.out.print("Digite a data de fabricação do produto: ");
                        LocalDate dataDeFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        produtos.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
                        break;
                }

                System.out.println("Produto adicionado!");

            } else {
                System.out.println("Opção invalida, tente novamente");
                i -= 1;
            }
        }

        System.out.println("\nProdutos:");
        produtos.forEach(produto -> System.out.println(produto.etiquetaDoProduto()));

        sc.close();
    }
}
