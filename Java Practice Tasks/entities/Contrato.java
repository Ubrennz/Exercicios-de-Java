package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numero;
    private LocalDate data;
    private Double valorTotal;

    List<Parcela> parcelas = new ArrayList<>();

    public Contrato(Integer numero, LocalDate data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public Integer getNumero() {
        return numero;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void adicionarParcela(Parcela parcela) {
        parcelas.add(parcela);
    }

    public void removerParcela(Parcela parcela) {
        parcelas.remove(parcela);
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "numero=" + numero +
                ", data=" + data +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
