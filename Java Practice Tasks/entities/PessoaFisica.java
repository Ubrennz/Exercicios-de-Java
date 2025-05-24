package entities;

public class PessoaFisica extends Pessoa {
    private Double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double taxasPagas() {
        double taxaBase = super.getRendaAnual() <= 20000.00 ? super.getRendaAnual() * 0.15 : super.getRendaAnual() * 0.25;

        if (gastosComSaude > 0.0) {
            taxaBase -= gastosComSaude * 0.50;
        }

        return taxaBase;
    }
}
