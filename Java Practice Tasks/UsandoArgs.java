public class UsandoArgs {
    public static void main(String[] args) {
        try {
            int soma = 0;

            for (String numero : args) {
                soma += Integer.parseInt(numero);
            }

            System.out.println("A soma dos números é: " + soma);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
