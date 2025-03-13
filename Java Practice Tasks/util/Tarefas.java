package util;

public class Tarefas {
    public String tituloDaTarefa;
    public String tarefa;

    public Tarefas(String tituloTarefa, String tarefa) {
        this.tituloDaTarefa = tituloTarefa;
        this.tarefa = tarefa;
    }

    public String getTituloDatarefa() {
        return tituloDaTarefa;
    }

    public String getTarefa() {
        return tarefa;
    }

    public String toString() {
        return "\n" + "Título: " 
        + tituloDaTarefa 
        + "\n" 
        + tarefa
        + "\n";
    }
}
