import java.util.Scanner;

public class Ex041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de linhas que a matriz terá: ");
        int linhas = sc.nextInt();
        System.out.print("Digite a quantidade de colunas que a matriz terá: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Números: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");                
            }

            System.out.println();
        }

        System.out.print("Digite um número para ver se ele estar dentro da matriz: ");
        int dentroMatriz = sc.nextInt();

        boolean numNaoEncontrato = true;
                
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (dentroMatriz == matriz[i][j]) {
                    numNaoEncontrato = false;

                    if (i >= 1 && matriz.length > 1) {
                        System.out.println("Número de cima: " + matriz[i - 1][j]);
                    }
                    
                    if (j >= 1 && matriz.length > 1) {
                        System.out.println("Número da esquerda: " + matriz[i][j - 1]);
                    }

                    if (matriz[i].length - i - 1 >= 1 && matriz.length > 1) {
                        System.out.println("Número de baixo: " + matriz[i + 1][j]);
                    }
                    
                    if (matriz[j].length - j - 1 >= 1 && matriz.length > 1) {
                        System.out.println("Número da direita: " + matriz[i][j + 1]);
                    }
                }
            }            
        }

        if (numNaoEncontrato) {
            System.out.printf("O número %d não existe dentro da matriz\n", dentroMatriz);
        }

        sc.close();
    }
}
