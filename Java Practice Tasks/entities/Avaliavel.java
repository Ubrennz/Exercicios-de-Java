package entities;

public interface Avaliavel {
    double getNota();

    default boolean isAprovado(double notaMinima) {
        return notaMinima < getNota();
    }
}
