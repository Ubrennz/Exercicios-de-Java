package entities;

public class EmpregadoTerceirizado extends Empregado {
    private Double despesaAdicional;

    public EmpregadoTerceirizado() {
        super();
    }

    public EmpregadoTerceirizado(String nome, Integer horasTrabalhadas, Double valorPorHoraTrabalhada, Double despesaAdicional) {
        super(nome, horasTrabalhadas, valorPorHoraTrabalhada);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }

    @Override
    public double pagamento() {
        return (110.0 / 100.0 * despesaAdicional) + super.pagamento();
    }

    @Override
    public String toString() {
        return nome + " - R$" + pagamento();
    }
}
