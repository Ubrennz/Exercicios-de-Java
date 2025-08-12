package entities;

import java.util.List;
import java.util.ArrayList;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
    private String nomeTrabalhador;
    private NivelTrabalhador nivelTrabalhador;
    private Double salarioBaseTrabalhador;

    private Departamento departamento;

    private List<HoraContrato> horaContratos = new ArrayList<>();

    public Trabalhador(String nomeTrabalhador, NivelTrabalhador nivelTrabalhador, Double salarioBaseTrabalhador, Departamento departamento) {
        this.nomeTrabalhador = nomeTrabalhador;
        this.nivelTrabalhador = nivelTrabalhador;
        this.salarioBaseTrabalhador = salarioBaseTrabalhador;
        this.departamento = departamento;
    }

    public List<HoraContrato> getHoraContratos() {
        return horaContratos;
    }

    public void addContratos(HoraContrato contrato) {
        horaContratos.add(contrato);
    }

    public void removerContrato(HoraContrato contrato) {
        horaContratos.remove(contrato);
    }

    public Double renda(String data) {
        int mes = Integer.parseInt(data.substring(0, 2));
        int ano = Integer.parseInt(data.substring(3, 7));

        double valorRenda = 0.00;

        for (HoraContrato contrato : horaContratos) {
            if (contrato.getDataContrato().getYear() == ano && contrato.getDataContrato().getMonthValue() == mes) {
                valorRenda += contrato.valorTotal();
            }
        }
        return valorRenda + salarioBaseTrabalhador;

    }

    @Override
    public String toString() {
        return "Nome: " + nomeTrabalhador
                + "\n"
                + "Departamento: " + departamento.getNomeDepartamento();
    }
}
