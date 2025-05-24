package entities;

public class PessoaJuridica extends Pessoa {
    private Integer numerosDeFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numerosDeFuncionarios) {
        super(nome, rendaAnual);
        this.numerosDeFuncionarios = numerosDeFuncionarios;
    }

    public Integer getNumerosDeFuncionarios() {
        return numerosDeFuncionarios;
    }

    public void setNumerosDeFuncionarios(Integer numerosDeFuncionarios) {
        this.numerosDeFuncionarios = numerosDeFuncionarios;
    }

    @Override
    public Double taxasPagas() {
        return numerosDeFuncionarios > 10 ? super.getRendaAnual() * 0.14 : super.getRendaAnual() * 0.16;
    }
}
