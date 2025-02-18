package entities;

public class Banco {
    private int numeroDaConta;
    private String nome;
    private double saldo;

    public Banco() {

    }

    public Banco(int numeroDaConta, String nome, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        fazerDeposito(depositoInicial);
    }

    public Banco(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void fazerDeposito(double deposito) {
        this.saldo+= deposito;        
    }

    public void fazerSaque(double saque) {      
        saldo -= saque + 5.00;        
    }

    public String toString() {
        return "Conta: " + numeroDaConta + "\n" + "Nome: " + nome + "\n" 
        + "Saldo da conta: R$" + String.format("%.2f%n", saldo);
    }
}
