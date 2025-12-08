package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
    private LocalDate dataDeVencimento;
    private Double valor;

    public Parcela(LocalDate dataDeVencimento, Double valor) {
        this.dataDeVencimento = dataDeVencimento;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return dataDeVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + " - "
                + valor;
    }
}
