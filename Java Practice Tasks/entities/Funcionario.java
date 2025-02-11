package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioComDesconto() {
        return salarioBruto - taxa;
    }

    public void aumentoDoSalario(double porcentagem) {
        double salarioComAumento = porcentagem / 100 * salarioBruto + salarioBruto;
        System.out.println(nome + ", " + salarioComAumento);
    }
}
