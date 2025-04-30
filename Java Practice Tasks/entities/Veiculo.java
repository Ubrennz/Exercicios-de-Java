package entities;

public class Veiculo {
    private String marcarDoVeiculo;
    private String modeloVeiculo;
    private Integer anoVeiculo;

    public Veiculo() {

    }

    public Veiculo(String marcarDoVeiculo, String modeloVeiculo, Integer anoVeiculo) {
        this.marcarDoVeiculo = marcarDoVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoVeiculo = anoVeiculo;
    }

    public String getMarcarDoVeiculo() {
        return marcarDoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public Integer getAnoVeiculo() {
        return anoVeiculo;
    }
}
