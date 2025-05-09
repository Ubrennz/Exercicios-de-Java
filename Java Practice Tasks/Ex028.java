import java.util.Scanner;
import entities.Produto;

public class Ex028 {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto x = new Produto();
			
		System.out.print("Digite o nome do produto: ");
		x.nome = sc.nextLine();
		System.out.print("Digite o preço do produto: R$");
		x.preco = sc.nextDouble();
		System.out.printf("Digite a quantidade do produto %s no estoque: ", x.nome);
		x.quantidade = sc.nextInt();

		System.out.println(x.toString());	

		System.out.print("Digite a quantidade para ser adicionado ao estoque: ");
		int addEstoque = sc.nextInt();
		x.addQtde(addEstoque);

		System.out.println("Lista atualizada: ");
		System.out.println(x.toString());

		System.out.print("Digite a quantidade para ser removido do estoque: ");
		int valorRemovido = sc.nextInt();
		x.removerQtde(valorRemovido);
		
		System.out.println("Lista atualizada: ");
		System.out.println(x.toString());
		
		sc.close();
   	}
}
