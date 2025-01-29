public class Ex024 {
    public static void main(String[] args) {
        String frutas = "Banana Maçã Melancia";
        String[] vetor = frutas.split(" ");

        for (int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}