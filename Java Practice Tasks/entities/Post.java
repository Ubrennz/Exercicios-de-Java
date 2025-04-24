package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class Post {
    private static DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy kk:mm:ss");

    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comentarios = new ArrayList<>();

    public Post(LocalDateTime momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(titulo);
        sb.append("\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(momento.format(formatacao));
        sb.append("\n");
        sb.append(conteudo);
        sb.append("\n");
        sb.append("Comentários:");
        sb.append("\n");

        for (Comentario comentario : comentarios) {
            sb.append(comentario.getTexto());
            sb.append("\n");
        }

        return sb.toString();
    }
}
