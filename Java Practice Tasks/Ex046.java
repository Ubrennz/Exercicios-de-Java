import entities.Post;
import entities.Comentario;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Ex046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime momento = LocalDateTime.parse("2018-06-21T13:05:44");
        String titulo = "Viajando para Nova Zelândia";
        String conteudo = "Estou vianjando para esse país maravilhoso!";
        int likes = 12;

        Post post1 = new Post(momento, titulo, conteudo, likes);
        post1.adicionarComentario(new Comentario("Tenha uma ótima viagem!"));
        post1.adicionarComentario(new Comentario("Isso é incrivel!"));

        momento = LocalDateTime.parse("2018-07-21T23:07:07");
        titulo = "Boa noite galera!";
        conteudo = "Vejo vcs amanhã!";
        likes = 5;

        Post post2 = new Post(momento, titulo, conteudo, likes);
        post2.adicionarComentario(new Comentario("Boa noite!"));
        post2.adicionarComentario(new Comentario("Que a força esteja com vc!"));

        System.out.print(post1);
        System.out.println();
        System.out.println(post2);

        sc.close();
    }
}
