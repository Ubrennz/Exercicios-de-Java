package entities;

public class Produto3 implements Comparable<Produto3> {
    private String nome;
    private Double preco;

    public Produto3() {

    }

    public Produto3(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String etiquetaDoProduto() {
        return nome + ", R$" + String.format("%.2f", preco);
    }

    @Override
    public int compareTo(Produto3 produto3) {
        return nome.compareToIgnoreCase(produto3.getNome());
    }


}
