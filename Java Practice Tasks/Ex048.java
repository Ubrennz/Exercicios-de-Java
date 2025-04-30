import entities.Veiculo;
import entities.Carro;
import entities.Caminhao;
import entities.Moto;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        Carro carro;
        Caminhao caminhao;
        Moto moto;

        System.out.print("Quantoa veiculos vão ser adicionados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++ ) {
            int opcao;

            do {
                System.out.println("[1] Para adicionar um carro\n[2] Para adicionar um caminhão\n[3] Para adicionar uma moto");
                System.out.print("Digite a opção: ");
                opcao = sc.nextInt();
                sc.nextLine();
            } while (opcao != 1 && opcao != 2 && opcao != 3);

            System.out.print("Digite a marca do veiculo: ");
            String marcaDoVeiculo = sc.nextLine();
            System.out.print("Digite o modelo do veiculo: ");
            String modeloDoVeiculo = sc.nextLine();
            System.out.print("Digite o ano do veiculo: ");
            int anoDoVeiculo = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a quantidade de portas do veiculo: ");
                    int qtdeDePortas = sc.nextInt();
                    carro = new Carro(marcaDoVeiculo, modeloDoVeiculo, anoDoVeiculo, qtdeDePortas);
                    veiculos.add(carro);
                    break;
                case 2:
                    System.out.print("Digite a capacidade de carga do veiculo: ");
                    double capacidadeDeCarga = sc.nextDouble();
                    caminhao = new Caminhao(marcaDoVeiculo, modeloDoVeiculo, anoDoVeiculo, capacidadeDeCarga);
                    veiculos.add(caminhao);
                    break;
                case 3:
                    System.out.print("Digite as cilindradas do veiculo: ");
                    int cilindradas = sc.nextInt();
                    moto = new Moto(marcaDoVeiculo, modeloDoVeiculo, anoDoVeiculo, cilindradas);
                    veiculos.add(moto);
                    break;
            }
        }

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Carro) {
                System.out.println(((Carro) veiculo).detalhesDoVeiculo());
            } else if (veiculo instanceof Caminhao) {
                System.out.println(((Caminhao) veiculo).detalhesDoVeiculo());
            } else if (veiculo instanceof Moto) {
                System.out.println(((Moto) veiculo).detalhesDoVeiculo());
            }
        }

        sc.close();
        
    }
}
