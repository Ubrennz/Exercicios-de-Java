package entities;

public class Caminhao extends Veiculo {
    private Double capacidadeDeCarga;

    public Caminhao() {
        super();
    }

    public Caminhao(Double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public Caminhao(String marcarDoVeiculo, String modeloDoVeiculo, Integer anoDoVeiculo, Double capacidadeDeCarga) {
        super(marcarDoVeiculo, modeloDoVeiculo, anoDoVeiculo);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public Double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(Double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public String detalhesDoVeiculo() {
        return "Capacidade de Carga: " + capacidadeDeCarga;
    }
}
