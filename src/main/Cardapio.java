package main;

public class Cardapio {

    private ItemCardapio estrutura;

    public void setEstrutura(ItemCardapio estrutura) {
        this.estrutura = estrutura;
    }

    public String getCardapio() {
        if (this.estrutura == null) {
            throw new NullPointerException("Cardápio sem estrutura definida");
        }
        return this.estrutura.getConteudo();
    }
}