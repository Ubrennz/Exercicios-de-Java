package entities;

public class Funcionarios {
    private Integer idFuncionario;
    private String nomeFuncionario;
    private Double salarioFuncionario;

    public Funcionarios(int idFuncionario, String nomeFuncionario, double salarioFuncionario) {
        this.idFuncionario = idFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public Double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioComAumento) {
        salarioFuncionario = salarioComAumento;
    }

    public String toString() {
        return idFuncionario + ", "
        + nomeFuncionario + ", "
        + salarioFuncionario;
    }
}
