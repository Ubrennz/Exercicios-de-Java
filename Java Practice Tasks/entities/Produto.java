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
        System.out.printf("Produto: %s%nPreço: %.2f%nQuantidade: %d%n", nome, preco, quantidade);
    }

    public void removerQtde(int valorParaSerRemovido) {
        quantidade -= valorParaSerRemovido;        
    }
} 
