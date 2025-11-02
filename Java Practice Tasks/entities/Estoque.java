package entities;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class Estoque {
    private static final String CAMINHO_ARQUIVO = "src/arquivos/estoque.csv";

    public static boolean verificarPastaDoArquivo() {
        final File pasta = new File("src/arquivos/");
        return pasta.isDirectory() || pasta.mkdirs();
    }

    public static void adicionarProduto(Produto produto) {
        if (verificarPastaDoArquivo()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true))) {
                bw.write(produto.produtoParaEstoque());
                bw.newLine();
            } catch (IOException e) {
                System.out.println("erro: " + e.getMessage());
            }
        }
    }

    public static void removerProduto(int idProduto) {
        List<String> produtos = new ArrayList<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader(CAMINHO_ARQUIVO));
                BufferedWriter bw = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO))
        ) {
            String linha = br.readLine();

            while (linha != null) {
                produtos.add(linha);
                linha = br.readLine();
            }

            for (int i=0; i<produtos.size(); i++) {
                String[] dadosProduto = produtos.get(i).split(",");

                if (Integer.parseInt(dadosProduto[0]) == idProduto) {
                    produtos.remove(produtos.get(i));
                }
            }

            for (String produto : produtos) {
                bw.write(produto);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
