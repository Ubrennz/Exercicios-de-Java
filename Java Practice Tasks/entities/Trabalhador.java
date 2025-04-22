package entities;

import entities.enums.NivelTrabalhador;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioMinimo;

    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioMinimo, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioMinimo = salarioMinimo;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(Double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContratos() {
        return contratos;
    }

    public String toString() {
        return "Trabalhador{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", salarioMinimo=" + salarioMinimo +
                ", departamento=" + departamento +
                ", contratos=" + contratos +
                '}';
    }

    public void adicionarContrato(HoraContrato contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(HoraContrato contrato) {
        contratos.remove(contrato);
    }

    public Double renda(int mes, int ano) {
        double soma = salarioMinimo;

        for (HoraContrato c : contratos) {
            if (c.getDataContrato().getMonthValue() == mes && c.getDataContrato().getYear() == ano) {
                soma += c.valorTotal();
            }
        }

        return soma;
    }
}
