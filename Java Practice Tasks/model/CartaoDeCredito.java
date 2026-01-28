package model;

public class CartaoDeCredito implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$%.2f realizado com Cartão de Crédito.\n", valor);
    }

    @Override
    public String getDescricao() {
        return "Pagamento via Cartão de Crédito.";
    }
}
