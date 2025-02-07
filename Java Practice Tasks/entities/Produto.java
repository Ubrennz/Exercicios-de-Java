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
        quantidade += valorParaSerAdd;
        System.out.printf("Lista atualiada\nProduto: %s%nPreço: %.2f%nQuantidade: %d%n", nome, preco, quantidade);
        System.out.println("Valor total: " + totalValorEstoque());
    }

    public void removerQtde(int valorParaSerRemovido) {
        quantidade -= valorParaSerRemovido;
        System.out.printf("Lista atualizada\nProduto: %s%nPreço: %.2f%nQuantidade: %d%n", nome, preco, quantidade);
        System.out.println("Valor total: " + totalValorEstoque());
    }
} 
