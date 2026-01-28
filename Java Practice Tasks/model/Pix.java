package model;

public class Pix implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento de R$%.2f realizado com Pix.\n", valor);
    }

    @Override
    public String getDescricao() {
        return "Pagamento via Pix";
    }
}
