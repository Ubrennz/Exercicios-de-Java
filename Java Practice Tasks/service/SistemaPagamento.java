package service;

import model.Pagamento;

public class SistemaPagamento {
    public void processarPagamento(Pagamento pagamento, double valor) {
        System.out.println(pagamento.getDescricao());
        pagamento.pagar(valor);
    }
}
