package entities;

public class Empregado {
    protected String nome;
    private Integer horasTrabalhadas;
    private Double valorPorHoraTrabalhada;

    public Empregado() {

    }

    public Empregado(String nome, Integer horasTrabalhadas, Double valorPorHoraTrabalhada) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPorHoraTrabalhada() {
        return valorPorHoraTrabalhada;
    }

    public void setValorPorHoraTrabalhada(Double valorPorHoraTrabalhada) {
        this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
    }

    public double pagamento() {
        return valorPorHoraTrabalhada * horasTrabalhadas;
    }

    public String toString() {
        return nome + " - R$" + pagamento();
    }
}
