import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Ex054 {
    private static final String PATH = "src/arquivos/arquivo02.txt";
    private static List<String> dados = new ArrayList<>();

    private static void adicionarDados() {
        if (!dados.isEmpty()) {
            try (BufferedWriter br = new BufferedWriter(new FileWriter(PATH, true))) {
                for (String dado : dados) {
                    br.write(dado);
                    br.newLine();
                }

                System.out.println("Todos os dados foram escritos dentro do arquivo.");
            }  catch (IOException e) {
                System.out.println("Erro ao escrever os dados: " + e.getMessage());
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    private static void verDados() {
        File arquivo = new File(PATH);

        if (arquivo.exists() && arquivo.canRead()) {
            try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {
                String linha = br.readLine();

                while (linha != null) {
                    System.out.println(linha);
                    linha = br.readLine();
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Não é possivel executar o arquivo.");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.print("Digite qualquer dado para colocar dentro do arquivo: ");
                dados.add(sc.nextLine());
                System.out.print("Digite 0 para sair, ou digite outro número para continuar: ");
                opcao = sc.nextInt();
                sc.nextLine();
            } while (opcao != 0);

            adicionarDados();
            System.out.println("\nDados escritos:");
            verDados();

        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números!");
        }
    }
}
