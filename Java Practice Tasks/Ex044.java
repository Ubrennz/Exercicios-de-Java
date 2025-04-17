import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Usuario;
import entities.enums.NivelAcesso;

public class Ex044 {
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    public static void criarUsario(String nome, String email, NivelAcesso nivelDeAcesso) {
        Usuario usuarios = new Usuario(nome, email, nivelDeAcesso);
        listaUsuarios.add(usuarios);
        System.out.printf("Usuário %s cadastrado com sucesso!\n", nome);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos usuários serão adicionados: ");
        int loop = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < loop; i++) {
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite o email: ");
            String email = sc.next();

            int opcao;

            do {
                System.out.println("Digite o nivel de acesso do usuário");
                System.out.print("[1] Para Adiministrador\n[2] Para Moderador\n[3] Para Usuário Comum\nDigite a opção: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        criarUsario(nome, email, NivelAcesso.ADMINISTRADOR);
                        break;
                    case 2:
                        criarUsario(nome, email, NivelAcesso.MODERADOR);
                        break;
                    case 3:
                        criarUsario(nome, email, NivelAcesso.USUARIO_COMUM);
                        break;
                    default:
                        System.out.println("Opção invalida, tente novamente!");
                        break;
                }
            } while (opcao != 1 && opcao != 2 && opcao != 3);
        }

        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.toString());
        }

        sc.close();
    }
}
