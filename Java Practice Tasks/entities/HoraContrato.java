package entities;

import java.time.LocalDate;

public class HoraContrato {
    private LocalDate dataContrato;
    private Double valorPorHora;
    private Integer horas;

    public HoraContrato() {

    }

    public HoraContrato(LocalDate dataContrato, Double valorPorHora, Integer horas) {
        this.dataContrato = dataContrato;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public Double valorTotal() {
        return valorPorHora * horas;
    }

    @Override
    public String toString() {
        return "HoraContrato{" +
                "dataContrato=" + dataContrato +
                ", valorPorHora=" + valorPorHora +
                ", horas=" + horas +
                '}';
    }
}
