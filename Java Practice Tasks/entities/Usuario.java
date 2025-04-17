package entities;

import entities.enums.NivelAcesso;

public class Usuario {
    private String nome;
    private String email;
    private NivelAcesso nivelDeAcesso;

    public Usuario(String nome, String email, NivelAcesso nivelDeAcesso) {
        this.nome = nome;
        this.email = email;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NivelAcesso getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(NivelAcesso nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Nivel de acesso: " + nivelDeAcesso;
    }
}
