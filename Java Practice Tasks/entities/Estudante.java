package entities;

public class Estudante implements Avaliavel, Comparable<Estudante> {
    private String nome;
    private double nota;

    public Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Estudante estudante) {
        return -Double.compare(nota, estudante.getNota());
    }

    @Override
    public String toString() {
        return nome + ", nota: " + nota;
    }
}
