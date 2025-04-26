import entities.Pedido;
import entities.ItemDoPedido;
import entities.Produto2;
import entities.Cliente;
import entities.enums.StatusDoPedido;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Ex047 {
    private static StatusDoPedido[] statusDoPedidos = {
            StatusDoPedido.ERRO_NO_PAGAMENTO,
            StatusDoPedido.PAGAMENTO_PENDENTE,
            StatusDoPedido.PROCESSANDO,
            StatusDoPedido.ENVIADO,
            StatusDoPedido.ENTREGUE};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Email: ");
        String emailCliente = sc.next();
        System.out.print("Aniversario (Dia/Mês/Ano): ");
        LocalDate aniversarioCliente = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Cliente cliente = new Cliente(nomeCliente, emailCliente, aniversarioCliente);

        System.out.println("Digite os dados do pedido: ");
        int statusDoPedido;

        do {
            System.out.println("[1] Para pedido com pagamento pendente\n[2] Para pedido em processando");
            System.out.println("[3] Para pedido enviado\n[4] Para pedido entregue");
            System.out.print("Digite a opção: ");
            statusDoPedido = sc.nextInt();
            sc.nextLine();
        } while (statusDoPedido != 1 && statusDoPedido != 2 && statusDoPedido != 3 && statusDoPedido != 4);

        Pedido pedido = new Pedido(LocalDateTime.now(), statusDoPedidos[statusDoPedido], cliente);

        System.out.print("Quantos itens para esse pedido? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do #" + i + " pedido: ");
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double precoProduto = sc.nextDouble();

            Produto2 produto2 = new Produto2(nomeProduto, precoProduto);

            System.out.print("Digite a quantidade do produto: ");
            int quantidadeItemDoPedido = sc.nextInt();
            sc.nextLine();

            ItemDoPedido itemDoPedido = new ItemDoPedido(quantidadeItemDoPedido, precoProduto, produto2);
            pedido.addPedido(itemDoPedido);
        }

        System.out.println(pedido);

        sc.close();
    }
}
