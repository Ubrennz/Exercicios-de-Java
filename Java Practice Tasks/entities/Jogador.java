package entities;

public class Jogador implements Comparable<Jogador> {
    private String nickName;
    private Double horasDeJogo;
    private Integer numeroDejogosNaConta;

    public Jogador(String nickName, Double horasDeJogo, Integer numeroDejogosNaConta) {
        this.nickName = nickName;
        this.horasDeJogo = horasDeJogo;
        this.numeroDejogosNaConta = numeroDejogosNaConta;
    }

    public String getNickName() {
        return nickName;
    }

    public Double getHorasDeJogo() {
        return horasDeJogo;
    }

    public Integer getNumeroDejogosNaConta() {
        return numeroDejogosNaConta;
    }

    @Override
    public int compareTo(Jogador jogador) {
        return -horasDeJogo.compareTo(jogador.getHorasDeJogo());
    }

    @Override
    public String toString() {
        return nickName + ", " + horasDeJogo + "hs, " + numeroDejogosNaConta + " jogos";
    }
}
