package entities;

public class Hotel {
    private String nome;
    private String email;
    private int numeroDoQuarto;
    
    public Hotel(String nome, String email, int numeroDoQuarto) {
        this.nome = nome;
        this.email = email;
        this.numeroDoQuarto = numeroDoQuarto;      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String novoEmail) {
        email = novoEmail;
    }

    public int getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public void setNumeroDoQuarto(int novoNumeroDoQuarto) {
        numeroDoQuarto = novoNumeroDoQuarto;
    }

    public String toString() {
        return "Nome: " + nome
        + ", email: " + email
        + ", número do quarto: " + numeroDoQuarto;
    }
}
