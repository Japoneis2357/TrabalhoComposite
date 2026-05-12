package main;

public class Produto extends ItemCardapio {

    private double preco;

    public Produto(String descricao, double preco) {
        super(descricao);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getConteudo() {
        return "Produto: " + this.getDescricao() + " - preço: R$ " + String.format("%.2f", this.preco) + "\n";
    }

}