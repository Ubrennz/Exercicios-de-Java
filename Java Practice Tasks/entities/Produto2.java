package entities;

public class Produto2 {
    private String nomeProduto;
    private Double precoProduto;

    public Produto2(String nomeProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getnomeProduto() {
        return nomeProduto;
    }

    public void setnomeProduto(String nomeProduto) {
        this.nomeProduto = this.nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
