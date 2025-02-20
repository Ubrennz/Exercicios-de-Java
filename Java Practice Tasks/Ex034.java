import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vai digitar quantos números? ");
        int numero = sc.nextInt();
        
        int[] todosOsNumeros = new int[numero];        
        int count = 0;

        for (int i=0; i<numero; i++) {
            System.out.print("Digite um número: ");
            int numeros = sc.nextInt();
            
            if (numeros < 0) {
                todosOsNumeros[i] = numeros;
                count += 1;
            }
        }

        int[] numerosNegativos = new int[count];
        int count2 = 0;

        for (int i=0; i<todosOsNumeros.length; i++) {
            if (todosOsNumeros[i] < 0) {
                numerosNegativos[count2] = todosOsNumeros[i];                
                count2 +=1;                
            }            
        }

        System.out.println("Números negativos: ");
        
        for (int i=0; i<numerosNegativos.length; i++) {
            System.out.println(numerosNegativos[i]);
        }

        sc.close();
    }
}
