import service.SistemaPagamento;

import model.Pix;
import model.CartaoDeCredito;

public class Ex062 {
    public static void main(String[] args) {
        SistemaPagamento sistemaPagamento = new SistemaPagamento();

        sistemaPagamento.processarPagamento(new Pix(), 1200.00);
        sistemaPagamento.processarPagamento(new CartaoDeCredito(), 1500.00);
    }
}
