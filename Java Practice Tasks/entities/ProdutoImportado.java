package entities;

public class ProdutoImportado extends Produto3 {
    private Double taxaDaAlfandega;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaDaAlfandega) {
        super(nome, preco);
        this.taxaDaAlfandega = taxaDaAlfandega;
    }

    public Double getTaxaDaAlfandega() {
        return taxaDaAlfandega;
    }

    public void setTaxaDaAlfandega(Double taxaDaAlfandega) {
        this.taxaDaAlfandega = taxaDaAlfandega;
    }

    public Double precoTotal() {
        return super.getPreco() + taxaDaAlfandega;
    }

    @Override
    public String etiquetaDoProduto () {
        return super.getNome() + ", R$" + String.format("%.2f", precoTotal()) + ", Taxa da Alfândega: " + taxaDaAlfandega;
    }
}
