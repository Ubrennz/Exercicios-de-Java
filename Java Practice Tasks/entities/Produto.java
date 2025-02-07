package entities;

public class Produto {
    public String nome;
    public Double preco;
    public int quantidade;
    
    public double totalValorEstoque() {
        double total = preco * quantidade;
        return total;
    }

    public void addQtde(int valorParaSerAdd) {
        int qtde = quantidade += valorParaSerAdd;
        System.out.printf("Produto: %s%nPreço: %.2f%nQuantidade: %d%n", nome, preco, qtde);
    }

    public void removerQtde(int valorParaSerRemovido) {
        int qtde = quantidade -= valorParaSerRemovido;
        System.out.printf("Produto: %s%nPreço: %.2f%nQuantidade: %d%n", nome, preco, qtde);
    }
} 
