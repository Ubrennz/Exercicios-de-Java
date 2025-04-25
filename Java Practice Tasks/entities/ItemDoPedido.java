package entities;

public class ItemDoPedido {
    private Integer quantidade;
    private Double preco;

    private Produto2 produto2;

    public ItemDoPedido(Integer quantidade, Double preco, Produto2 produto2) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto2 = produto2;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto2 getProduto2() {
        return produto2;
    }

    public void setProduto2(Produto2 produto2) {
        this.produto2 = produto2;
    }

    public Double subTotal() {
        return quantidade * preco;
    }
}
