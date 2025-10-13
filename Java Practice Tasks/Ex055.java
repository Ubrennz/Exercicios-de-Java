import java.util.Scanner;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Ex055 {
    private static final String PATH = "src/arquivos/arquivo03.txt";
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in); BufferedWriter br = new BufferedWriter(new FileWriter(PATH, true))) {
            System.out.print("Digite algo para ser inserido no arquivo: ");
            br.write(sc.nextLine());
            br.newLine();

            System.out.println("Texto inserido com sucesso!");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
