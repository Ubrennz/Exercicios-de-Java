import util.Tarefas;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarefas tarefas;
        List<Tarefas> listaTarefas = new ArrayList<>();

        int opcao;
        String tituloDaTarefa, tarefa;

        do {
            System.out.println("[1] para adicionar uma tarefa á lista\n[2] para remover uma tarefa pelo nome");
            System.out.println("[3] para exibir todas as tarefas cadastradas\n[4] para sair");
            System.out.print("Digite a opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                System.out.print("Digite o título da tarefa: ");
                tituloDaTarefa = sc.nextLine();
                System.out.print("Digite a tarefa: ");
                tarefa = sc.nextLine();
                
                tarefas = new Tarefas(tituloDaTarefa, tarefa);
                listaTarefas.add(tarefas);
                break;

                case 2:
                    System.out.print("Digite o título da tarefa que você deseja remover: ");
                    String removerTarefa = sc.nextLine();

                    int count = 0;
                                        
                    for (Tarefas tarefaCriada : listaTarefas) {
                        if (tarefaCriada.getTituloDatarefa().equalsIgnoreCase(removerTarefa)) {
                            listaTarefas.remove(tarefaCriada);
                            System.out.printf("Tarefa %s removida com sucesso!\n", removerTarefa);
                            count ++;                           
                            break;
                        }
                        else if (tarefaCriada.getTituloDatarefa() != removerTarefa) {
                            count ++;

                            if (count >= listaTarefas.size()) {
                                System.out.println("Essa tarefa não existe!");
                                break;
                            }
                        }
                    }
                    break;

                case 3:
                    for (Tarefas lista : listaTarefas) {
                        System.out.print(lista.toString());
                    }
                    break;
            }
        } while (opcao != 4);


        sc.close();
    }   
}
