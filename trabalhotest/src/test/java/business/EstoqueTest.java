package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {
    private Estoque estoque;

    @BeforeEach
    void setUp() {
        estoque = new Estoque();
        estoque.adicionarProduto("Arroz", 100);
    }

    @Test
    void testAdicionarProduto() {
        estoque.adicionarProduto("Feijão", 50);
        assertEquals(50, estoque.verificarQuantidade("Feijão"));
    }

    @Test
    void testReduzirProduto() {
        estoque.reduzirProduto("Arroz", 10);
        assertEquals(90, estoque.verificarQuantidade("Arroz"));
    }

    @Test
    void testVerificarQuantidade() {
        assertEquals(100, estoque.verificarQuantidade("Arroz"));
    }
}
