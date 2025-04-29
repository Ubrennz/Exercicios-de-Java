package entities;

public class Carro extends Veiculo {
    protected Integer qtdeDePortas;

    public Carro() {
        super();
    }

    public Carro(Integer qtdeDePortas) {
        this.qtdeDePortas = qtdeDePortas;
    }

    public Carro(String marcarDoVeiculo, String modeloDoVeiculo, Integer anoDoVeiculo, Integer qtdeDePortas) {
        super(marcarDoVeiculo, modeloDoVeiculo, anoDoVeiculo);
        this.qtdeDePortas = qtdeDePortas;
    }

    public Integer getQtdeDePortas() {
        return qtdeDePortas;
    }

    public void setQtdeDePortas(Integer qtdeDePortas) {
        this.qtdeDePortas = qtdeDePortas;
    }

    public String detalhesDoVeiculo() {
        return "Quantidade de Portas: " + qtdeDePortas;
    }
}
