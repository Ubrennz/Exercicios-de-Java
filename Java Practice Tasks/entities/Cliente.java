package entities;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate aniversario;

    public Cliente(String nome, String email, LocalDate aniversario) {
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
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

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }
}
