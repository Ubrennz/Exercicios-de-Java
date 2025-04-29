package entities;

public class Moto extends Veiculo {
    private Integer cilindradas;

    public Moto() {
        super();
    }

    public Moto(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(String marcarDoVeiculo, String modeloDoVeiculo, Integer anoDoVeiculo, Integer cilindradas) {
        super(marcarDoVeiculo, modeloDoVeiculo, anoDoVeiculo);
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String detalhesDoVeiculo() {
        return "Quantidade de Cilindradas: " + cilindradas;
    }
}
