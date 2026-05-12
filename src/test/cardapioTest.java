package test;

import main.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {

    @Test
    void deveRetornarEstruturaDoCardapio() {
        Categoria categoria1 = new Categoria("Combos");

        Categoria categoria2 = new Categoria("Lanches");
        Produto produto21 = new Produto("X-Burguer", 25.90);
        categoria2.addItem(produto21);

        Categoria categoria3 = new Categoria("Bebidas");
        Produto produto31 = new Produto("Coca-Cola 350ml", 7.00);
        Produto produto32 = new Produto("Suco de Laranja", 9.50);
        categoria3.addItem(produto31);
        categoria3.addItem(produto32);

        Categoria estrutura = new Categoria("Menu Completo");
        estrutura.addItem(categoria1);
        estrutura.addItem(categoria2);
        estrutura.addItem(categoria3);

        Cardapio cardapio = new Cardapio();
        cardapio.setEstrutura(estrutura);

        assertEquals("Categoria: Menu Completo\n" +
                "Categoria: Combos\n" +
                "Categoria: Lanches\n" +
                "Produto: X-Burguer - preço: R$ 25,90\n" +
                "Categoria: Bebidas\n" +
                "Produto: Coca-Cola 350ml - preço: R$ 7,00\n" +
                "Produto: Suco de Laranja - preço: R$ 9,50\n", cardapio.getCardapio());
    }

    @Test
    void deveRetornarExcecaoCardapioSemEstrutura() {
        try {
            Cardapio cardapio = new Cardapio();
            cardapio.getCardapio();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cardápio sem estrutura definida", e.getMessage());
        }
    }
}