package entities;

import java.time.LocalDate;

public class HoraContrato {
    private LocalDate dataContrato;
    private Double valorPorHora;
    private Integer horas;

    public HoraContrato(LocalDate dataContrato, Double valorPorHora, Integer horas) {
        this.dataContrato = dataContrato;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public int getAno() {
        return dataContrato.getYear();
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double valorTotal() {
        return valorPorHora * horas;
    }
}
