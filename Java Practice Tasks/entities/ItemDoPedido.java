package entities;

public class ItemDoPedido {
    private Integer quantidadeItemDoPedido;
    private Double precoItemDoPedido;

    private Produto2 produto2;

    public ItemDoPedido(Integer quantidadeItemDoPedido, Double precoItemDoPedido, Produto2 produto2) {
        this.quantidadeItemDoPedido = quantidadeItemDoPedido;
        this.precoItemDoPedido = precoItemDoPedido;
        this.produto2 = produto2;
    }

    public Integer getQuantidadeItemDoPedido() {
        return quantidadeItemDoPedido;
    }

    public void setQuantidadeItemDoPedido(Integer quantidadeItemDoPedido) {
        this.quantidadeItemDoPedido = quantidadeItemDoPedido;
    }

    public Double getPrecoItemDoPedido() {
        return precoItemDoPedido;
    }

    public void setPrecoItemDoPedido(Double precoItemDoPedido) {
        this.precoItemDoPedido = precoItemDoPedido;
    }

    public Produto2 getProduto2() {
        return produto2;
    }

    public void setProduto2(Produto2 produto2) {
        this.produto2 = produto2;
    }

    public String toString() {
        return produto2.getnomeProduto() + ", R$" + produto2.getPrecoProduto()
                + ", Quantidade: " + quantidadeItemDoPedido + ", Subtotal: " + subTotal();
    }

    public Double subTotal() {
        return quantidadeItemDoPedido * precoItemDoPedido;
    }
}
