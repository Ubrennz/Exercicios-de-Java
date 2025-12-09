package service;

public class PayPalService implements PagamentoOnlineService {
    private static final double TAXA = 0.02;
    private static final double JUROS_MENSAIS = 0.01;

    @Override
    public double taxaDePagamento(double quantia) {
        return quantia * TAXA;
    }

    @Override
    public double juros(double quantia, int meses) {
        return quantia * JUROS_MENSAIS * meses;
    }
}
