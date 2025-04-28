package entities;

public class Veiculo {
    private String marcarVeiculo;
    private String modeloVeiculo;
    private Integer anoVeiculo;

    public Veiculo() {

    }

    public Veiculo(String marcarVeiculo, String modeloVeiculo, Integer anoVeiculo) {
        this.marcarVeiculo = marcarVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoVeiculo = anoVeiculo;
    }

    public String getMarcarVeiculo() {
        return marcarVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public Integer getAnoVeiculo() {
        return anoVeiculo;
    }

    public String exibirInformacoes() {
        return "Marca: " + marcarVeiculo
                + ", Modelo: " + modeloVeiculo
                + ", Ano: " + anoVeiculo;
    }

}
