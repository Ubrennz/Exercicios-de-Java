package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto3 {
    private LocalDate dataDeFabricacao;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, LocalDate dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public LocalDate getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiquetaDoProduto() {
        return super.getNome() + " (usado), R$" + String.format("%.2f", super.getPreco())
                + ", Data de fabricação: " + dataDeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
