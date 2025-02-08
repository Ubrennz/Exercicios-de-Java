package entities;

public class Produto {
    public String nome;
    public Double preco;
    public int quantidade;
    
    public double totalValorEstoque() {
        double total = preco * quantidade;
        return total;
    }

    public void addQtde(int quantidade) {
        this.quantidade += quantidade;         
    }

    public void removerQtde(int quantidade) {
        this.quantidade -= quantidade;        
    }

    public String toString() {
        return nome + ", R$" + String.format("%.2f", preco) 
        + ", quantidade: " + quantidade 
        +", valor total: "  + String.format("%.2f", totalValorEstoque());
    }
} 
