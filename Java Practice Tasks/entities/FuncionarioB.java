package entities;

public class FuncionarioB {
    private Integer id;
    private String nome;
    private Double salario;

    public FuncionarioB(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void aumentoDoSalario(double porcentagem) {
        salario += porcentagem / 100 * salario;
    }

    @Override
    public String toString() {
        return "id = " + id + ", nome = " + nome + ", salario = " + salario;
    }
}
