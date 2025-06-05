package entities;

import exceptions.LimiteDeSaqueException;

public class Account {
    private Integer numeroDaConta;
    private String titularDaConta;
    private Double saldoDaConta;
    private Double limiteDeSaque;

    public Account(Integer numeroDaConta, String titularDaConta, Double saldoDaConta, Double limiteDeSaque) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldoDaConta = saldoDaConta;
        this.limiteDeSaque = limiteDeSaque;
    }

    public void deposito(Double saldoDoDeposito){
        saldoDaConta += saldoDoDeposito;
    }

    public void saque(Double saldoParaSaque) throws LimiteDeSaqueException {
        if (saldoParaSaque > limiteDeSaque) {
            throw new LimiteDeSaqueException("O Saldo para saque ultrapassa o limite de saque");
        }

        if (saldoDaConta == null || saldoParaSaque > saldoDaConta) {
            throw new LimiteDeSaqueException("Saldo insuficiente");
        }

        saldoDaConta -= saldoParaSaque;
    }

    @Override
    public String toString() {
        return "Número: " + numeroDaConta
                + ", Títular: " + titularDaConta
                + ", Saldo: " + String.format("%.2f", saldoDaConta)
                + ", Limite de saque: " + String.format("%.2f", limiteDeSaque);
    }
}
