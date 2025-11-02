package entities;

import java.util.List;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import exceptions.ProdutoException;

public class Produto {
    protected Integer codigoDeBarra;
    protected String nomeProduto;
    protected Double precoProduto;
    protected Integer qtdeProduto;

    private static final String CAMINHO_DA_PASTA = "src/arquivos/";
    private static final String CAMINHO_DO_ARQUIVO = "src/arquivos/produtos.csv";

    private static final String CAMINHO_DA_PASTA_OUT = "src/arquivos/out/";
    private static final String CAMINHO_DO_SUMARIO_OUT = "src/arquivos/out/sumario.csv";

    public Produto() {
    }

    public Produto(String nomeProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public Produto(String nomeProduto, Double precoProduto, Integer qtdeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdeProduto = qtdeProduto;
    }

    public Produto(Integer codigoDeBarra, String nomeProduto, Double precoProduto, Integer qtdeProduto) {
        this.codigoDeBarra = codigoDeBarra;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qtdeProduto = qtdeProduto;
    }

    public void adicionarProduto() throws ProdutoException {
        if (new File(CAMINHO_DA_PASTA).mkdirs() || new File(CAMINHO_DA_PASTA).exists()) {
            try (BufferedWriter br = new BufferedWriter(new FileWriter(CAMINHO_DO_ARQUIVO, true))) {
                br.write(nomeProduto + "," + precoProduto + "," + qtdeProduto);
                br.newLine();

                System.out.println("Produto adicionado com sucesso!");
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }
        } else {
            throw new ProdutoException("Erro ao criar a pasta no caminho: " + CAMINHO_DA_PASTA);
        }
    }

    public List<String> pegarDadosDosProdutos() throws ProdutoException {
        if (new File(CAMINHO_DO_ARQUIVO).exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO_DO_ARQUIVO))) {
                return br.lines().toList();
            } catch (IOException e) {
                System.out.println("Erro com o arquivo!");
            }
        } else {
            throw new ProdutoException("Arquivo não encontrado!");
        }
        return List.of();
    }

    public void adicionarDadosAoSumario() throws ProdutoException {
        if (new File(CAMINHO_DA_PASTA_OUT).mkdirs() || new File(CAMINHO_DA_PASTA_OUT).exists()) {
            try (BufferedWriter br = new BufferedWriter(new FileWriter(CAMINHO_DO_SUMARIO_OUT))) {
                for (String linha : pegarDadosDosProdutos()) {
                    String[] dados = linha.split(",");

                    double precoProduto = Double.parseDouble(dados[1]);
                    int qtdeProduto = Integer.parseInt(dados[2]);
                    double valorFinal = precoProduto * qtdeProduto;

                    br.write(linha.split(",")[0] + ",");
                    br.write(String.format("%.2f", valorFinal));
                    br.newLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            throw new ProdutoException("A lista de produtos está vazia!");
        }
    }

    public void verDadosDoSumario() {
        if (new File(CAMINHO_DO_SUMARIO_OUT).exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(CAMINHO_DO_SUMARIO_OUT))) {
                String linha = br.readLine();

                while (linha != null) {
                    System.out.println(linha);
                    linha = br.readLine();
                }
            } catch (IOException e) {
                System.out.println("Erro com o arquivo do sumario!");
            }
        }
    }

    public String produtoParaEstoque() {
        return codigoDeBarra + "," + nomeProduto + "," + String.format("%.2f", precoProduto) + "," + qtdeProduto;
    }

    public String toString() {
        return nomeProduto + ", R$" + String.format("%.2f", precoProduto) + ", " + qtdeProduto;
    }
}
