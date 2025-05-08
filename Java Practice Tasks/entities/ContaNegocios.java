package entities;

public class ContaNegocios extends Conta {
    private Double limiteEmprestimo;

    public ContaNegocios() {
        super();
    }

    public ContaNegocios(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public String toString2() {
        return "ContaNegocios{" +
                "limiteEmprestimo=" + limiteEmprestimo +
                '}';
    }

    public void emprestimo(double dinheroEmprestimo) {
        if (dinheroEmprestimo <= limiteEmprestimo) {
            saldo += dinheroEmprestimo - 10.00;
        } else {
            System.out.println("Não foi possivel fazer o emprêstimo");
        }
    }
}
