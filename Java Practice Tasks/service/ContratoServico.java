package service;

import entities.Contrato;
import entities.Parcela;

import java.time.LocalDate;

public class ContratoServico {
    private PagamentoOnlineService pagamentoOnlineService;

    public ContratoServico(PagamentoOnlineService pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void processoContrato(Contrato contrato, int meses) {
        double valorBasico = contrato.getValorTotal() / meses;

        for (int i=1; i<= meses; i++) {
            LocalDate dataDeVenciento = contrato.getData().plusMonths(i);
            double juros = pagamentoOnlineService.juros(valorBasico, i);
            double taxa = pagamentoOnlineService.taxaDePagamento(valorBasico + juros);
            double valorParcela = valorBasico + juros + taxa;
            contrato.adicionarParcela(new Parcela(dataDeVenciento, valorParcela));
        }
    }
}
