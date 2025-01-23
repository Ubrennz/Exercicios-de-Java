public class Aula21 {
    public static void main(String[] args) {
        int count = 0;
        int soma = 0;

        for (int i=1; i<500; i+=2) {
            
            if (i % 3 == 0){
                count += 1;
                soma += i;  
            }
            
        }

        System.out.printf("A soma de todos os %d números foi %d%n", count, soma);
    }
}